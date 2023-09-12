import shutil

def check_usage(disk):
	disk_usage = shutil.disk_usage(disk)
	free_space = disk_usage.free / disk_usage.total * 100
	return free_space > 20

if not check_usage("/"):
	print("--ERR-- -> DISK IS OVERLOADED!!!")
else:
	print("Disk is OK.")