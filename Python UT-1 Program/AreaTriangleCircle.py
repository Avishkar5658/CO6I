# Area of Trianglee and Circle.




# Three sides of the triangle is a, b and c:
a = float(input('Enter first side: '))
b = float(input('Enter second side: '))
c = float(input('Enter third side: '))

# calculate the semi-perimeter
s = (a + b + c) / 2

# calculate the area
area = (s*(s-a)*(s-b)*(s-c)) ** 0.5
print("The area of the triangle is: ",area)





r=float(input("Enter the Radius of Circle: "))
a = 3*3.14*r*r
print("\nArea = ", a)