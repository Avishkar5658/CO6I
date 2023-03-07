# Write a Python program to reverse a given number.

n = int(input("Enter a number: "))

# initialize variables
reverse = 0
original = n

# reverse the number
while n > 0:
    remainder = n % 10
    reverse = reverse * 10 + remainder
    n = n // 10

# print the result
print("The reverse of", original, "is", reverse)
