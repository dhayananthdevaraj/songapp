import React, { useState } from 'react';


const AlbumForm = ({ onAlbumSubmit }) => {
  const [albumData, setAlbumData] = useState({ id: '', name: '', song: '', releaseYear: '' });

  const handleSubmit = (e) => {
    e.preventDefault();
    onAlbumSubmit(albumData);
    setAlbumData({ id: '', name: '', song: '', releaseYear: '' }); // Clear the form after submission
  };

  return (
    <div className="album-form-container">
      <h2 className="form-heading">Note Your Favorite</h2>
      <h3 className="form-subheading">Here...</h3>
      <form onSubmit={handleSubmit} className="form">
        <input
          type="number"
          placeholder="ID"
          className="form-input"
          value={albumData.id}
          onChange={(e) => setAlbumData({ ...albumData, id: e.target.value })}
        />
        <input
          type="text"
          placeholder="Album Name"
          className="form-input"
          value={albumData.name}
          onChange={(e) => setAlbumData({ ...albumData, name: e.target.value })}
        />
        <input
          type="text"
          placeholder="Song Name"
          className="form-input"
          value={albumData.song}
          onChange={(e) => setAlbumData({ ...albumData, song: e.target.value })}
        />
        <input
          type="text"
          placeholder="Release Year"
          className="form-input"
          value={albumData.releaseYear}
          onChange={(e) => setAlbumData({ ...albumData, releaseYear: e.target.value })}
        />
        <button type="submit" className="form-submit-button">
          Add Song
        </button>
      </form>
    </div>
  );
};

export default AlbumForm;
