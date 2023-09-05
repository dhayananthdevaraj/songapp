import './App.css';
import AlbumForm from './components/AlbumForm';
import Headers from './components/Headers';
import SongDisplay from './components/SongDisplay';

function App() {
  // Define the function to handle album submission
  const handleAlbumSubmit = (albumData) => {
    // Send a POST request to your backend API with the album data
    fetch('http://localhost:8080/addSong', {
      method: 'POST',
      headers: {
        'Content-Type': 'application/json',
      },
      body: JSON.stringify(albumData),
    })
      .then((response) => response.json())
      .then((data) => {
        // Handle the response from the server if needed
        console.log('New album added:', data);
        // You can also update the album list here if required
      })
      .catch((error) => {
        console.error('Error adding a new album:', error);
      });
  };

  return (
    <div className="App">
      <Headers />
      <AlbumForm onAlbumSubmit={handleAlbumSubmit} />
      <SongDisplay />
    </div>
  );
}

export default App;