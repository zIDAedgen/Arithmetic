#This is for recusive practice. The base case and the induction should be formed in a recursion
#1. Fibonacci
def Fibonacci(number):
   if number <= 1:
      return number
   return Fibonacci(number - 1) + Fibonacci(number - 2)


result_1 = Fibonacci(5)
#0 1 1 2 3 
print(result_1)


#2. factorial : n! = n * (n - 1)!
def factorial(n):
   if n <= 1:
      return 1
   return n * factorial(n - 1)

result_2 = factorial(5)
print(result_2)
