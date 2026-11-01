
#Question 1:- 

N = int(input("Enter the number :- "))

def functional_Recursion(N):
    if N == 0:
        return 0
    else:
        return N + functional_Recursion(N - 1)

print(functional_Recursion(N))

#Question 2 :- 

N = int(input("Enter the number :- "))

def factorial(N):
    if N == 1:
        return 1
    else:
        return N * factorial(N - 1)

print(factorial(N))
