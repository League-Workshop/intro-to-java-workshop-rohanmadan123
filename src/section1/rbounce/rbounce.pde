int xPos = 500;
int yPos = 500;
int xSpeed = 3;
int ySpeed = 4;

PImage jellyfish;
PImage emoji;

void setup() {
  size(700, 700);
  jellyfish = loadImage("jellyfish.jpeg");
  emoji = loadImage("smiley.jpeg");
}
void draw() {
  background(#21E82C);
  image(jellyfish, 0, 0, 700, 700);
  image(emoji, xPos, yPos);
  
 if(mouseButton == LEFT
  
  if (xPos > 700){
    xSpeed = -xSpeed;
  }
  
  if (xPos < 0){
    xSpeed = -xSpeed;
  }
  
  if (yPos > 700){
    ySpeed = -ySpeed;
  }
  
  if (yPos < 0){
    ySpeed = -ySpeed;
  }
    
    
  xPos = xPos + xSpeed;
  yPos = yPos + ySpeed;
}
