import processing.core.PApplet;

public class Sketch extends PApplet {

  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
    // put your size call here
    size(600, 600);
  }

  /**
   * Called once at the beginning of execution. Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    // Green background
    background(210, 255, 173);

    // Blue background
    noStroke();
    fill(153, 204, 255);
    rect(0, 0, width / 1f, height / 2f);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {

    // Cloud #1
    noStroke();
    fill(255, 255, 255);
    ellipse(width / 6f, height / 8f, width / 15f, height / 15f);
    ellipse(width / 5.2f, height / 6.7f, width / 15f, height / 15f);
    ellipse(width / 7.05f, height / 6.5f, width / 15f, height / 15f);
    ellipse(width / 5f, height / 8f, width / 15f, height / 15f);
    ellipse(width / 4.4f, height / 6.7f, width / 15f, height / 15f);

    // Cloud 2
    noStroke();
    fill(255, 255, 255);
    ellipse(width / 1.3f, height / 5.2f, width / 15f, height / 15f);
    ellipse(width / 1.29f, height / 4.6f, width / 15f, height / 15f);
    ellipse(width / 1.38f, height / 4.6f, width / 15f, height / 15f);
    ellipse(width / 1.27f, height / 5.2f, width / 15f, height / 15f);
    ellipse(width / 1.2f, height / 4.6f, width / 15f, height / 15f);

    // House Structure (Rectangle and Triangle)
    noStroke();
    fill(102, 0, 0);
    rect(height / 4f, width / 2.4f, width / 2.4f, height / 3f);

    noStroke();
    fill(153, 0, 0);
    triangle(width / 4f, height / 2.4f, width / 1.5f, height / 2.4f, width / 2.2f, height / 6f);

    // Door
    stroke(0, 0, 0);
    fill(153, 76, 0);
    rect(width / 2.2f, height / 1.7f, width / 9.2f, height / 6f);

    // Doorknob
    fill(204, 204, 0);
    ellipse(width / 1.8f, height / 1.5f, width / 60f, height / 60f);

    // Sun
    fill(255, 255, 51);
    ellipse(width / 1f, 0, width / 6f, height / 6f);

  }

  // define other methods down here.
}