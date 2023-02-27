#Write a program to convert bits to Megabytess, Gigabytes & Terabytes.

byte = int(input("Enter bytes: "))

mb = byte/(1024 * 1024)
print(mb,"MegaBytes")

gb = byte/(1024 * 1024 * 1024)
print(gb,"Giga Bytes")


tb = byte/(1024 * 1024 * 1024 * 1024)
print(tb,"Tera Bytes")