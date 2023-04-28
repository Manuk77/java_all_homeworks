package org.all_homeworks.homeworks.exceptions.exercise4;
import java.io.FileReader;
import java.io.IOException;
public class FileReaderFromUser {
    private FileReader fileReader;

    /**
     * this method sets the reference to the instance fileReader if it's not null,
     * if it's null it will throw new NullPointerException
     * @param fileReader
     * @throws NullPointerException
     */
    public void setFileReader(FileReader fileReader) throws NullPointerException {
        if(fileReader != null){
            this.fileReader = fileReader;
        }else{
           try {
               throw new NullPointerException("NullPointerException: the argument of the function must not be null");
           }catch (NullPointerException e){
               System.out.println(e.getMessage());
           }
        }
    }

    /**
     * with this method we can get the fileReader
     * @return FileReader type fileReader
     */
    public FileReader getFileReader() {
        return fileReader;
    }

    /**
     * this method reads the file
     * @throws IOException
     */
    public void read() throws IOException{
        try {
            this.fileReader.read();
            System.out.println("file read");
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    /**
     * this method close the file from reading
     * @throws IOException
     */
    public void close() throws  IOException {
        try {
            this.fileReader.close();
            System.out.println("file close");
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }

    /**
     * constructor
     * @param fileReader
     * @throws NullPointerException
     */
    public FileReaderFromUser (FileReader fileReader) throws NullPointerException {
        if(fileReader != null){
            this.fileReader = fileReader;
        }else{
            try {
                throw new NullPointerException("NullPointerException: the argument of the function must not be null");
            }catch (NullPointerException e){
                System.out.println(e.getMessage());
            }
        }
    }

    public FileReaderFromUser(){
        this.fileReader = null;
    };

}
