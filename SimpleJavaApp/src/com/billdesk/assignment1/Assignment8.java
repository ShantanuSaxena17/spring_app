package com.billdesk.assignment1;

import java.io.FileReader;
import java.util.Scanner;

public class Assignment8 {
	public static void main(String[] args) {
		try {
            BufferedReader br = new BufferedReader(new FileReader("input.csv"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("output.txt"));

            String line;

            // Read and write the header
            line = br.readLine();
            if (line != null) {
                bw.write(line);
                bw.newLine();
            }

            // Read each employee record
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");

                // Check if the record has exactly 3 fields
                if (data.length == 3) {
                    String email = data[2].trim();

                    // Validate email
                    if (email.contains("@")) {
                        bw.write(line);
                        bw.newLine();
                    }
                }
            }

            br.close();
            bw.close();

            System.out.println("Valid records have been written to output.txt");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
	}
}
