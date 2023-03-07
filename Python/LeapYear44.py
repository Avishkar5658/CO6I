# Write a program to check if the input year is leap year or not.

Year=int(input("Enter the year: "))

if((Year % 400 == 0) or
     (Year % 100 != 0) and
     (Year % 4 == 0)):
    print(Year,"is a leap Year");
else:
    print(Year,"is not a leap Year")