class RemoveExtraText {
    public static void main(String args[]) {
        // Sample input
        String originalText = "Please read - Do not disturb";
        String exactSubstringToDelete = "- Do not disturb";

        // Use StringBuilder
        StringBuilder sb = new StringBuilder(originalText);

        // Find the start index of the substring to delete
        int startIndex = sb.indexOf(exactSubstringToDelete);

        // If the substring exists, delete it
        if (startIndex != -1) {
            sb.delete(startIndex, startIndex + exactSubstringToDelete.length());
        }

        // Convert to string and print
        String result = sb.toString().trim(); // trim() to remove extra spaces
        System.out.println(result);
    }
}
