import tkinter as tk
import time
import math

WIDTH = 400
HEIGHT = 400

root = tk.Tk()
root.title("Clock")
canvas = tk.Canvas(root, width = WIDTH, height = HEIGHT, bg = "black")
canvas.pack()

def update():
	canvas.delete("all")
	currentTime = time.localtime()
	hr = currentTime.tm_hour % 12
	min = currentTime.tm_min
	sec = currentTime.tm_sec

	canvas.create_oval(2, 2, WIDTH, HEIGHT, outline = "lime", width = 2)
	
	for i in range(12):
		angle = i * math.pi/6 - math.pi/2
		x = WIDTH/2 + 0.7 * WIDTH/2 * math.cos(angle)
		y = HEIGHT/2 + 0.7 * HEIGHT/2 * math.sin(angle)
		if i == 0:
			canvas.create_text(x, y-10, text = str(i+12), font = ("Times New Roman", 12))
		else:
			canvas.create_text(x, y, text = str(i), font = ("Times New Roman", 12))

	for i in range(60):
		angle = i * math.pi/30 - math.pi/2
		x = WIDTH/2 + 0.8 * WIDTH/2 * math.cos(angle)
		y = HEIGHT/2 + 0.8 * HEIGHT/2 * math.sin(angle)
		xx = WIDTH/2 + 0.9 * WIDTH/2 * math.cos(angle)
		yy = HEIGHT/2 + 0.9 * HEIGHT/2 * math.sin(angle)
		if i % 5 == 0:
			canvas.create_line(x, y, xx, yy, fill = "lime", width = 3)
		else:
			canvas.create_line(x, y, xx, yy, fill = "lime", width = 1)

	hr_angle = (hr + min/60) * math.pi/6 - math.pi/2
	hr_x = WIDTH/2 + 0.5 * WIDTH/2 * math.cos(hr_angle)
	hr_y = HEIGHT/2 + 0.5 * HEIGHT/2 * math.sin(hr_angle)
	canvas.create_line(WIDTH/2, HEIGHT/2, hr_x, hr_y, fill = "lime", width = 6)

	min_angle = (min + sec/60) * math.pi/30 - math.pi/2
	min_x = WIDTH/2 + 0.7 * WIDTH/2 * math.cos(min_angle)
	min_y = HEIGHT/2 + 0.7 * HEIGHT/2 * math.sin(min_angle)
	canvas.create_line(WIDTH/2, HEIGHT/2, min_x, min_y, fill = "lime", width = 4)

	sec_angle = sec * math.pi/30 - math.pi/2
	sec_x = WIDTH/2 + 0.6 * WIDTH/2 * math.cos(sec_angle)
	sec_y = HEIGHT/2 + 0.6 * HEIGHT/2 * math.sin(sec_angle)
	canvas.create_line(WIDTH/2, HEIGHT/2, sec_x, sec_y, fill = "cyan", width = 2)

canvas.after(1000, update)
update()
root.mainloop()