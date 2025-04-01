// https://leetcode.com/problems/peeking-iterator/

// Time Complexity : O(1)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : no

// Your code here along with comments explaining your approach in three sentences only
/*
 * Here, in peek function, if has peek is false and iter.hasNext() is true, take iter.next() as peekedElement and hasPeek to true and return
 * peekedElement. In next function if hasPeek is true make it false and return peekedElement else return iter.next(). In hasnext function, 
 * return haspeek|| iter.hasNext().
 */
class PeekingIterator implements Iterator<Integer> {
    Iterator<Integer> iter;
    boolean hasPeek;
	public PeekingIterator(Iterator<Integer> iterator) {
	    // initialize any member here.
        this.iter = iterator;
        this.hasPeek = false;
	    
	}
	
    // Returns the next element in the iteration without advancing the iterator.
    int peekedElement;
	public Integer peek() {
        if(!hasPeek && iter.hasNext()){
            peekedElement = iter.next();
            hasPeek = true;
        }
        return peekedElement;
	}
	
	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
        if(hasPeek){
            hasPeek = false;
            return peekedElement;
        }
        else{
            return iter.next();
        }
	}
	
	@Override
	public boolean hasNext() {
	    return hasPeek || iter.hasNext();
	}
}