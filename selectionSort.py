#this is selection sort, O(n^2)

def selectionSort(array):
   for i in range(len(array)):
      min_index = i
      for j in range(i + 1, len(array)):
         if array[j] < array[min_index]:
            min_index = j
      array[min_index], array[i] = array[i], array[min_index]
   return array


l = [2, 3, 1, 5, 7, 4, 0]

result = selectionSort(l)
print(result)
