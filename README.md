# Lab-07
Jack McGrath

Olivia Joe West

Amos Lou


excersie 2
# Exercise Two
import datetime

# print the current date and time
datetime_object = datetime.datetime.now()
print("Current date and time: ", datetime_object)

# modify the following print statements using datetime_object appropriately
print("Current year: ", datetime_object.year)
print("Current month: ", datetime_object.month)
print("Current day: ", datetime_object.day)
print("Current time: ", datetime_object.time())

# modify the following statement that creates another datetime_object.
# the second datetime_object contains information about yesterday
datetime_object2 = datetime_object
today = datetime.date.today()
yesterday = today - datetime.timedelta(days=1)
datetime_object2 = yesterday

# print yesterday's date and time
print("Yesterday's date and time: ", datetime_object2, datetime_object.time())

# modify the following statement to print the current date and time in
# dd-mm-YY H:M:S format
datetime_object3 = datetime_object
print("Current date and time: ", datetime_object.day, "-", datetime_object.month,"-",datetime_object.year,datetime_object.time())
