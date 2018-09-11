package pds3;

public class Tool {
	public static synchronized String checkNull(String str) {
		if(str == null) {
			str="";
		}else {
			if(str.equals("null")) {
				str="";
			}else {
				str=str.trim();
			}
		}
		return str;
	}
	//static synchronized: 메소드 실행을 요청에 대하여 순차적으로 실행
	public static synchronized String convertChar(String str) {
		str=str.replaceAll("<", "<");
		str=str.replaceAll(">", ">");
		str=str.replaceAll("'", "'");
		str=str.replaceAll("￦", "￦");
		str=str.replaceAll("\r\n", "<br>");
		
		return str;
	}
	/**
	 * 파일의 확장자를 추출합니다.
	 * @param name 파일명
	 * @return 파일 확장자 예) winter.jpg ==> jpg*/
	
	public static synchronized String fileExtend(String file) {
		if(file != null) {
			file=file.toLowerCase(); // 소문자로 변경
			
			int point=file.lastIndexOf("."); // 마지막으로 나타난 '.'의 위치
			file=file.substring(point+1); // .jpg ==> jpg
		}else {
			file=""; // null 에러 방지용 초기값
		}
		return file;
	}
	//다큐멘테이션 @로 작성자나 설명등을 넣을 수 있다.
	/**
	 * 정수형 파일 크기에 데이터 단위를 추가합니다.
	 * @param length
	 * @return*/
	public static synchronized String unit(long length) {
		String str="";
		
		if(length<1024) { // Byte: 0~1024
			str=length+"Byte";
		}else if(length<(1024*1024)) { // Byte: 1024 ~ 1048575
			str=length/1024+" KB";
		}else if(length<(1024*1024*1024)) { // Byte: 1048576 ~ 1073741823
			str=length/1024/1024 +" MB";
		}else if(length<(1024*1024*1024*1024)) { // 1073741824 ~
			str=length/1024/1024/1024+" GB";
		}
		return str;
	}
	/**
	 * 이미지인지 검사합니다.
	 * @param file 검사할 파일명
	 * @return true: 이미지, false: 이미지 아님*/
	
	public static synchronized boolean isImage(String file) {
		boolean sw=false; // 이미지 여부 검사
		
		if(file != null) {
			file = file.toLowerCase(); // 소문자로 변경
			
			int point=file.lastIndexOf("."); // 마지막으로 나타난 '.'의 위치
			String ext = file.substring(point+1); // .jpg --> jpg
			
			if(ext.equals("jpg")|| ext.equals("gif")||ext.equals("png")) {
				sw=true;
			}
		}
		return sw;
	}
}
