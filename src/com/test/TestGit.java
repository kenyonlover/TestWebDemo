package com.test;

import java.text.DecimalFormat;

/**
 * ���ߣ�administrator
 * ʱ�䣺2019��2��18�� ����3:49:11
 * ˵����
 */
public class TestGit {

	public static void main(String[] args) {
		//System.out.println(getQuerySql("成本初审", "初审", "<1"));
		
		System.out.println(new DecimalFormat("#.00").format(11*1.00/13));
		 System.out.println(String.format("%.2f", 11*1.00/13));
	}
	
	private static String getQuerySql(String gw, String hj, String days){
		String sql = 
			"SELECT count(distinct ai.pk_approveinfo) nums\n" +
			"  FROM gx_zf_h h\n" + 
			"  join gx_approveinfo ai ON h.def3 = ai.yw_billid\n" + 
			"  join pub_workflownote pw ON pw.pk_checkflow = ai.pk_checkflow\n" + 
			"  join bd_psnbasdoc bpb ON bpb.pk_psnbasdoc = ai.dealman_id\n" + 
			"  join lg_gwdb gw ON bpb.vdef10 = gw.pk_gw\n" + 
			" WHERE gw.name like '%"+ gw +"%'\n" + 
			"   AND ai.dealaction = '未审批'\n" + 
			"   AND ai.end_time is null\n" + 
			"   AND ai.gx_active = '"+ hj +"'\n" + 
			"   AND pw.actiontype <> 'BIZ'\n" + 
			"   AND pw.ischeck = 'N'\n" + 
			"   AND abs(round(to_number(to_date((to_char(sysdate,\n" + 
			"                                            'yyyy-MM-dd HH24:mm:ss')),\n" + 
			"                                   'yyyy-MM-dd HH24:mi:ss') -\n" + 
			"                           to_date(ai.start_time, 'yyyy-MM-dd HH24:mi:ss')),\n" + 
			"                 1)) "+ days +" ";
		return sql;
	}
	

}
