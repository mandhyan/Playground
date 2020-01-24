words=input()
for i in range(0,len(words)):
    if i == 0:
        word =words[0]
    else:
        word= words[0:i+1]
    for each in word[::-1]:
        print (each)
    if word == word[::-1]:
        print ("Is Palindrome")
    else:
        print ("Not Palindrome")
    print ("")