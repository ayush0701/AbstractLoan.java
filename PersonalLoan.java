public class PersonalLoan extends Loan  {
    public void loanType(){
        System.out.println("It is a Personal Loan: ");
    }
    public void loanRate(int rate){
        System.out.println("The Interest Rate of Personal oan is: " + rate*12+"%");
         }
}
