class Ball
{
//instance variables
int x, y;
int xSpeed, ySpeed;
int red, green, blue;
int ballW, ballH;

//constructors
public Ball()
{
x = (int)random(width);
y = (int)random(height);
ballW = (int)random(90)+10;
ballH = (int)random(90)+10;
red = (int)random(255);
green = (int)random(255);
blue = (int)random(255);
xSpeed = (int)random(100)+1;
ySpeed = (int)random(100)+1;
}
//
//methords
public void move()
{
   fill(red, green, blue);
   x += xSpeed;
   if (x > 0)
   {
     xSpeed = -1 * xSpeed;
   }
   else if (x <= 0 && xSpeed < 0)
   {
     xSpeed = -1 * xSpeed;
   }
   y += ySpeed;
   if (ySpeed > 0)
   {
     ySpeed = -1 * ySpeed;
   }
   else if (y <= 0 && ySpeed < 0)
   {
     ySpeed = -1 * ySpeed;
   }
   ellipse(x, y, ballW, ballH);
}
}
