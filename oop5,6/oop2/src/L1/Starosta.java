package L1;

import L1.exception.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class Starosta {
    public static void checkIndex(int index, List<Courses> list) {
        int size = list.size();
        if (index < 0 || index > size - 1) throw new IndexOutOfBounds("Индекс невозможен или не сущесвует.");
        list.get(index).people();
    }

    public static void outLine(FileReader f) throws IOException {
        String line = readFile(f);
        if (line == null) throw new FileNullException("Файл пуст.");
        System.out.println(line);
    }
    public static String readFile(FileReader f) throws IOException {
        BufferedReader reader = new BufferedReader(f);
        return reader.readLine();
    }
}
