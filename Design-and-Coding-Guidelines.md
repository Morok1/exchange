# Coding Guidelines
## Fundamentals
* Use java generics wherever possible to enforce templatization.
* Always override toString() method of a POJO class (model/entity/DTO) so that object can be directly used in logging instead of logging objects variables in multiple logger statements.
* Wherever possible use switch statement instead of if/else construct.
* Use enum instead of constant for logical set of values such as status, product code, communication mode etc.
* For a good design, the rule is to be as restrictive as possible when setting the visibility of a method.
* Avoid using System.out.println. Use logger instead.
* If Object.equals is overridden, also override Object hashCode, and vice-versa.
* Prefer returning Empty Collections instead of Null.
* Wherever possible use List interface in method arguments and accessing list implementation.
* There should NOT be any duplicate code
* Do NOT keep any commented / dead / unused code.
* No method should have more than 50 lines of code.

## Code Formatting/Style
* Package name should have all letters in lower case.
* For class name, use camel case notation where first letter should be capitalized.
* For variable name, use camel case notation where first letter should be lower case.
* Never use special characters including underscore(_) in class, package and variable name except constant variables (static and final). Use full English descriptors that accurately describe the variable, method or class. For example, use of names like totalSales, currentDate instead of names like x1, y1, or fn.
* Constants, whose values that do not change, are typically implemented as static final fields of classes. They should be represented with full English words, all in uppercase, with underscores between the words like FINAL_VALUE.

## Exception Handling
* The exception must be translated to relevant business exception and then thrown so that it can be translated to a meaningful message for the user. All the try catch blocks must either throw a valid business exception or must be removed if they are not catching exceptions for any valid scenarios. Logging in catch block and re-throwing same exception should not be done. The empty catch block must be verified if the exception needs to be caught here or it needs to be validated at the caller code i.e. UI or any other interface. In case this is applied to catch Null pointer exception then this should not be done.
try{
}catch(SQLException sqle){
throw new BusinessException(sqle);
}finally{
///close any streams or connections or any resources that you might have accessed.
}

* All custom exceptions should extend BaseApplicationException and it should be caught and handled in controller based on error code.

* There must be mapping of error codes with business exception being thrown by business layer. Don't through object of "Exception" class from any layer.

* Always correctly wrap the exceptions in custom exceptions so that stack trace is not lost.

## Logging
Across the layers, following guidelines will be used to decide on conventions used for choosing appropriate logging level.

Logging Level

Scenario

LOG TRACE

Do not use this level in the application, in favor of simple and easier to read code.

LOG DEBUG

Use this level for logging parameters received, output and dump object information etc.

Frequency: Use liberally in application.

LOG ERROR

Use this level whenever there is exception or non-recoverable error in the code. For e.g.
Database Exception
Business Exception
Connection Error

LOG WARN

Use this level whenever there is non-fatal, recoverable errors. Something is not right, but the process can carry on as before.

When a developer is not sure if there could be a problem in particular block, he should use warn level. Use warning level in scenarios that occur rarely.

For e.g.  Database connection unavailability is warning.

LOG INFO

Used to indicate important milestones achieved.

Eg. Partner <Partner_Code> , <Partner_Type> onboarded.

Frequency : Low- medium (only important milestones to  be capture)



## Design Guidelines
### Fundamentals
Duplicate Code: Wherever possible reuse the existing logic instead of writing new flow. If same code can't be reused, take your seniors help to refactor.
Design Rule: Following design rules should be followed.
Rule

Description

Single responsibility principle

A class should have one and only one task/responsibility. If class is performing more than one task, it leads to confusion and will be difficult to understand, reuse, refactor and perform unit testing.

Open/closed principle

The developers should focus more on extending the software entities rather than modifying them.

Liskov substitution principle

It should be possible to substitute the derived class with base class.

Interface segregation principle

It’s like Single Responsibility Principle but applicable to interfaces. Each interface should be responsible for a specific task. The developers should need to implement methods which he/she doesn’t need.

Dependency inversion principle

Depend upon Abstractions- but not on concretions. This means that each module should be separated from other using an abstract layer which binds them together



### Data Access / BO
* For any new development, we should use Spring Data instead of DAO (with Hibernate) to define repository and access the data
* Entity object should not be passed beyond Service layer. These should be transformed into DTO before returning Controller layer.
* Domain Relationship should be used wherever applicable.
* There should be Repository specific to each entity. One Repository shouldn’t have reference to other Repository.
* A Service class can refer to multiple Repositories to get the information for multiple entities depending on business scenario.
* If business logic need to be completed in a single transaction only then a Service can refer another Service but if it is read only data then Service can have multiple Service references.
* Transaction management should be done at Service layer.
* While writing queries, always use bind variables. Without bind variable, queries can't be cached and hence lead to performance and security issues.
* Enable Lazy Loading for the collections that is not required in ResultSet otherwise use eager loading.

## Validation
We should use in-built validators from Apache Validator framework. If required we can add our custom validators that implements the interface from Apache Validator.

## Caching
Master data which is not changing frequently, should be cached for longer duration. There should be provision to define cache refresh interval entity wise.
For a given entity it should have single cache. Creating multiple cache of same entity for different purpose will defeat the use of cache.

## Performance
* There should not be any inline/synchronous HTTP call. For e.g. calling service to send an email in synchronous call.
* Execution time of any API call should be between 200 - 500 milliseconds. If there is any exception then it needs to discussed and approved by technical architect.
* Any DB finds/updates in the loop impact the performance of the code and must be taken out of the loop. Bulk insert or update can help increase the performance. When applying the finders inside the loop, the query can be revisited to find all the objects in one DB call.
* Avoid excessive object creation. Objects creation which would be same for all the iterations should be created outside the loop at the most once and that object should be re-used inside the loop e.g. String, StringBuffer, StringBuilder, Date. Objects that are created to persist them in the DB should be taken out of the loop such that the objects are created in bulk/batch. Even String concatenations inside the loop affect the performance. Attention must be given to minimize the concatenation of strings and use StringBuilder instead.

 