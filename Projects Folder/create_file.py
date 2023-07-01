import os 
import sys

#file_arg = sys.argv[1]
file_name = input("Enter a new file name: ")

if not os.path.exists(file_name):
	with open(file_name, "w") as f:
		f.write("This file has been created by the Python Create_Arg_File program!")
		print("New file \"{}\" has been created!".format(file_name))
else:
	print("--ERR-- -> File \"{}\" already exists!".format(file_name))
	
