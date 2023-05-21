# Expense Tracker Api Project

## Built With
* `Java 17`
* `Maven 4.0.0`
* `MySql Ver 8.0.32`
* `Spring Boot 3.0.5`
* `IntelliJ IDEA 2023.1 (Community Edition)`

## Data Flow


### 1. Model:
* It consists of **User** ,**Expense**, **Product** ,**AuthToken** and other entity classes along with their data members and member functions
* Used **_@Table_** and **_@Entity_** annotations inside the entity class.
* Used Lombok to reduce boilerplate code for pojo class.By using Lombok annotations like _**@Data,**_ **@_NoArgsConstructor_**, **_@AllArgsConstructor_** getters and setters for those object generate automatically.
* Used **_@OneToOne_**, and **_@ManyToOne_** annotation to perform one to one mapping between Employee and Address.

### 2. Controller:
* It consists of  **UserController** ,**UserController**, **PostController** and **CommentController** classes in which used the annotations like **@RestController** to annotate the class as Controller.
* Used annotation **_@GetMapping_** , **_@PostMapping_** , **_@PutMapping_** , **_@DeleteMapping_** to map the HTTP web requests to the specific handler methods.

<br>


>User's API References

<br>

* Add User:
```*.sh-session
  http://16.16.218.61:8080/user
```

*  User SigUp:
```*.sh-session
  http://16.16.218.61:8080/user/signup
```

* User SignIn:
```*.sh-session
  http://16.16.218.61:8080/user/signin
```

* User SignOut:
```*.sh-session
  http://16.16.218.61:8080/user/sign-out
```

* Add Expenses via User authentication:
```*.sh-session
  http://16.16.218.61:8080/user/expenses/email/{email}/token/{token}
```

* Get All Expenses via User authentication:
```*.sh-session
  http://16.16.218.61:8080/user/expenses/email/{email}/token/{token}
```

* Update Expense By id via User authentication:
```*.sh-session
  http://16.16.218.61:8080/user/expenses/expenseId/{expenseId}/amount/{amount}
```

* Delete Expense By id via User authentication:
```*.sh-session
  http://16.16.218.61:8080/user/expenses/email/{email}/token/{token}/expenseId/{expenseId}
```


<br>

>Product's API References:

<br>

* Buy Products via User's authentication:
```*.sh-session
  http://16.16.218.61:8080/product/email/{email}/token/{token}
```

* Get Products By Date via User authentication:
```*.sh-session
  http://16.16.218.61:8080/product/email/{email}/token/{token}
```

<br>

### 3. Service:
* It consists of  **UserService**, **ExpenseService**, **ProductService** and **TokenService** classes in which provide some business functionalities of every handler methods.
* Used _**@Service**_ annotation to indicate that a class belongs to the service layer.
* Used **_@Transactional_** annotation to separate transaction management code from the code for business logic on the update and delete methods.

### 4. Repository:
* It consists of  **UserDao**, **ExpenseDao** , **ProductDao** and **TokenDao** interface that extends CrudRepository which is interface for generic inbuilt CRUD operations on a repository for a specific type. Usually represent the database access layer in an application.
* Used **Iterable** for User and Post to manage the data of entity classes by performing CRUD operations.
* Used _**@Repository**_ annotation is used to indicate that the class provides the mechanism for storage, retrieval, search, update and delete operation on objects.
* Used _**@Modifying**_ annotation wrote named parameters query using @Query annotation to insert, update, or delete an entity.

## Data Structure Used
Used `List<O>` to store objects for entity classes.

## Project Summary
* In this project I performed CRUD operation like add,get,delete and update.<br/>
* The aim of this project to create expense-tracker-api application uses authentication tokens to secure user data and ensure that only authenticated users can access certain features.
* Used interface JpaRepository for generic CRUD inbuilt operations like save,saveAll,updateById, etc.
* Used our own custom finder methods and wrote operations using custom queries.
* Implemented authentication for User SignUp, SignIn and to create Post and manage their profile information
* It allows users to sign up, sign in, and manage their expenses. Users can also buy products and get sort the product by date.