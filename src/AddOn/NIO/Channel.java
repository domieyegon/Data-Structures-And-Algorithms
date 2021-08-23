package AddOn.NIO;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class Channel {
    
    public static void main(String[] args) throws IOException {
        RandomAccessFile accessFile = new RandomAccessFile("/home/meliora/Downloads/sample.txt", "rw");
        FileChannel channel = accessFile.getChannel();
        ByteBuffer buffer = ByteBuffer.allocate(10);

        int nrBytes = channel.read(buffer);

        while ( nrBytes != -1) {
            System.out.println("Read "+ nrBytes);
            buffer.flip();
            while (buffer.hasRemaining()) {
                System.out.print((char) buffer.get());
            }
            buffer.clear();
            nrBytes = channel.read(buffer);
        }
        accessFile.close();
    }

}
