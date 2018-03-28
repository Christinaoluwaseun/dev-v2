package com.christinaonasanwo.theo.playlist;

import java.util.ArrayList;

import com.christinaonasanwo.theo.user.User;

public interface IPlayListDAO {

	public ArrayList<Playlist> getAllPlaylist();
	public User getPlaylist(int playlistID);
	public int addPlaylist( Playlist playList);
	public void updatePlaylist( Playlist playList);
	public void deletePlaylist( Playlist playList);
	public int printPlaylist( Playlist playList);
	ArrayList<Playlist> getAllplayList();
	
}
