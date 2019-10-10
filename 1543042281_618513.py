#shell sort
l = [8, 9, 1, 7, 2, 3, 5, 4, 6, 0]
def shellSort(array):
   gap = len(array)
   gap //= 2
   while gap > 0:
      for i in range(gap, len(array)):
         j = i
         temp = array[j]
         while j - gap >= 0 and array[j - gap] > temp:
            array[j] = array[j - gap]
            j = j - gap
         array[j] = temp
      gap //= 2


result = shellSort(l)
print(l)
