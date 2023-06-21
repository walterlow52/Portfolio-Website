a = int(input("Enter a number for (A): "))
b = int(input("Enter another number for (B): "))

print("\nThe value for A is", a)
print("The value for B is", b)

a, b = b, a

print("\nA is now", a)
print("B is now", b)