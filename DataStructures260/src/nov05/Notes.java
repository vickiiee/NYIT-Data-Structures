package nov05;

public class Notes {
	/*
	 * CH 11: Hash tables:
	 * 
	 * A hash function is a function where you put in a string1 and you get back a
	 * number.
	 * 
	 * Hash tables are good for doing a quick search on things.
	 * 
	 * The Problem with Quadratic Probes > Quadratic probes eliminate the clustering
	 * problem we saw with the linear probe, which is called primary clustering.
	 * 
	 * Let’s say 184, 302, 420, and 544 all hash to 7 and are inserted in this
	 * order. Then 302 will require a one-step probe, 420 will require a four-step
	 * probe, and 544 will require a nine-step probe. Each additional item with a
	 * key that hashes to 7 will require a longer probe. This phenomenon is called
	 * secondary clustering. Secondary clustering is not a serious problem, but
	 * quadratic probing is not often used because there’s a slightly better
	 * solution.
	 * 
	 * Double Hashing To eliminate secondary clustering as well as primary
	 * clustering, we can use another approach: double hashing. Secondary clustering
	 * occurs because the algorithm that generates the sequence of steps in the
	 * quadratic probe always generates the same steps: 1, 4, 9, 16, and so on.
	 * h(key) = key % 7; h’(key) = 5 - (key % 5);
	 * 
	 * Double hashing requires that the size of the hash table is a prime number.
	 * 
	 * 
	 * 
	 */

}
