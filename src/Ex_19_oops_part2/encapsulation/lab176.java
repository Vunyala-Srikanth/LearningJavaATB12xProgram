package Ex_19_oops_part2.encapsulation;

public class lab176 {
    public static void main(String[] args) {

        vwlogin vw =  new vwlogin("admin","pass234");
        System.out.println(vw.username);
        System.out.println(vw.password);
        vw.password="pas888";
        System.out.println(vw.password);


        goodlogin gd = new goodlogin("db","sa");
        System.out.println(gd.getUsername());
        System.out.println(gd.getPassword());
        gd .setPassword("raodask@!@3",true);
        System.out.println(gd.getPassword());
            }
}



class vwlogin{
public  String username;
public String  password;

public vwlogin(String username,String password){
    this.username = username;
    this.password = password;
}
}

class goodlogin{
    private String username;
    private  String password;

    public goodlogin(String username,String password){
        this.username=username;
        this.password = password;
    }

   public String getUsername() {
       return username;
   }

    public void setUsername(String username) {
        this.username = username;
    }

 public String getPassword() {
      return password;
   }

    public boolean setPassword(String password,boolean isadmin) {
        if (isadmin) {
            this.password = password;
        } else {
            System.out.println("Not allowed Set the password, Not a admin!");
        }

        return isadmin;
    }
}