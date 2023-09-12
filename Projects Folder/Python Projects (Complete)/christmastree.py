x = 34
i = 0

while x > 0 and i < 33:
	print('\33[1;32,48m' + ' ' * x + '*' + '*' * i + '\33[0m')
	x -= 1
	i += 2

for r in range(3):
	print(' ' * 33, '||')

print(' ' * 32, end = '\====/')
print('')