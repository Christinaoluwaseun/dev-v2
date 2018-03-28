package com.christinaonasanwo.theo.playlist;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.christinaonasanwo.theo.data.IDataManager;
import com.christinaonasanwo.theo.music.Music;
import com.christinaonasanwo.theo.user.User;
import com.christinaonasanwo.theo.user.UserDAO;

public class PlaylistDAO implements IPlayListDAO{
	
	private IDataManager dataManager;
	
	private final Logger LOG = LogManager.getLogger(PlaylistDAO.class);
	
	public PlaylistDAO(IDataManager dataManager) {
		this.dataManager = dataManager;
	}

	
	@Override
	public ArrayList<Playlist> getAllPlaylist() {
		ArrayList<Playlist> playList = null;
		Connection connection = null;
		
		try {
			connection = dataManager.getConnectionObject();
			
			Statement statement = connection.createStatement();
			statement.setQueryTimeout(30);
			
			ResultSet results = statement.executeQuery("select * from playlist");
			playList  = new ArrayList<Playlist>();
			while(results != null && results.next()) {
				Playlist playlist = new Playlist(
						results.getInt("playlist"),
						results.getInt("SongName"),
						results.getInt("artist"));
				
				playList.add(playlist);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return playList;
	
	}

	@Override
	public User getPlaylist(int playlistID) {
		throw new UnsupportedOperationException();
	}

	@Override
	public int addPlaylist(Playlist playList) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void updatePlaylist(Playlist playList) {
		throw new UnsupportedOperationException();
		
	}

	@Override
	public void deletePlaylist(Playlist playList) {
		throw new UnsupportedOperationException();
		
	}

	@Override
	public int printPlaylist(Playlist playList) {
		throw new UnsupportedOperationException();
	}


	@Override
	public ArrayList<Playlist> getAllplayList() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
}
