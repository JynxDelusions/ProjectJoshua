//Breion Joshua
//May 9th, 2026
//Computer Science II

import java.io.*;

public class M8A1 {
    public static void main(String[] args) {

        //opens input and output files for reading/writing
        try {
            BufferedReader br = new BufferedReader(new FileReader("pay.csv"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("output.csv"));

            //Skips header and writes it in the header
            br.readLine();
            bw.write("EmpID,PayRate,HoursWorked,WeeklyPay\n");

            String line;
            while ((line = br.readLine()) != null) {

                //Splits line with commas
                String[] p = line.split(",");

                //Extracts the values from CSV
                String id = p[0];
                double rate = Double.parseDouble(p[1]);
                double hours = Double.parseDouble(p[2]);

                //calcuates weekly pay
                double pay;
                if (hours > 40) {
                    pay = 40 * rate + (hours - 40) * rate * 1.5;
                } else {
                    pay = hours * rate;
                }

                //Format weekly pay by two decimal points
                String formatted = String.format("$%.2f", pay);

                //Writes data to the output
                bw.write(id + "," + rate + "," + hours + "," + formatted + "\n");
            }

            //Closes the files
            br.close();
            bw.close();
            
            //Catches and prints any errors
        } catch (Exception e) {
            e.printStackTrace();
        }
     }
}