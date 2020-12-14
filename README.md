# Notes App

**Notes App** is a service that helps to add random notes to the server. It supports the following API.

### Post Notes
Create a note

Method : **POST** <br/>
API :  /notes
         
### Get Notes
get a note from the server <br/>
Method : **GET** <br/>
API :    /notes/note id <br/>
  
### Put Notes
modifies a note in the server <br/>
Method : **PUT** <br/>
API:     /notes/note id
  
### Delete Notes
deletes a note in the server <br/>
Method : **DELETE** <br/>
API :    /notes/note id <br/>

### Test case/ clarifying questions
What are supported character set (UTF-8) behvaiour based on different charset.
What if it is only one large word (proper error message)
what if one of the word is larger than maxWidth (proper error message)
Shouldn't the formatting be made responsility of the client (so that any additional formatting options are not removed)

# Client - formatting options

Note : **Sudheesh Udaya Varma likes to code**

### Left Align
Sudheesh Udaya 
Varma likes to 
code  

### Right Align
 Sudheesh Udaya
 Varma likes to
           code

### Centre Align
Sudheesh
Udaya Varma
likes to code

