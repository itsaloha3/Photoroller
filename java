const imagePaths = [
  'https://drive.google.com/uc?export=view&id=1a2b3c4D5EfGhIJ',
  'https://drive.google.com/uc?export=view&id=2B3c4D5EfGhIJ6a7b',
  'https://drive.google.com/uc?export=view&id=3c4D5EfGhIJ6a7b8c'
];

function showRandomImage() {
  const randomIndex = Math.floor(Math.random() * imagePaths.length);
  const selectedImage = imagePaths[randomIndex];
  document.getElementById('randomImage').src = selectedImage;
}
