package com.test;
/**
 * 作者：administrator
 * 时间：2019年2月18日 下午3:49:11
 * 说明：
 */
public class TestGit {

	public static void main(String[] args) {
		String tiaojian = " AND tozginfo_h.PK_YWID_H='8369638075298637' ";
		String getData = 
				"SELECT tozginfo_h.pk_ywid_h,\n" + 
				"       tozginfo_h.pk_ywcode,\n" + 
				"       tozginfo_h.pk_tozg_h,\n" + 
				"       tozginfo_h.pk_billcode,\n" + 
				"       tozginfo_h.time,\n" + 
				"       tozginfo_h.backreasoncode,\n" + 
				"       tozginfo_h.backreasonname,\n" + 
				"       tozginfo_h.note,\n" + 
				"       tozginfo_h.type_h,\n" + 
				"       tozginfo_b.pk_ywid_b,\n" + 
				"       tozginfo_b.pk_tozg_b,\n" + 
				"       tozginfo_b.account_b,\n" + 
				"       tozginfo_b.type_b\n" + 
				"  FROM tozginfo_h\n" + 
				"  join (SELECT pk_ywid_h, MAX(time) as time\n" + 
				"          FROM tozginfo_h\n" + 
				"         WHERE pk_ywid_h in\n" + 
				"               (SELECT distinct pk_ywid_h\n" + 
				"                  FROM tozginfo_h\n" + 
				"                 WHERE nvl(dr, 0) = 0\n" + tiaojian +")\n" + tiaojian + 
				"         group by pk_ywid_h) b\n" + 
				"    on tozginfo_h.time = b.time\n" + 
				"   AND tozginfo_h.pk_ywid_h = b.pk_ywid_h\n" + 
				"  join tozginfo_b\n" + 
				"    on tozginfo_h.pk_tozg_h = tozginfo_b.pk_tozg_h\n" + 
				" where tozginfo_h.type_h in ('3', '6', '7', '8')\n" + tiaojian;
		System.out.println(getData);
	}
	

}
