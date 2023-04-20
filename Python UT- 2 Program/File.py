#  Write a program to open a file in write mode and append some content in end of file.

f = open("myfile.txt", "w")
f.writelines("Avi ")
f.close()

# Append-adds at last
f = open("myfile.txt", "a")  # append mode
f.write("Thorve")
f.close()