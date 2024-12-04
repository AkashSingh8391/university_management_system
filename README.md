# university_management_system
in university management system we use the jdbc APIs.

we make a schema in mysql workbench name is:
students:
| id (PK) | name | email | course_id (FK) |
faculty:
| id (PK) | name | department |
courses:
| id (PK) | name | credits |

In my university java project we use three classes
1. Main.java
2. dbConnection.java
3. Operations.java
