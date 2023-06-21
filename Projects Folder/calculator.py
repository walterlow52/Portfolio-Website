import math

def add(x, y):
	return x + y

def subtract(x, y):
	return x - y

def multiply(x, y):
	return x * y

def divide(x, y):
	return x / y

def pow(x, y):
	return math.pow(x, y)

def sqrt(x):
	return math.sqrt(x)

def absolute(x):
	return math.fabs(x)

def E(x):
	return math.exp(x)

def Ex_1(x):
	return math.expm1(x)

def sin(x):
	return math.sin(x)

def cos(x):
	return math.cos(x)

def tan(x):
	return math.tan(x)

def roundup(x):
	return math.ceil(x)

def rounddown(x):
	return math.floor(x)

def GCD(x, y):
	return math.gcd(x, y)

def radian_degree(x):
	return math.degrees(x)

def degree_radian(x):
	return math.radians(x)

def log(x):
	return math.log(x)

def log_10(x):
	return math.log10(x)

def operationsList():
	print("1. Addition\n2. Subtraction\n3. Multiplication\n4. Division\n5. Exponents(Power)\n6. Square Root\n7. Absolute Value\n8. E\n9. Ex-1\n10. Sine\n11. Cosine\n12. Tangent\n13. RoundUp\n14. RoundDown\n15. Greatest Common Denominator\n16. Radians to Degrees\n17. Degrees to Radians\n18. Logarithms\n19. Logarithms(10)\n")

print("\nWelcome to the Python Calculator! Please enter \'100\' for a reference list of the different operations available in this program.")
operation = 1
while(operation != 0):
	
	print("\n-------------------------------------------------------------------------------------------------------------------------------------\n")
	operation = int(input("(Enter \'0\' to quit the calculator)\n(Enter \'100\' for the operations list)\nPlease enter an operation by entering its corresponding number: \nOperation #: "))

	if operation == 1:
		print("\nEnter two values to add: ")
		x = int(input("Input 1: "))
		y = int(input("Input 2: "))
		print("\nANS: " + str(add(x, y)))

	elif operation == 2:
		print("\nEnter two values to subtract: ")
		x = int(input("Input 1: "))
		y = int(input("Input 2: "))
		print("\nANS: " + str(subtract(x, y)))

	elif operation == 3:
		print("\nEnter two values to multiply: ")
		x = int(input("Input 1: "))
		y = int(input("Input 2: "))
		print("\nANS: " + str(multiply(x, y)))

	elif operation == 4:
		print("\nEnter two values to divide: ")
		x = int(input("Input 1: "))
		y = int(input("Input 2: "))
		print("\nANS: " + str(divide(x, y)))

	elif operation == 5:
		print("\nExponents - Enter two values: ")
		x = int(input("Base: "))
		y = int(input("Exponent: "))
		print("\nANS: " + str(pow(x, y)))

	elif operation == 6:
		print("\nEnter the value to be square rooted: ")
		x = int(input("Input Value: "))
		print("\nANS: " + str(sqrt(x)))

	elif operation == 7:
		print("\nAbsolute Value - Enter a value: ")
		x = int(input("Input Value: "))
		print("\nANS: " + str(absolute(x)))

	elif operation == 8:
		print("\nE - Enter a value: ")
		x = int(input("Input Value: "))
		print("\nANS: " + str(E(x)))

	elif operation == 9:
		print("\nE-1 - Enter a value: ")
		x = int(input("Input Value: "))
		print("\nANS: " + str(Ex_1(x)))

	elif operation == 10:
		print("\nSine - Enter a value: ")
		x = int(input("Input Value: "))
		print("\nANS: " + str(sin(x)))

	elif operation == 11:
		print("\nCosine - Enter a value: ")
		x = int(input("Input Value: "))
		print("\nANS: " + str(cos(x)))

	elif operation == 12:
		print("\nTangent - Enter a value: ")
		x = int(input("Input Value: "))
		print("\nANS: " + str(tan(x)))

	elif operation == 13:
		print("\nEnter a value to be rounded up: ")
		x = int(input("Input Value: "))
		print("\nANS: " + str(roundup(x)))

	elif operation == 14:
		print("\nEnter a value to be rounded down: ")
		x = int(input("Input Value: "))
		print("\nANS: " + str(rounddown(x)))

	elif operation == 15:
		print("\nEnter two values to find the GCD: ")
		x = int(input("Input 1: "))
		y = int(input("Input 2: "))
		print("\nANS: " + str(GCD(x, y)))

	elif operation == 16:
		print("\nEnter a radian angle value: ")
		x = int(input("Input Value: "))
		print("\nANS: " + str(radian_degree(x)))

	elif operation == 17:
		print("\nEnter a degree angle value: ")
		x = int(input("Input Value: "))
		print("\nANS: " + str(degree_radian(x)))

	elif operation == 18:
		print("\nLog - Enter a value: ")
		x = int(input("Input Value: "))
		print("\nANS: " + str(log(x)))

	elif operation == 19:
		print("\nLog 10 - Enter a value: ")
		x = int(input("Input Value: "))
		print("\nANS: " + str(log_10(x)))

	elif operation == 0:
		break
	
	elif operation == 100:
		operationsList()

	else:
		print("\nError: Please choose a calculating operation by typing in its corresponding number")