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
What are supported character set (UTF-8) behvaiour based on different charset. <br/>
What if it is only one large word (proper error message) <br/>
what if one of the word is larger than maxWidth (proper error message) <br/>
Shouldn't the formatting be made responsility of the client (so that any additional formatting options are not removed) <br/>
What if the given string is already broken? (Remove new line chars where required) <br/>

# Client - formatting options

Note : **Sudheesh Udaya Varma likes to code**

### Left Align
Sudheesh Udaya <br/>
Varma likes to <br/>
code  <br/>

### Right Align
 Sudheesh Udaya <br/>
 Varma likes to <br/>
 &nbsp;&nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;code <br/>

### Centre Align
Sudheesh <br/>
Udaya Varma <br/>
likes to code <br/>

