package robothead;

import processing.core.PApplet;


public class RobotHead extends PApplet {

	public void setup() {
		size(700, 800);
		background(255,255,255);
	}

	public void draw() {
		face(100,300);
	}
	public void face(float xPos, float yPos){
		fill(0, 149, 185);
		rect(xPos, yPos, 500, 300);
		eyes(xPos + 100, yPos + 100);
		mouth(xPos + 150, yPos + 200);
		leftEar(xPos - 25, yPos + 100);
		rightEar(xPos + 500, yPos +100);
	}
	public void eyes(float eyesX, float eyesY){
		fill(255, 255, 255);
		ellipse (eyesX, eyesY, 100, 100);
		ellipse(eyesX + 300, eyesY, 25, 25);
		
			
		
		
	}
	public void mouth(float mouthX, float mouthY){
		fill(255,255,255);
		triangle(mouthX, mouthY, mouthX + 250, mouthY, mouthX + 100, mouthY + 75);
	}
	public void leftEar(float earX, float earY){
		fill(244 , 121, 0);
		rect(earX, earY, 25, 100);
		rect(earX-25, earY + 12, 25, 75);
		rect(earX-50, earY + 24, 25, 50);
		line(earX - 38, earY + 25, earX - 38, earY-200);
		fill(255,255,255);
		ellipse(earX-38, earY - 200, 30, 30);
	}
	public void rightEar(float rearX, float rearY){
		fill(244, 121, 0);
		rect(rearX, rearY, 25, 100);
		rect(rearX + 25, rearY + 12, 25, 75);
		rect(rearX+50, rearY+ 25,25,50);
		line(rearX + 62, rearY + 25, rearX + 62, rearY-200);
		fill(255,255,255);
		ellipse(rearX +62, rearY - 200, 30, 30);
	}
}
