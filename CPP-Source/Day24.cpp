//DAY 24 OF HACKERRANK 30 DAY CHALLENGE: MORE LINKED LISTS (C++)

#include <cstddef>
#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;	
class Node
{
    public:
        int data;
        Node *next;
        Node(int d){
            data=d;
            next=NULL;
        }
};
class Solution{
    public:        
          Node* removeDuplicates(Node *head)
          {
              vector<int> alreadyUsed = vector<int>(1);
              Node *traverser = head;
              alreadyUsed[0] = traverser->data;
              
              while (traverser->next != NULL) {
                  bool alreadyFound = false;
                  for (int x = 0; x < alreadyUsed.size(); x++) {
                      if (traverser->next->data == alreadyUsed[x]) {
                          alreadyFound = true;
                      }
                  }
                  
                  if (alreadyFound) {
                      traverser->next = (traverser->next)->next;
                  }
                  else {
                      vector<int> temp = vector<int>(alreadyUsed.size()+1);
                      for (unsigned int y = 0; y < alreadyUsed.size(); y++) {
                          temp[y] = alreadyUsed[y];
                      }
                      temp[alreadyUsed.size()] = (traverser->next)->data;
                      alreadyUsed = temp;
                      traverser = traverser->next;
                  }
              }
              
              return head;
          }
          Node* insert(Node *head,int data)
          {
               Node* p=new Node(data);
               if(head==NULL){
                   head=p;  

               }
               else if(head->next==NULL){
                   head->next=p;

               }
               else{
                   Node *start=head;
                   while(start->next!=NULL){
                       start=start->next;
                   }
                   start->next=p;   

               }
                    return head;
                
            
          }
          void display(Node *head)
          {
                  Node *start=head;
                    while(start)
                    {
                        cout<<start->data<<" ";
                        start=start->next;
                    }
           }
};
			
int main()
{
	Node* head=NULL;
  	Solution mylist;
    int T,data;
    cin>>T;
    while(T-->0){
        cin>>data;
        head=mylist.insert(head,data);
    }	
    head=mylist.removeDuplicates(head);

	mylist.display(head);
		
}