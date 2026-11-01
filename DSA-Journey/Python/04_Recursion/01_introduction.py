count = 0

def counter():
    global count
    if count == 4:
        return 1
    print(count)
    count = count + 1
    counter()

counter()

