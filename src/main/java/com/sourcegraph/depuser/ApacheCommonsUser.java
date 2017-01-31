package com.sourcegraph.depuser;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.input.BOMInputStream;
import org.apache.commons.io.output.ChunkedWriter;

import java.io.*;
import java.math.BigInteger;

public class ApacheCommonsUser {
    public void callBOMInputStream() throws IOException {
        BOMInputStream bomInputStream = new BOMInputStream(new FileInputStream("somefile"));
        bomInputStream.getBOM();
        bomInputStream.close();
    }

    public void callChunkedWriter() throws IOException {
        ChunkedWriter chunkedWriter = new ChunkedWriter(new FileWriter("somefile"), 10);
        chunkedWriter.write("hello");
        chunkedWriter.close();
    }

    public void callFileUtils() throws IOException {
        BigInteger oneKbBi = FileUtils.ONE_KB_BI;
        String s = FileUtils.byteCountToDisplaySize(10);
        FileUtils.isSymlink(new File("some file"));
    }

    public static class MyOutputStream extends ByteArrayOutputStream {
        @Override
        public void write(final byte[] b, final int off, final int len) {
            super.write(b, off, len);
        }
    }
}