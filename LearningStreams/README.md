- Streams not a collection
- efficient way of processing data

What is it?
---
- An object that doesn't hold data
- not suppose to change data, due to parallel processing
- object that defines Map/Filter/Reduce operation on data
- able to process data in one pass



Map
---
take input of a type eg: `List<String>` and return another type with same length/size ex: `List<Integer>`

Filter:
------
Type of input and output is same. O/p only has members that have passed filter condition.

Reduce:
-------
computed on all data. Like aggregation. SUM, MIN, MAX, AVG, .etc.

Why Streams?
------------
Efficient data processing

efficient?
- parallel processing without having to explicitly write concurrent code.
- Pipelined, result can be passed. Helps avoid intermediate operations




