package com.christinaonasanwo.theo.music;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.christinaonasanwo.theo.data.IDataManager;
import com.christinaonasanwo.theo.user.UserDAO;

public class MusicDAO implements IMusicDAO{

	private IDataManager dataManager;
	
	private final Logger LOG = LogManager.getLogger(MusicDAO.class);
	
	public MusicDAO(IDataManager dataManager) {
		this.dataManager = dataManager;
	}
	
	
	@Override
	public ArrayList<Music> getAllMusic() {
		ArrayList<Music> musicList = null;
		Connection connection = null;
		
		try {
			connection = dataManager.getConnectionObject();
			
			Statement statement = connection.createStatement();
			statement.setQueryTimeout(30);
			
			ResultSet results = statement.executeQuery("select * from music");
			musicList  = new ArrayList<Music>();
			while(results != null && results.next()) {
				Music music = new Music(
						results.getInt("ID"),
						results.getString("SongName"),
						results.getString("artist"),
						results.getString("url")
						);
				
				musicList.add(music);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return musicList;
	}

	@Override
	public Music getMusic(int musicId) {
		throw new UnsupportedOperationException();
	}

	@Override
	public int addMusic(Music aMusic) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void updateMusic(Music aMusic) {
		throw new UnsupportedOperationException();
		
	}

	@Override
	public void deleteMusic(Music aMusic) {
		throw new UnsupportedOperationException();
		
	}

	@Override
	public String printMusic(int musicID) {
		throw new UnsupportedOperationException();
	}

}
