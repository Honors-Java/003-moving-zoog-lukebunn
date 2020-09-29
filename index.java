void setup() {
	size(300, 300);
}

void draw() {
	 // Draw a white background
  ellipseMode(CENTER);
  ellipse(mouseX, mouseY, 1, 1);
   //println(mouseX, mouseY);

  background(200);
  // Set CENTER mode
  ellipseMode(CENTER);
  rectMode(CENTER);
  // Draw Zoog's body
  stroke(0);
  fill(mouseX, 0, 0);
  rect(mouseX, mouseY,20,100);
  // Draw Zoog's head
  stroke(0);
  fill(mouseX, mouseY, 0);
  ellipse(mouseX, mouseY - 30,60,60);
  // Draw Zoog's eyes
  fill(0,mouseY, 0);

  // remove the forward slashes in front of each line of code below one at a time. Remove the underline and replace with the proper code to allow your mouse to move Zoog around  💻

  ellipse(mouseX -10, mouseY - 30,16,32);
  ellipse(mouseX +10, mouseY - 30,16,32);
   //Draw Zoog's legs
  stroke(0);
  line(mouseX - 10, mouseY + 50, mouseX - 20, mouseY + 70);
  line(mouseX + 10, mouseY + 50, mouseX + 20, mouseY + 70);
}

void mousePressed(){
  printIn("Take me to your leader");
  
 }