int x = 0;
int y = 10;
int xSpeed = 10;
int ySpeed = 50;
void setup()
{
  size(400, 400);
  background(0, 20, 230);
  fill(234, 234, 234);
}

void draw ()
{
   background(0, 20, 230);
   ellipse(x, 200, 100, 100);
   x = x + xSpeed;
   if ( xSpeed > 0 && x > 400)
   {
     xSpeed = -1 * xSpeed;
   }
   else if (x < 0)
   {
     xSpeed = -1 * xSpeed;
   }
    background(0, 20, 230);
    ellipse(y, 100, 100, 100);
    y = y + ySpeed;
    if (ySpeed > 0 && y > 400)
   {
     ySpeed = -1 * ySpeed;
   }
   else if (y < 0)
   {
     ySpeed = -1 * ySpeed;
   }
}
