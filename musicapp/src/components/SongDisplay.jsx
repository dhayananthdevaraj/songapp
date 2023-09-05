import React, { useState, useEffect } from 'react';


const SongDisplay = () => {
  const [songs, setSongs] = useState([]);

  const fetchSongs = () => {
    // Fetch all songs from your Spring Boot backend.
    // Replace this with your actual API endpoint.
    fetch('http://localhost:8080/getAllSong')
      .then((response) => response.json())
      .then((data) => {
        setSongs(data);
      })
      .catch((error) => {
        console.error('Error fetching songs:', error);
      });
  };

  useEffect(() => {
    // Fetch songs when the component mounts
    fetchSongs();
  }, []);

  return (
    <div className="song-display-container">
      <h2 className="playlist-heading">Own Playlist</h2>
      <table className="song-table">
        <thead>
          <tr>
            <th>Id</th>
            <th>Album Name</th>
            <th>Song</th>
            <th>Year</th>
          </tr>
        </thead>
        <tbody>
          {songs.map((song) => (
            <tr key={song.id}>
              <td>{song.id}</td>
              <td>{song.name}</td>
              <td>{song.song}</td>
              <td>{song.releaseYear}</td>
            </tr>
          ))}
        </tbody>
      </table>
    </div>
  );
};

export default SongDisplay;
