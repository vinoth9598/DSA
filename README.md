📦 Java Collections Framework – Overall Structure
Level	Interface / Class	Description
          1	Iterable	Root interface
          2	Collection	Basic operations
          3	List	Ordered, duplicates
          3	Set	Unique elements
          3	Queue	FIFO / Priority
          3	Map*	Key–Value pairs

* Map is not a child of Collection

📋 List Implementations
        Class	Order	Duplicates	Sync	Internal Structure	Access
        ArrayList	✅	✅	❌	Dynamic Array	Fast
        LinkedList	✅	✅	❌	Doubly Linked List	Slow
        Vector	✅	✅	✅	Dynamic Array	Fast
        Stack	✅	✅	✅	LIFO	Slow
🔹 Set Implementations
        Class	Order	Duplicates	Null	Internal Structure
        HashSet	❌	❌	1	Hash Table
        LinkedHashSet	Insertion	❌	1	Hash + Linked List
        TreeSet	Sorted	❌	❌	Red-Black Tree
🔸 Queue / Deque Implementations
        Class	Order	Allows Null	Structure	Use Case
        PriorityQueue	Priority	❌	Heap	Scheduling
        ArrayDeque	FIFO/LIFO	❌	Resizable Array	Faster Stack
        LinkedList	FIFO	❌	Linked List	Queue
🗺️ Map Implementations
        Class	Order	Null Keys	Null Values	Internal Structure
        HashMap	❌	1	Multiple	Hash Table
        LinkedHashMap	Insertion	1	Multiple	Hash + Linked List
        TreeMap	Sorted (Keys)	❌	Multiple	Red-Black Tree
        Hashtable	❌	❌	❌	Hash Table
⚙️ Performance Summary
        Structure	Search	Insert	Delete
        ArrayList	O(1)	O(n)	O(n)
        LinkedList	O(n)	O(1)	O(1)
        HashMap	O(1) avg	O(1)	O(1)
        TreeMap	O(log n)	O(log n)	O(log n)
🎯 When to Use What?
Requirement	Best Choice
        Fast lookup	HashMap
        Sorted data	TreeSet / TreeMap
        Maintain order	LinkedHashMap
        Thread-safe	Vector / Hashtable
        Priority-based	PriorityQueue

