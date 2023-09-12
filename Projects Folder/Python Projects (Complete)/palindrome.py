print("\nWelcome to the Python Palindrome Program! A palindrome is a word that is spelled the same backwards and forwards. For example, \"level\" and \"racecar\" are palindromes. This program will let you know if any word you input is considered a palindrome.\n")

word = input(str("To get started, enter a word to see if it's a palindrome: "))

if (word == word[::-1]) == True:
	msg = "----- {} is a palindrome. -----"
	print(msg.format(word.upper()))
else:
	msg = "----- {} is not a palindrome. -----"
	print(msg.format(word.upper()))