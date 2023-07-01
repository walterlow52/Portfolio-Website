import psutil

def check_usage(percent):
	usage = psutil.cpu_percent()
	return usage < percent

if not check_usage(75):
	print("--ERR-- -> CPU IS OVERLOADED!!!")
else:
	print("CPU is running fine.")