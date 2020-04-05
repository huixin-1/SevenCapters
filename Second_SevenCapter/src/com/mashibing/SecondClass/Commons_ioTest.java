package com.mashibing.SecondClass;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.filefilter.EmptyFileFilter;

import java.io.File;
import java.io.FileFilter;
import java.util.Collection;

import static org.apache.commons.io.filefilter.EmptyFileFilter.NOT_EMPTY;

//使用多线程前，需要下载commmons-io包
public class Commons_ioTest {
    public static void main(String[] args) {
        long length = FileUtils.sizeOf(new File("baidu.html"));
        System.out.println(length);
        Collection<File> files = FileUtils.listFiles(new File("c:"),EmptyFileFilter.NOT_EMPTY,null);
        for (File file:files){
            System.out.println(file.getAbsolutePath());
        }

    }
}
