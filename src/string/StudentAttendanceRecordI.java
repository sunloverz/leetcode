package string;

public class StudentAttendanceRecordI {
  public boolean checkRecord(String s) {
    int absents = 0;
    for(int i=0;i<s.length();i++)
      if(s.charAt(i)=='A') absents++;
    if(absents>1) return false;
    return !s.contains("LLL");
  }
}
