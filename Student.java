public class Student {
    private String stdID;
    private String stdName;
    private String stdGrade;
    private int stdGroup;
    private String stdSecretNickName;

      
    public Student(String pID,String pName,String pGrade, int pGroup, String pSecretNickName){
        this.stdID = pID;
        this.stdName = pName;
        this.stdGrade = pGrade;
        this.stdGroup = pGroup;
        this.stdSecretNickName = pSecretNickName;
        }
 
    public String getStudentGrade(){
          return stdGrade;    
    }

    private boolean setStudentGrade(String pGrade){
        if ("ABCDEF".indexOf(pGrade) == -1) {
           return false;
        }
        stdGrade = pGrade;
        return true;
    }

    public String getStudentName(){
        return stdName;    

    }
    private boolean setStudentGroup(int pGroup){
            if (pGroup < 1 || pGroup > 5) {
               return false;
            }
            stdGroup = pGroup;
            return true;
        }
  }

}
