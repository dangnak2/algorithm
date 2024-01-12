class Solution {
    public String solution(String new_id) {
        
        new_id = new_id.toLowerCase();
        new_id = new_id.replaceAll("[^0-9a-z-._]", "");
        new_id = new_id.replaceAll("\\.+", ".");
        new_id = new_id.replaceAll("^[.]|[.]$", "");
        new_id = new_id.length() == 0 ? new_id + "a" : new_id;
        new_id = new_id.length() > 15 ? new_id.substring(0, 15) : new_id;
        new_id = new_id.replaceAll("^[.]|[.]$", "");
        while(new_id.length() < 3){
            new_id += (char)(new_id.charAt(new_id.length() - 1));
        }
        return new_id;
    }
}