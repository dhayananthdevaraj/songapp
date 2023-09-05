import { render, screen } from '@testing-library/react';
import App from '../App';

test('renders_My_Music_Library_Title', () => {
  render(<App />);
  const linkElement = screen.getByText(/My Music Library/i);
  expect(linkElement).toBeInTheDocument();
});
