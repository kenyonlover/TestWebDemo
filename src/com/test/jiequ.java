package com.test;
/**
 * ���ߣ�administrator
 * ʱ�䣺2019��3��13�� ����4:33:04
 * ˵����
 */
public class jiequ {

	public static void main(String[] args) {
		String str = "(pub_workflownote.checkman = '0001B7100000001FIRBP' AND gx_zf_h.dbilldate >= '2019-02-25' AND gx_zf_h.def48 = '������' AND gx_zf_h.def49 = '����')";
		String[] split = str.split("'");
		String userid = null;
		for (int i = 0; i < split.length; i++) {
			if(split[i].indexOf("pub_workflownote.checkman")!=-1) {
				userid = split[i+1];
				break;
			}
		}
		System.out.println(userid);
	}

}
