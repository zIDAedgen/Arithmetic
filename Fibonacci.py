#This is a recursion and dp adopted alogrithm to solve the Fibonacci array
def fibonacci(n):
  memory = [1, 1]
  while len(memory) < n:
    memory.append(0)
  if n <= 1:
    return n
  else:
    if memory[n - 1] == 0:
      memory[n - 1] = fibonacci(n - 1)
    if memory[n - 2] == 0:
      memory[n - 2] = fibonacci(n - 2)
  memory[n] = memory[n - 1] + memory[n - 2]
  return memory[n]
