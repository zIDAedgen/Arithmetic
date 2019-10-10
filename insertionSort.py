#insertion sort, O(n^2)

def insertionSort(array):
   for i in range(1, len(array)):
      temp = array[i]
      j = i
      while j > 0 and temp < array[j - 1]:
         array[j] = array[j - 1]
         j = j - 1
      array[j] = temp
   return array

l = [4, 0, 1, 3, 7, 5, 6]

result = insertionSort(l)
print(result)
