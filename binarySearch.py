#binarySearch via recusion

def binarySearch(arr, left, right, value):
   if right >= left:
      mid = 1 + (right - left)//2
      if arr[mid] == value:
         return mid
      elif arr[mid] > value:
         return binarySearch(arr, left, mid - 1, value)
      else:
         return binarySearch(arr, mid + 1, right, value)
   else:
      return -1

arr = [ 2, 3, 4, 10, 40 ] 
x = 10
print(binarySearch(arr, 0, len(arr) - 1, 10))
      
