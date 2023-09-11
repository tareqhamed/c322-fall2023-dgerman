class msg:
    def __init__(self):
        self.msg = [1,2,3,4,5,6,7,8,9]
        self.head = 0
        self.tail = 4
        self.count = 5
    def add(self,n):
        print("before : ",(self.tail-self.head-self.count)%len(self.msg))
        self.count+=1
        self.tail+=1
        self.msg[self.tail]=n 
        print("after : ",(self.tail-self.head-self.count)%len(self.msg))
    def remove(self):
        print("before : ",(self.tail-self.head-self.count)%len(self.msg))
        self.count-=1 
        self.head+=1 
        print("after : ",(self.tail-self.head-self.count)%len(self.msg))
        
k = msg()
k.add(7)
k.remove()
