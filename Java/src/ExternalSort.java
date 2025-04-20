package src;

import java.io.*;
import src.QuickSort;

public class ExternalSort {
    /**
     * External sort, first divide into m chunks of size k input files, then sort each of them, merge in the end.
     * KEY1: Divide: lineNum == k, reset new writer with new file.
     * KEY2: Merge:
     * readers   [br1,br2,br3...]
     * minValues [mv1,mv2,mv3...]
     * fileEnds  [F, F, F, ...]
     * sort accepts inputFile with numbers and returns outputFile with sorted numbers inside
     * @param inputFile The file that contains integers, one integer on each line
     * @param outputFile The file where to output the result (sorted in increasing order, one integer per line).
     * @param k number of elements that fit into memory at once
     * @param m number of chunks of size k in the input file; the last chunk may have < k elements.
     */

    public void sort(String inputFile, String outputFile, int k, int m){
        try{
            divide(inputFile, k);
            merge();
            delete();
        }catch (IOException e){
            System.out.println(e);
        }
    }

    /**divide inputFile into multiple tmpFiles with k lines in each of it*/
    private void divide(String inputFile, int k) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(inputFile));
        int[] currBuffer = new int[k];                                  // buffer for quick sort

        int fileNum = 0;                                                // name for current tempFile
        int lineNum = 0;                                                // current line number for inputFile
        String tmpFileName = String.format("tmp%s.txt", fileNum);       // first tmpFile
        BufferedWriter bw = new BufferedWriter(new FileWriter(tmpFileName));

        String line;                                                    // each line we read from inputFile
        while ((line = br.readLine()) != null){
            currBuffer[lineNum] = Integer.parseInt(line);               // store into buffer to sort later
            lineNum++;

            if (lineNum == k){                                          // reach line limit, reset everything
                QuickSort qs = new QuickSort();
                qs.sort(currBuffer);

                for (int v: currBuffer){                                // write all buffer into current tmpFile
                    bw.write(String.valueOf(v));
                    bw.newLine();
                }
                bw.close();                                             // close the previous writer

                fileNum++;
                tmpFileName = String.format("tmp%s.txt", fileNum);
                bw = new BufferedWriter(new FileWriter(tmpFileName));
                lineNum = 0;
            }
        }
        for (int i = 0; i < lineNum; i++) {                             // last chunk line < k, write them manually
            bw.write(String.valueOf(currBuffer[lineNum]));
            bw.newLine();
        }
    }

    /**merge m sorted tmpFiles into one outputFile*/
    private void merge(String outputFile, int m) throws IOException {
        BufferedReader[] readers = new BufferedReader[m];                   // initiate m bufferReaders
        for (int i = 0; i < readers.length; i++) {
            String fileName = String.format("tmp%s.txt", i);
            readers[i] = new BufferedReader(new FileReader(fileName));
        }

        int[] minArray = new int[m];                                    // store min value of each file
        boolean[] fileEnded = new boolean[m];                           // whether current file reach the end
        for (int i = 0; i < minArray.length; i++) {
            String line = readers[i].readLine();
            if (line != null){                                          // check if file ends
                minArray[i] = Integer.parseInt(line);
            }
            else {
                fileEnded[i] = true;
            }
        }

        // merge min value into output


    }


    private void delete(){

    }

}
