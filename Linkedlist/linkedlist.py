class node:
    def __init__(self,data):
        self.data=data
        self.next=None
        
        

class linkedlist(node):
    def __init__(self):
        self.head=None
    def insert(self,newnode):
        if(self.head==None):
            self.head=newnode
        else:
            tempnode=self.head
            while(True):
                if(tempnode.next==None):
                    break
                tempnode=tempnode.next
            tempnode.next=newnode
            
    def print_list(self):
        temp=self.head
        p=''
        while(temp!=None):
            l=str(temp.data)
            p+=l+'->'
            temp=temp.next
        print(p)    
        
        
firstnode=node("man") 
linked=linkedlist()
linked.insert(firstnode)
second=node("lij") 
linked.insert(second)
third=node("paulo") 
linked.insert(third)
linked.print_list()
    
        
            
        



