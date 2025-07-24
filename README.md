# Java Core: Adress Book

## Overview

This is a Java project which use CLI. You can do CRUD operations with your contacts.
Project was my learning project at SkillBox. In that project I used: OOP and arrays.

---

## Technology 

- OpenJDK24
- Library: Scanner
- IDE: IntelliJ IDEA 

---

## Feature
- CRUD operation over contacts
- Display all contacts
- Data stored in memory using an array

---

## Project architecture
```
src/
└── ru.skillbox/
├── Main.java 
│
├── model/
│ ├── Contact.java 
│
└── services/
├── AdressBook.java 
└─  MenuNavigator.java
```
### Description
```
- Main.java                                                              # this is entery point                                
- model/Contact.java                                                     # used to create a contact object for storage
  - Getters, Setters, Constructor
- services/AdressBook.java                                               # class for operations with contacts
  - public void addUser() 
  - public void showAllUsers()
  - public void deleteUser()
- services/MenuNavigator.java                                            # used for app control
  - public void showMenu()
  - public void optionCheck(int selectedOption, AddressBook addressBook) # defines an operation on contacts
```
---

## How to Run

To run the project locally:

```
git clone https://github.com/mihaidaniel-it/AddressBook.git

cd AddressBook

javac Main.java

java Main
```
---

## Future Improvements
-  Save/load transactions from a file (CSV or JSON)
- Add unit tests with JUnit

---


## Author

- **Developed:** Mihai Daniel
- **Email:** [mihaidaniel.it@gmail.com](mailto:mihaidaniel.it@gmail.com)
