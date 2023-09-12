txt = input("Enter a string for the pattern: ")
x = 0

for i in txt:
	x = x + 1
	print(txt[0:x])

for i in txt:
	x = x - 1
	print(txt[0:x])