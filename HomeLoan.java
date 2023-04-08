public class HomeLoan extends Loan {
    public void loanType(){
        System.out.println("It is a Home Loan");
    }
    public void loanRate(int rate){
   System.out.println("The Interest Rate of Home Loan is: " + rate*8+"%");
    }
}
