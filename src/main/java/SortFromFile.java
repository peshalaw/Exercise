import java.io.*;
import java.util.ArrayList;

/**
 * Created by peshala on 4/6/16.
 */
public class SortFromFile {

    public static void ascending(ArrayList<Integer> arrayList) throws IOException {
        File file = new File("/home/peshala/Desktop/Exercise/src/main/java/ascending");
        if (!file.exists()) {
            file.createNewFile();
        }
        FileWriter fw = new FileWriter(file.getAbsoluteFile());
        BufferedWriter bw = new BufferedWriter(fw);
        for (int k=0;k<arrayList.size();k++) {
            for (int j=0;j<arrayList.size()-1;j++){
                if(arrayList.get(j)>arrayList.get(j+1)){
                    int temp=arrayList.get(j);
                    arrayList.set(j,arrayList.get(j+1));
                    arrayList.set(j+1,temp);
                }
            }
        }

        for(int i=0;i<arrayList.size();i++){


            try {
                bw.write(Integer.toString(arrayList.get(i)));
                bw.newLine();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        bw.close();
    }

    public static void descending(ArrayList<Integer> arrayList) throws IOException {
        File file = new File("/home/peshala/Desktop/Exercise/src/main/java/descending");
        if (!file.exists()) {
            file.createNewFile();
        }
        FileWriter fw = new FileWriter(file.getAbsoluteFile());
        BufferedWriter bw = new BufferedWriter(fw);
        for (int k=0;k<arrayList.size();k++) {
            for (int j=0;j<arrayList.size()-1;j++){
                if(arrayList.get(j)<arrayList.get(j+1)){
                    int temp=arrayList.get(j);
                    arrayList.set(j,arrayList.get(j+1));
                    arrayList.set(j+1,temp);
                }
            }
        }

        for(int i=0;i<arrayList.size();i++){


            try {
                bw.write(Integer.toString(arrayList.get(i)));
                bw.newLine();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        bw.close();
    }

    public static void sortNums() throws Exception{
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter name of the file");
//        String name=sc.nextLine();
        File file = new File("/home/peshala/Desktop/Exercise/src/main/java/test");
        FileReader fileReader = new FileReader(file);
        BufferedReader reader=new BufferedReader(fileReader);
        String line;
        ArrayList<Integer> nums=new ArrayList<Integer>();
        while ((line=reader.readLine())!=null) {
            int number=Integer.parseInt(line);
            nums.add(number);
        }

        ascending(nums);
        descending(nums);
    }

}
