import java.util.Scanner;

public class Project_bryan_perez
{
   public static void main(String[] args)
      {  
         int policyNumber;
         String providerName;
         String holderFirstName;
         String holderLastName;
         int policyHolderAge;
         String holderSmokerStatus;
         double holderHeight;
         double holderWeight;

         Scanner keyboard = new Scanner(System.in);
         
         System.out.print("Please enter the Policy Number: ");
         policyNumber = keyboard.nextInt();
         keyboard.nextLine();
         
         System.out.print("Please enter the Provider Name: ");
         providerName = keyboard.nextLine();
         
         System.out.print("Please enter the Policyholder's First Name: ");
         holderFirstName = keyboard.nextLine();
         
         System.out.print("Please enter the Policyholder's Last Name: ");
         holderLastName = keyboard.nextLine();
         
         System.out.print("Please enter the Policyholder's Age: ");
         policyHolderAge = keyboard.nextInt();
         keyboard.nextLine();
         
         System.out.print("Please enter the Policyholder's Smoking Status (smoker/non-smoker): ");
         holderSmokerStatus = keyboard.nextLine();
         
         System.out.print("Please enter the Policyholder's Height (in inches): ");
         holderHeight = keyboard.nextDouble();
         
         System.out.print("Please enter the Policyholder's weight (in pounds): ");
         holderWeight = keyboard.nextDouble();
         keyboard.nextLine();
         
         Policy policy = new Policy(policyNumber, providerName, holderFirstName, holderLastName, policyHolderAge, holderSmokerStatus, holderHeight, holderWeight);
         
         System.out.println("Policy Number: " + policy.getPolicyNumber());
         System.out.println("Provider Name: " + policy.getProviderName());
         System.out.println("Policyholder's First Name: " + policy.getHolderFirstName());
         System.out.println("Policyholder's Last Name: " + policy.getHolderLastName());
         System.out.println("Policyholder's Age: " + policy.getPolicyHolderAge());
         System.out.println("Policyholder's Smoking Status: " + policy.getHolderSmokerStatus());
         System.out.printf("Policyholder's Height: %,.1f inches\n", policy.getHolderHeight());
         System.out.printf("Policyholder's Weight: %,.1f pounds\n", policy.getHolderWeight());
         System.out.printf("Policyholder's BMI: %,.2f\n", policy.calculateBMI());
         System.out.printf("Policy Price: $%,.2f\n", policy.calculateInsurancePolicyPrice());
         
      }         
}