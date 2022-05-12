public class HashTable {

    private Integer table[] = new Integer[15]; //A table
    public Integer traversals = 0; //Number of traversals
    
    
//Method used to find the modular of 13
public Integer hashFunction(Integer value) {
	
	return value % 13;
	
} 

/*
 * Method to probe the hash table and
 * find the correct spot for the value 
 */
public Integer probe(Integer value) {

	Integer hash = hashFunction(value); //Calculate the hash
      
            while(table[hash] != null) {
                traversals++;
                hash = (hash + 1) % table.length;
            }
        
        return hash;
    }


//Method to add a value to the hash table
public void add(Integer value) {
	
	Integer hash = probe(value); //Find place for value
	
	table[hash] = value; //Add value

}
    
//Method to print the results of the hash table
public String print() {
	
	String list = "";
	
	for(Integer i = 0; i < table.length; i++) {
		if(table[i] != null) {
			list += table[i] + " ";
		}
    }
	return list;
}
    
public static void main(String[] args) {
	
//Creating new Hash Table
HashTable linearHash = new HashTable();
	
//table array with the required numbers
int [] table = {1,5,21,26,39,14,15,16,17,18,19,20,111,145,146};
	
//Inserting numbers from table array into hash table
for (int i = 0; i  < table.length; i++){
	linearHash.add(table[i]);
	}

//Printing out the hash table
System.out.print("Hash Table: ");
System.out.println(linearHash.print());

}
}