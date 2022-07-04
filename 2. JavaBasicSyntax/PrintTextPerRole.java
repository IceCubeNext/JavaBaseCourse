public class PrintTextPerRole {
    public static String printTextPerRole(String[] roles, String[] textLines) {
        StringBuffer result = new StringBuffer();
        StringBuffer[] temp = new StringBuffer[roles.length];
        for (int j = 0; j < temp.length; j++){
            temp[j] = new StringBuffer("");
        }
        for(int i = 0; i < textLines.length; i++){
            for (int j = 0; j < roles.length; j++){
                if(textLines[i].indexOf(roles[j] + ": ") == 0){
                    temp[j].append((i + 1) + ") " + textLines[i].substring((roles[j] + ": ").length()) + "\n");
                    break;
                }
            }
        }
        for (int j = 0; j < roles.length; j++){
            result.append(roles[j] + ":\n");
            result.append(temp[j] + "\n");
        }
        return result.toString();
    }
}
