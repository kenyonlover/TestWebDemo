package com.test;

import java.io.File;

/**
 * 作者：administrator
 * 时间：2019年5月16日 下午5:39:24
 * 说明：获取某个目录下的所有sql文件的名称
 */
public class File_Name_Demo {

	public static void main(String[] args) {
		File root = new File("C:\\TEMP");
		sysoFileName(root);
	}
	
	public static void sysoFileName(File root) {
		boolean directory = root.isDirectory();
		if(directory) {
			File[] listFiles = root.listFiles();
			for (File file : listFiles) {
				if(file.isDirectory()) {
					sysoFileName(file);
				}else {
					System.out.println("@"+file.getAbsolutePath()+";");
				}
			}
		}else {
			System.out.println("@"+root.getAbsolutePath()+";");
		}
	}

}
