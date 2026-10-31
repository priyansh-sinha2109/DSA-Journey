num = int(input("Enter the number :- "))
count = 0
for i in range(0, num):
     if i % num == 0:
          count = count + i
          print(count)
if count == num:
  print(True)
else:
  print(False)