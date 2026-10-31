n = int(input("Enter the number :- "))
count = 0
while n > 0:
       lastDigit = n % 10
       count = lastDigit + count * 10
       n = n // 10
print(count)