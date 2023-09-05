import React from 'react';

const Headers = () => {
  const handleRefreshClick = () => {
    // Reload the current page to refresh the window
    window.location.reload();
  };
  return (
    <header className='header'>
      <h1>My Music Library</h1>
      <button className="refresh-button" onClick={handleRefreshClick}>
        Refresh
      </button>
    </header>
  );
};

export default Headers;
