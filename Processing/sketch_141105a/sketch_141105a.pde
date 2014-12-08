Ball[] balls = new Ball[1020];
void setup()
{
  size(500, 500);
  background(1);
  for (int i = 0; i<balls.length; i++)
  {
   balls[i] = new Ball();
  }
}

void draw()
{
  background(1);
  ellipse(20, 20, 20, 20);
  for (int i = 0; i<balls.length; i++)
  {
   balls[i].move();
  }
}
