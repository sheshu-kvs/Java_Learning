import java.util.*;

public class FindDuplicateFilesStory {
    public static void main(String[] args) {

        // 📂 Step 1: List of shelves (each shelf = one file's details)
        // A List holding many Maps, each Map has "name" and "hash"
        List<Map<String, String>> fileShelves = List.of(
            Map.of("name", "a.txt", "hash", "abcd1234"),
            Map.of("name", "b.txt", "hash", "abcd1234"),
            Map.of("name", "c.txt", "hash", "efgh5678"),
            Map.of("name", "d.txt", "hash", "ijkl9101"),
            Map.of("name", "e.txt", "hash", "efgh5678")
        );

        // 🗄 Step 2: The cupboard (hash → list of files)
        // Key = hash (label of shelf)
        // Value = list of filenames with that hash
        Map<String, List<String>> cupboard = new HashMap<>();

        // 🔍 Step 3: Go through each file shelf in the list
        for (Map<String, String> fileShelf : fileShelves) {
            String fileName = fileShelf.get("name"); // e.g., "a.txt"
            String fileHash = fileShelf.get("hash"); // e.g., "abcd1234"

            // If the cupboard already has a shelf for this hash
            if (cupboard.containsKey(fileHash)) {
                cupboard.get(fileHash).add(fileName); // Add file to existing shelf
            }
            // If cupboard has no shelf for this hash
            else {
                List<String> newShelf = new ArrayList<>();
                newShelf.add(fileName); // put this file on it
                cupboard.put(fileHash, newShelf); // add shelf to cupboard
            }
        }

        // 📢 Step 4: Show only shelves with more than 1 file
        for (Map.Entry<String, List<String>> shelfEntry : cupboard.entrySet()) {
            String hashLabel = shelfEntry.getKey();
            List<String> filesOnShelf = shelfEntry.getValue();

            if (filesOnShelf.size() > 1) {
                System.out.println("Hash \"" + hashLabel + "\" is shared by: " + filesOnShelf);
            }
        }
    }
}
