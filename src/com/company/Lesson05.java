package com.company;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Lesson05 {
    public static class AppData {
        static final String Q_NEW_LINE = "\n";
        static final String Q_SEMICOLON = ";";
        public static ArrayList<RowClass<Serializable>> fileArrayList = new ArrayList<>();
        public static final String file1Path = "src/main/java/homework5/file1.csv";
        public static final String file2Path = "src/main/java/homework5/file2.csv";
        static final String Q_VALUE = "Value ";

        public static void main(String[] args) throws IOException {
            createRow();
            writeFile1();
            writeFile2();
            AppData appData = readFile();
            printAppData(appData);
            changeHeaderAppData(appData);
            printAppData(appData);
            save(appData);
        }

        public static void createRow() {
            fileArrayList.add(new RowClass<>(Q_VALUE + 1, Q_VALUE + 2, Q_VALUE + 3));
            Random random = new Random();
            for (int i = 1; i <= 3; i++) {
                fileArrayList.add(new RowClass<>(random.nextInt(999), random.nextInt(999), random.nextInt(999)));
            }
        }

        public static void writeFile1() throws IOException {
            try (FileOutputStream fileOutputStream = new FileOutputStream(file1Path)) {
                for (var row : fileArrayList) {
                    String raw = row.getValue_1() + Q_SEMICOLON + row.getValue_2() + Q_SEMICOLON + row.getValue_3() + Q_SEMICOLON + Q_NEW_LINE;
                    for (byte b : raw.getBytes(StandardCharsets.UTF_8)) {
                        fileOutputStream.write(b);
                    }
                }

            }
        }

        public static void writeFile2() throws IOException {
            try (FileWriter writer = new FileWriter(file2Path)) {
                for (var row : fileArrayList) {
                    writer.write(row.getValue_1() + Q_SEMICOLON + row.getValue_2() + Q_SEMICOLON + row.getValue_3() + Q_SEMICOLON + Q_NEW_LINE);
                }
            }
        }

        public static AppData readFile() throws IOException {
            AppData appData = new AppData();
            List<List<String>> fileLines = new ArrayList<>();
            try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file1Path))) {
                String line = bufferedReader.readLine();
                appData.setHeader(line.split(Q_SEMICOLON));
                while ((line = bufferedReader.readLine()) != null) {
                    fileLines.add(Arrays.asList(line.split(Q_SEMICOLON)));
                }
            }

            int[][] resultData = new int[fileLines.size()][3];

            for (int i = 0; i < fileLines.size(); i++) {
                for (int j = 0; j < fileLines.get(i).size(); j++) {
                    resultData[i][j] = Integer.parseInt(fileLines.get(i).get(j));
                }
            }
            appData.setData(resultData);

            return appData;
        }

        public static void printAppData(AppData appData) {
            System.out.println(Arrays.toString(appData.getHeader()));
            for (int[] data : appData.getData()) {
                System.out.println(Arrays.toString(data));
            }
        }

        public static void changeHeaderAppData(AppData appData) {
            appData.setHeader(new String[]{Q_VALUE + 11 + Q_SEMICOLON + Q_VALUE + 22 + Q_SEMICOLON + Q_VALUE + 33});
        }

        public static void save(AppData data) throws IOException {
            try (FileWriter fileWriter = new FileWriter(file1Path)) {

                StringBuilder valveHeader = new StringBuilder();
                for (String value : data.getHeader()) {
                    valveHeader.append(value).append(Q_SEMICOLON);
                }
                fileWriter.write(valveHeader + Q_NEW_LINE);

                for (int[] row : data.getData()) {
                    StringBuilder valveData = new StringBuilder();
                    for (int value : row) {
                        valveData.append(value).append(Q_SEMICOLON);
                    }
                    fileWriter.write(valveData + Q_NEW_LINE);
                }
            }
        }


        private String[] header;
        private int[][] data;

        public void setHeader(String[] header) {
            this.header = header;
        }

        public void setData(int[][] data) {
            this.data = data;
        }

        public String[] getHeader() {
            return header;
        }

        public int[][] getData() {
            return data;
        }

        public static class RowClass<T> {

            private final T value_1, value_2, value_3;

            public RowClass(T value_1, T value_2, T value_3) {
                this.value_1 = value_1;
                this.value_2 = value_2;
                this.value_3 = value_3;
            }

            public T getValue_1() {
                return value_1;
            }

            public T getValue_2() {
                return value_2;
            }

            public T getValue_3() {
                return value_3;
            }
        }
    }
}

