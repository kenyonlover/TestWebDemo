package com.test;

import java.io.FileNotFoundException;

import java.io.IOException;
import java.io.File;

/**
 * ���ߣ�administrator ʱ�䣺2019��3��1�� ����1:41:25 ˵����
 */
public class FileName {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		String filepath = "C:\\Users\\Administrator\\Desktop\\buding\\Temp";
		readfile(filepath);
	}

	/**
	 * ��ȡĳ���ļ����µ������ļ�
	 */
	public static boolean readfile(String filepath) throws FileNotFoundException, IOException {
		try {

			File file = new File(filepath);
			if (!file.isDirectory()) {
				// System.out.println("�ļ�");
				// System.out.println("path=" + file.getPath());
				System.out.println(/* "absolutepath=" + */"@"+file.getAbsolutePath()+";");
				// System.out.println("name=" + file.getName());
			} else if (file.isDirectory()) {
				// System.out.println("�ļ���");
				String[] filelist = file.list();
				for (int i = 0; i < filelist.length; i++) {
					File readfile = new File(filepath + "\\" + filelist[i]);
					if (!readfile.isDirectory()) {
						// System.out.println("path=" + readfile.getPath());
						System.out.println(/* "absolutepath=" + */"@"+readfile.getAbsolutePath()+";");
						// System.out.println("name=" + readfile.getName());
					} else if (readfile.isDirectory()) {
						readfile(filepath + "\\" + filelist[i]);
					}
				}
			}
		} catch (FileNotFoundException e) {
			System.out.println("readfile()   Exception:" + e.getMessage());
		}
		return true;
	}

}
