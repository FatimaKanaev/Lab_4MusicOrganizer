import java.util.ArrayList;

/**
 * A class to hold details of audio files.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 2016.02.29
 */
public class MusicOrganizer
{
    // An ArrayList for storing the file names of music files.
    
    /* Extra field declaration
     * 
     * Question4
     *       private ArrayList<Book> Library;* 
     * Question5
     *       ArrayList<Student> cs010;
     * Question6
     *       private ArrayList<MusicTrack> tracks;
     * Question 11
     *       files.add(favoriteTrack);
     * 
     * 
     * 
     * 
     */
    
    private ArrayList<String> files;
    
    /**
     * Create a MusicOrganizer
     */
    public MusicOrganizer()
    {
        files = new ArrayList<>();
    }
    
    /**
     * Add a file to the collection.
     * @param filename The file to be added.
     */
    public void addFile(String filename)
    {
        /* Extra local variables declaration
         * ArrayList<Student> cs101 = new ArrayList<>();
         * ArrayList<Student> cs101 = new ArrayList<Student>();
         * int count = 5;
         */
        
        files.add(filename);
        
        /* Library = new ArrayList<>();
         * Library = new ArrayList<Book>();
         * 
         * tracks = new ArrayList<MusicTrack>;
         * tracks = new ArrayList<>;
         * 
         */
        
        // Question 9 
        ArrayList<String> items = new ArrayList<>();
        
            items.add("song1"); //index 0
            items.add("song2"); //index 1
            items.add("song3"); //index 2
            items.add("song4"); //index 3
            items.add("song5"); //index 4
            items.add("song6"); //index 5
            
            String filesname = items.get(4); // filename = "song5"
            System.out.println("Retreiving 5th element of items: " + filename);
            
            String favoriteTrack = "My favorite song";
            items.add(favoriteTrack);
            int indexOfLast = files.size()-1;
            System.out.println("Retreiving my last element: " + files.get(indexOfLast));
    }
    
    /**
     * Return the number of files in the collection.
     * @return The number of files in the collection.
     */
    public int getNumberOfFiles()
    {
        return files.size();
    }
    
    /**
     * List a file from the collection.
     * @param index The index of the file to be listed.
     */
    public void listFile(int index)
    {
        if(index >= 0 && index < files.size()) {
            String filename = files.get(index);
            System.out.println(filename);
        }
    }
    
    /**
     * Remove a file from the collection.
     * @param index The index of the file to be removed.
     */
    public void removeFile(int index)
    {
        if(index >= 0 && index < files.size()) {
            files.remove(index);
        }
    }
}
