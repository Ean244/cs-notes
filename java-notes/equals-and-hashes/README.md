# Equals and HashCodes

## `equals()`

Wrong implementation of `equals()` may cause unexpected behaviours.

#### Implement custom `equals()` function if and only if:
* Each object instance is not unique (Ex Point(x,y))
* Object class requires custom logic equality test
* Superclass does not provide appropriate `equals()` implementation

#### Properties of `equals()`:
* Reflexive: `x.equals(x)` must always return true
* Transitive: If `x.equals(y)` and `y.equals(z)`, then `x.equals(z)`
* Non-nullity: `x.equals(null)` must always return false
* Consistent: `x.equals(y)` must consistently return true or false provided no information of the instance was modified.
(ie. It does not depend on changing factors such as time)

#### General guidelines for overriding `equals()`:
* Use `==` operator to check if the argument is a reference to this object (Reflexive) 
* Use `instanceof` to check if argument is correct type (Non-nullity)
* Cast the argument to the object type
* For each significant field of the class: check if the fields are equal (compare fields that are more likely to differ first)
* **Always** override `hashCode()` when you override `equals()`. Equal objects should have exactly the same hashcode

> Note: equals(Object o) is overriding, equals(MyClass m) is overloading. Be careful as the latter will not work with collections.

> Use the @Override annotation to be safe

## `hashCode()`
The original hashCode() function inherited from the object class produces a unique hashcode for each instance of the object, 
regardless of equality. To ensure that the object works with HashTables and HashMaps, the hash function
should be implemented such that equal objects have the same hashcode.

An ideal hashCode() functions will generate unequal hashes for unequal objects. However, equal hashes for unequal objects
are possible too, although this may impact the performance of hash-based data types.

#### General Guidelines for Implementing `hashCode()`
1. Declare integer `result` and initialize it to the hashcode of the first significant field
2. For each significant field compared in `equals()`, compute its hash code `c`
3. Combine the hash code computed as shown: `result = 31 * result + c`

> Alternatively use `Objects.hash(fields...)` to generate the hash code. However, there will be a minor sacrifice in performance

#### References
* Effective Java 3rd Edition
