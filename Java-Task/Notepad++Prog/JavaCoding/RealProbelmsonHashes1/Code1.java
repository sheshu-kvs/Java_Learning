package JavaCoding.RealProbelmsonHashes1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Code1 {
    public static void main(String[] args) {
        

        List<Map<String, String>> fileShelves = List.of(
            Map.of("name", "a.txt", "hash", "abcd1234"),
            Map.of("name", "b.txt", "hash", "abcd1234"),
            Map.of("name", "c.txt", "hash", "efgh5678"),
            Map.of("name", "d.txt", "hash", "ijkl9101"),
            Map.of("name", "e.txt", "hash", "efgh5678")
        );

        Map<String, List<String>> cupboard = new HashMap<>();

        for (Map<String, String> fileShelf : fileShelves) {
            String fileName = fileShelf.get("name"); // e.g., "a.txt"
            String fileHash = fileShelf.get("hash"); // e.g., "abcd1234"

            if (cupboard.containsKey(fileHash)) {
                cupboard.get(fileHash).add(fileName); // Add file to existing shelf
            }
            else {
                List<String> newShelf = new ArrayList<>();
                newShelf.add(fileName); // put this file on it
                cupboard.put(fileHash, newShelf); // add shelf to cupboard
            }
        }

        for (Map.Entry<String, List<String>> shelfEntry : cupboard.entrySet()) {
            String hashLabel = shelfEntry.getKey();
            List<String> filesOnShelf = shelfEntry.getValue();

            if (filesOnShelf.size() > 1) {
                System.out.println("Hash \"" + hashLabel + "\" is shared by: " + filesOnShelf);
            }
        }
    }
}
