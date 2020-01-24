n = int(input())
numbers=[int(x) for x in input().split()]
sizen=n+1
total=(numbers[-1] - numbers[0])//n
count = 0
while True:
	if numbers[count+1] - numbers[count] != total:
		print (numbers[count]+total)
		break
	count+=1	