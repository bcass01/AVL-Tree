# AVL-Tree
I built an AVLTreeMap class, which uses an AVL tree to map one set of integers (values) to another set of integers (keys). This class includes several methods, all of which run in O(log N) time:
1. ```void clear()``` - Clears all values from the tree, leaving it empty.
2. ```int size()``` - Returns the number of nodes in the tree.
3. ```boolean contains(Integer key)``` - Returns true if the tree contains a value mapped to the given key. This method is recursive.
4. ```boolean put(Integer key, Integer value)``` - Maps the given value to the given key and automatically rotates the tree if necessary. Returns true if a new node was added to the tree and returns false if a key's value was updated without adding a new node. This methodis recursive.
5. ```Integer get(Integer key)``` -  Returns the value mapped to the given key. This method is recursive.
