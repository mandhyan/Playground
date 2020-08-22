n = int(input())
sentence=[int(x) for x in input().split()]
count=0
for each in sorted(sentence):
  if each == 1:
    count+=1
print ("Count of 1's in given array is {}".format(count))
    