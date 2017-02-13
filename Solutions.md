# Event Checker Solutions
I was told to give a simple solution, so this is the simplest I can come up with. Plus, I am also aiming to get brownie points by providing the second part of the test.

## Event Checker Solution 1
The first solution which came to my mind was using a bit map. The reason I choose this implementation over the second one is because it's more time efficient. Plus, updating the map is also faster on average 
because it's an array so I can directly access the value using indexes. I traded memory because of the use case i.e. year. 

### Advantages
 - Query time O(1)
 - Update time O(max-min) includes/excludes average case. Worst case scenario O(MAX_YEAR), if min is 1 and max is MAX_YEAR.
 
 
### Disadvantages 
 - If memory is limited, then not a scalable solution.
 - If year representation changes in the future, need to re-map to the new representation.
 - We need to think of dynamic sizing of the array when we reach MAX_YEAR space. We can choose either increasing 50% more than current. The same strategy that Java array collections applies when resizing.
 
## Event Checker Solution 2
The second solution which came to my mind was some sort of tree interval. Since the first is memory intensive, I needed to make it more efficient. So the idea is to implement a self balancing interval tree when we add include and exclude intervals. 

### Advantages
 - More memory efficient. No need to preallocate array of MAX_YEAR.
 - Updating time average case scenario would be O(logn). Worst case scenario is O(n).

### Disadvantages 
 - Query time increases from O(1) to O(logn)
 - Thinking out loud..If we keeping on adding small intervals then tree will become big and require more space than we originally thought. That might take more space than my above solution. Since we need to store 2 int values, a boolean and 2 pointers.