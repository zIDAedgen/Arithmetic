#hanoi tower recursion 

a = 'a'
b = 'b'
c = 'c'
def hanoi(n, a, b, c):
   if n == 1:
      print(a + ' ->' + c)
      return 
   hanoi(n - 1, a, c, b)
   print(a + ' -> ' + c)
   hanoi(n - 1, b, a, c)


hanoi(3, a, b, c)


