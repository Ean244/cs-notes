#Equals and HashCodes
`equals()`

Wrong implementation of `equals()` may cause unexpected behaviours.

Implement custom `equals()` function if and only if:
* Each object instance is not unique (Ex Point(x,y))
* Object class requires custom logic equality test
* Superclass does not provide appropriate `equals()` implementation

Properties of `equals()`:
* Reflexive: `x.equals(x)` must always return true
* Transitive: If `x.equals(y)` and `y.equals(z)`, then `x.equals(z)`
* Non-nullity: `x.equals(null)` must always return false
* Consistent: `x.equals(y)` must consistently return true or false provided no information of the instance was modified.
(ie. It does not depend on changing factors such as time)

General guidelines for implementing `equals()`:
* Use `==` operator to check if the argument is a reference to this object (Reflexive) 
* Use `instanceof` to check if argument is correct type (Non-nullity)
* Cast the argument to the object type
