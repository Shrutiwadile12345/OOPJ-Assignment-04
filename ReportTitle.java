class ReportTitle{

   public static void main(String args[]){
   
   String originalTitle = "Annual  Report";
   String departmentName = "CDAC";
   
   StringBuilder sb = new StringBuilder(originalTitle);
   sb.insert(7, " " + departmentName);
   
   System.out.println(sb.toString());
   
   }
}