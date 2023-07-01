import os
import sys

def check_reboot():
	return os.path.exists("/run/reboot-required")

if check_reboot():
	print("Pending Reboot.")
else:
	print("Computer is up to date.\nNo reboot is needed.")