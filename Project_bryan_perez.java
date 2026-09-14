import java.util.Scanner;
import java.io.*;
import java.util.ArrayList;

public class Project_bryan_perez
{
   public static void main(String[] args) throws IOException
      {  
         int policyNumber;
         String providerName;
         String holderFirstName;
         String holderLastName;
         int policyHolderAge;
         String holderSmokerStatus;
         double holderHeight;
         double holderWeight;
         
         int smokerCount = 0;
         int nonSmokerCount = 0;
         
         ArrayList<Policy> policyList = new ArrayList<>();
         
         File file = new File ("PolicyInformation.txt");
         
         Scanner inputFile = new Scanner(file);
         
         while (inputFile.hasNextLine())
         {
         
            policyNumber = inputFile.nextInt();
            inputFile.nextLine();
         
            providerName = inputFile.nextLine();
            holderFirstName = inputFile.nextLine();
            holderLastName = inputFile.nextLine();
         
            policyHolderAge = inputFile.nextInt();
            inputFile.nextLine();
         
            holderSmokerStatus = inputFile.nextLine();
         
            holderHeight = inputFile.nextDouble();
            holderWeight = inputFile.nextDouble();
            
            inputFile.nextLine(); 
         
            if (holderSmokerStatus.equalsIgnoreCase("smoker")){
               smokerCount++;
            }
            else {
               nonSmokerCount++;
            }
            
            Policy policy = new Policy(policyNumber, providerName, holderFirstName, holderLastName, policyHolderAge, holderSmokerStatus, holderHeight, holderWeight);
            policyList.add(policy);
            
         }
            inputFile.close();
         
            for (Policy policy : policyList)
            {
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
               System.out.println();
         
            }  
            System.out.println("The number of policies with a smoker is: " + smokerCount);  
            System.out.println("The number of policies with a non-smoker is: " + nonSmokerCount);      
        }
}