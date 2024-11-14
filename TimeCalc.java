public class TimeCalc {
    public static void main(String[] args) {
        //gets a time input which is given using the 24-hour hh:mm format
        //gets number of minutesToAdd input.
        // Replace this comment with your code
        String timeInput = args[0];
        int inputHours = (Integer.parseInt(timeInput.substring(0, 2))) * 60;
        int inputMinutes = Integer.parseInt(timeInput.substring(3, 5));
        int minutesToAdd = Integer.parseInt(args[1]);
        int totalMinutesToAdd = inputHours + inputMinutes + minutesToAdd;
        int totalHours = totalMinutesToAdd / 60;
        totalMinutesToAdd = totalMinutesToAdd % 60;
        while (totalHours >= 24) {
            totalHours = totalHours - 24;
        }
        String buildHours = "";
        if(totalHours < 10) {
            buildHours = "0" + totalHours;
        } else  buildHours = "" + totalHours;
        String buildMinutes = "";
        if (totalMinutesToAdd < 10){
            buildMinutes = "0" + totalMinutesToAdd;
        } else buildMinutes = "" + totalMinutesToAdd;
        System.out.println(buildHours + ":" + buildMinutes);
    }
}
