import random

chars = ['1', '2', '3', '4', '5', '6', '7', '8', '9', '0']

code = " "

for i in range(6):
	code = code + random.choices(chars)[0]

print("Your One-Time-Code is:\n", code)