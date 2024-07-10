package com.walking.lesson20_exceptions.task1_catchException;

import com.walking.lesson20_exceptions.task1_catchException.model.File;
import com.walking.lesson20_exceptions.task1_catchException.service.FileService;
import com.walking.lesson20_exceptions.task1_catchException.model.MediaType;

import java.io.FileNotFoundException;

/**
 * Создайте массив, имитирующий простейшую файловую систему и содержащий объекты файлов.
 * <p>
 * Реализуйте класс «Файл» содержит название файла, его размер и тип информации
 * (Текст, изображение, аудио, видео. Рекомендую задать типы информации через Enum).
 * <p>
 * Реализуйте механизм поиска по файлам.
 * Метод, реализующий поиск должен выбрасывать FileNotFoundException, если файл не найден.
 * Если файл с названием, введенным пользователем с клавиатуры,
 * существует – вывести на экран информацию о нем
 * (допустимо использовать переопределенный toString()).
 * Если нет, то выведите сообщение «Искомый файл не существует».
 */
public class Main {
    public static void main(String[] args) {
        FileService service = new FileService(intFiles());

        try {
            System.out.println(service.findByName("file11.txt"));
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    public static File[] intFiles() {
        File file1 = new File("file1.txt", 100, MediaType.TEXT);
        File file2 = new File("file2.txt", 200, MediaType.TEXT);
        File file3 = new File("file3.avi", 10000, MediaType.VIDEO);
        File file4 = new File("file4.bmp", 400, MediaType.IMAGE);
        File file5 = new File("file5.mp3", 5000, MediaType.AUDIO);

        return new File[]{file1, file2, file3, file4, file5};
    }
}
