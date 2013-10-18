
public class StringHandling {
	public static void main(String [] args){
		String s1="laptop";
		String s2="LapTop";
		System.out.println(s1.equals(s2));
		System.out.println(s1.equalsIgnoreCase(s2));
		System.out.println(s1.startsWith("to", 3));
		String s=s1+s2;
		System.out.println(s);
		System.out.println(s.charAt(3));
		
		int start=1;
		int end=6;
		char [] ch=new char [end-start]; 
		int [] chs=new int [end-start]; 
		s.getChars(1, 5, ch, 1);
		ch[0]='?';
		System.out.println(chs[3]);
		String s3="he is"+ " 2"+ "4";
		System.out.println(s3);
		String s4="he is"+ (" 2"+ "4");
		System.out.println(s4);
		String s5="he is "+ (2+ 4);
		System.out.println(s5);
		String s6="he is "+ 2+ 4;
		System.out.println(s6);
		String s7=s;
		System.out.println(s7);
		System.out.println(s.equals(s7));
		System.out.println(s7==s);
		String s8=new String(s);
		System.out.println(s7==s8);
		
		
		String []s9={"Neo", "the", "to", "welcome", "matrix,"};
		for(int i=0; i<s9.length; i++){
			for(int j=i+1; j<s9.length; j++){
				if(s9[j].compareTo/*IgnoreCase*/(s9[i])>0){
					String t=s9[i];
					s9[i]=s9[j];
					s9[j]=t;
				}
			}
			System.out.print(s9[i]+"  ");
		}
		
		String s10="welcome to the matrix Neo";
		System.out.println("index of t "+ s10.indexOf('t'));
		System.out.println("index of t "+ s10.indexOf('t', 12));
		System.out.println("index of t "+ s10.indexOf("the"));
		System.out.println("index of t "+ s10.indexOf("the", 10));
		System.out.println("last index of t "+ s10.lastIndexOf('t'));
		System.out.println("last index of t "+ s10.lastIndexOf('t', 16));
		
		
		String s11=s1.concat(s2);
		System.out.println(s11);
		String s12=s1.replace('p', 'k');
		System.out.println(s12);
		String s13=s.replace("op", "ik");
		System.out.println(s13);
		String s14="    welcome to the   matrix  Neo   ";
		String s15="    welcome to the   matrix  Neo   ".trim();
		System.out.println(s14.length()+" "+s15.length());
		char []ch1={'s', 'h', 'a', 's', 'h','i'};
		String s16=s.valueOf(ch1, 1, 4);
		System.out.println(s16);
		String s17=s13.toUpperCase();
		System.out.println(s17);
		int a=s.codePointAt(3);
		System.out.println(a);
		int b=s14.codePointCount(2, 17);
		System.out.println(b);
		String [] s18=s.split(s, 4);
		System.out.println(s18);
		StringBuffer sb=new StringBuffer("hello");
		int sbc=sb.capacity();
		int sbl=sb.length();
		System.out.println(sbc+" "+sbl);
		StringBuffer sb1=new StringBuffer("");
		System.out.println(sb1.capacity()+ " "+ sb1.length());
		StringBuffer sb2=new StringBuffer(4);
		System.out.println(sb2.capacity()+ " "+ sb2.length());
		//sb.setLength(3);
		//System.out.println(sb);
		String s19;
		int c=12;
		StringBuffer sb3=new StringBuffer(12);
		s19=sb3.append("a= ").append(c).toString();
		System.out.println(s19);
		sb.replace(1, 3, "yephdjhdjd");
		System.out.println(sb);
		StringBuffer sb5=new StringBuffer("one two three one four one six one one hello");
		int l=sb5.length();
		int [] A=new int [l];
		for(int i=0; i<l; i++){
			A[i]=sb5.indexOf("one");
			System.out.print(A[i]+" ");
		}
	}
}
