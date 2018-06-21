PImage catPic;
int x = 382;
int y = 176;
void setup(){
size(700,400);
  catPic = loadImage("cat.jpg");
catPic.resize(width,height);
background(catPic);
}
void draw(){ if(mousePressed){
println("Mouse’s x-position: " + mouseX + "\n" + "Mouse’s y-position: " + mouseY + "\n");}
fill(#FF0000);
noStroke();
ellipse(x,y,50,40);
ellipse(x+112,y,50,43);
}
 void keyPressed(){
 x = x+5;
 y = y+5;
 if(y>height){
x = 382;
y = 176;
 catPic = loadImage("cat.jpg");
catPic.resize(width,height);
background(catPic);  
 }
 }