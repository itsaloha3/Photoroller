const imagePaths = [
  'images/image1.jpg',
  'images/image2.jpg',
  'images/image3.jpg'
  // Add more image paths as needed
];

function showRandomImage() {
  const randomIndex = Math.floor(Math.random() * imagePaths.length);
  const selectedImage = imagePaths[randomIndex];
  document.getElementById('randomImage').src = selectedImage;
}
