package com.saifiahmada.zhs.belajar.coba;

import java.text.SimpleDateFormat;
import java.util.Date;

/** @author Saifi Ahmada Nov 29, 2014 2:52:37 PM **/

public class Test2 {
	
	public static void main (String [] args){
		
		String doc = "KWITANSI";
		int noUrutDariDatabase = 5;
		String noTransaksi = getFormattedRunno(doc, 5);
		System.out.println(noTransaksi);
		
	}
	
	public static String getFormattedRunno(String idDoc, Integer runnum) {
		return idDoc
				+ "/"
				+ getBulanTahun()
				+ "/"
				+ lpad(new StringBuilder().append(runnum).append("").toString(),
						5, "0");
	}

	public static String lpad(String strSource, int width, String symbol) {
		String tempStr = strSource;
		if ((strSource == null) || (strSource.equalsIgnoreCase(""))) {
			return "";
		}
		int pjgSource = strSource.length();

		if (width < 0) {
			return "";
		}

		if (width >= pjgSource) {
			for (int i = 0; i < width - pjgSource; i++) {
				tempStr = symbol + tempStr;
			}
			if (tempStr.length() > width)
				tempStr = tempStr.substring(tempStr.length() - width);
		} else {
			tempStr = tempStr.substring(0, width);
		}

		return tempStr;
	}
	
	public static String getBulanTahun(){
		SimpleDateFormat sdf = new SimpleDateFormat("yy/MM");
		return sdf.format(new Date()); 
	}

}
