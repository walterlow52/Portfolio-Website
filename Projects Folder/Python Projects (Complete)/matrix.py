import turtle
turtle.bgcolor("black")
spiral = turtle.Turtle()
spiral.speed(20)
spiral.pencolor("red")
for i in range(400):
	spiral.forward(i)
	spiral.left(91)