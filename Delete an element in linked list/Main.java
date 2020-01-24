class Node:
    def __init__(self,value):
        self.value= value
        self.toNext = None

class LinkedList:
    def __init__(self,head):
        self.head=head
    
    def printList(self):
        temp = self.head
        while (temp):
            if (temp.value):
                print (temp.value)
            temp = temp.toNext
    
    def addItem(self,value):
        temp = Node(value)
        route = self.head
        while (route.toNext):
            route = route.toNext
        route.toNext = temp
    
    def deleteItem(self):
        self.head= self.head.toNext

head= None
while True:
    n=int(input())
    if n < 0:
        break
    if head is None:
        head = Node(n)
        linker = LinkedList(head)
    else:
        linker.addItem(n)
linker.deleteItem()
linker.printList()