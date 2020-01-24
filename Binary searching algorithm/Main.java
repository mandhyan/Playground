n= int(input())
numbers=[int(x) for x in input().split()]
find= int(input())
mid = n//2
def binarySearch(arr, l, r, x): 
  
    while l <= r: 
  
        mid = l + (r - l)//2; 
          
        # Check if x is present at mid 
        if arr[mid] == x: 
            return mid 
  
        # If x is greater, ignore left half 
        elif arr[mid] < x: 
            l = mid + 1
  
        # If x is smaller, ignore right half 
        else: 
            r = mid - 1
      
    # If we reach here, then the element was not present 
    return -1
pos=binarySearch(numbers,0,n-1,find)
if pos == -1:
  print ("Not found")
else:
  print ("{} found at location {}.".format(find,pos+1))
 