# Write a program to calculate surface volume & area of cylinder.

height = float(input('Height of cylinder: '))
radian = float(input('Radius of cylinder: '))

volume = 3.14 * radian * radian * height
print("Volume is: ",volume)

sur_area = ((2*3.14*radian) * height) + ((3.14*radian**2)*2)
print("Surface Area is: ",sur_area)