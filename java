const imagePaths = [
  'https://drive.google.com/uc?export=view&id=1LEzRkw6nLhuFcdYdUGcL34sZMcRq86sK',
  'https://drive.google.com/uc?export=view&id=1LEzRkw6nLhuFcdYdUGcL34sZMcRq86sK',
  'https://drive.google.com/uc?export=view&id=1LEzRkw6nLhuFcdYdUGcL34sZMcRq86sK',
  'https://drive.google.com/uc?export=view&id=1LEzRkw6nLhuFcdYdUGcL34sZMcRq86sK',
  'https://drive.google.com/uc?export=view&id=1LEzRkw6nLhuFcdYdUGcL34sZMcRq86sK',
  'https://drive.google.com/uc?export=view&id=1LEzRkw6nLhuFcdYdUGcL34sZMcRq86sK',
  'https://drive.google.com/uc?export=view&id=1LEzRkw6nLhuFcdYdUGcL34sZMcRq86sK',
  'https://drive.google.com/uc?export=view&id=1LEzRkw6nLhuFcdYdUGcL34sZMcRq86sK',
  'https://drive.google.com/uc?export=view&id=1LEzRkw6nLhuFcdYdUGcL34sZMcRq86sK',
  'https://drive.google.com/uc?export=view&id=1LEzRkw6nLhuFcdYdUGcL34sZMcRq86sK',
  'https://drive.google.com/uc?export=view&id=1LEzRkw6nLhuFcdYdUGcL34sZMcRq86sK',
  'https://drive.google.com/uc?export=view&id=1LEzRkw6nLhuFcdYdUGcL34sZMcRq86sK',
  'https://drive.google.com/uc?export=view&id=1LEzRkw6nLhuFcdYdUGcL34sZMcRq86sK',
  'https://drive.google.com/uc?export=view&id=1LEzRkw6nLhuFcdYdUGcL34sZMcRq86sK',

];

function showRandomImage() {
  const randomIndex = Math.floor(Math.random() * imagePaths.length);
  const selectedImage = imagePaths[randomIndex];
  document.getElementById('randomImage').src = selectedImage;
}
