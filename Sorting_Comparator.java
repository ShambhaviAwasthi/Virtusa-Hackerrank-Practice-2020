// Shambhavi Awasthi
// Virtusa Hackerrank Practice
// Sorting: Comparator
// Java Solution


class Checker implements Comparator<Player> {
  	// complete this method
	public int compare(Player a, Player b) {
    if(a.score>b.score)
    return -1;
    if(a.score<b.score)
    return 1;
    else{
        return a.name.compareTo(b.name);
    }

  
    }
}

