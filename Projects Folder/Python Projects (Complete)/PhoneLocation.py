import phonenumbers
from phonenumbers import geocoder
num1 = phonenumbers.parse("+13474561326")
print("\nPhone Numbers Location")
print(geocoder.description_for_number(num1, "en"))