import phonenumbers
from phonenumbers import carrier, geocoder, timezone

mobileNum = input("Enter Mobile Phone #: ")
mobileNum = phonenumbers.parse(mobileNum)

print(timezone.time_zones_for_number(mobileNum))
print(carrier.name_for_number(mobileNum, "en"))
print(geocoder.description_for_number(mobileNum, "en"))
print("Valid Mobile Number: ", phonenumbers.is_valid_number(mobileNum))
print("Checking possibility of Phone #: ", phonenumbers.is_possible_number(mobileNum)) 