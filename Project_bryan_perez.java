import java.io.*;
import java.util.Scanner;
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
         
         ArrayList<Policy> policyList = new ArrayList<Policy>();
         
         File file = new File ("PolicyInformation.txt");
         
         Scanner inputFile = new Scanner(file);
         
         while (inputFile.hasNextLine()) {
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

            PolicyHolder policyHolder = new PolicyHolder(holderFirstName, holderLastName, policyHolderAge, holderSmokerStatus, holderHeight, holderWeight);

            Policy policy = new Policy(policyNumber, providerName, policyHolder);
            policyList.add(policy);
            
         }
         inputFile.close();
         
         for (Policy policy : policyList)
         {
            System.out.println(policy);
            System.out.println();
         
         }
         System.out.println("There were " + Policy.policyCount() + " Policy objects created.");
         System.out.println("The number of policies with a smoker is: " + smokerCount);  
         System.out.println("The number of policies with a non-smoker is: " + nonSmokerCount);      
     }
}