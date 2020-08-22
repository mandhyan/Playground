n = int(input())
numbers=[int(x) for x in input().split()]
count=0
flag= True
for i in range(len(numbers)):
	if i == 0:
		count+=1
	else:
		if numbers[i] == numbers[i -1]:
			count+=1
		else:
			
			if count % 2 == 1:
				print (numbers[i-1])
				flag= False
				break
			count=1

if flag:
  print (numbers[-1])