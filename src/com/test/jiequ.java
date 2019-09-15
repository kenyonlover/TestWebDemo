package com.test;
/**
 * 作者：administrator
 * 时间：2019年3月13日 下午4:33:04
 * 说明：
 */
public class jiequ {

	public static void main(String[] args) {
		String str = "(pub_workflownote.checkman = '0001B7100000001FIRBP' AND gx_zf_h.dbilldate >= '2019-02-25' AND gx_zf_h.def48 = '待处理' AND gx_zf_h.def49 = '初审')";
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
