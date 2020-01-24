import heapq
import math
n= int(input())
chocolates= [-1*int(x) for x in input().split()]
k = int(input())

heapq.heapify(chocolates)
for i in range(k):
  new= int(math.sqrt(heapq.heappop(chocolates) * -1))
  heapq.heappush(chocolates,new * -1)

print (sum(chocolates)*-1)
  