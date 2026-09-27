public class PolicyHolder
{
   private String holderFirstName;
   private String holderLastName;
   private int policyHolderAge;
   private String holderSmokerStatus;
   private double holderHeight;
   private double holderWeight;

   
      /**
      Constructor that accepts argument for each field
      @param firstName The first name of the Policy Holder
      @param lastName The last name of the Policy Holder
      @param age The age of the Policy Holder
      @param smokerStatus The smoking status of the Policy Holder
      @param height The height of the Policy Holder
      @param weight The weight of the Policy Holder 
   */
   
   public PolicyHolder(String firstName, String lastName, 
                 int age, String smokerStatus, double height, double weight)
   {
      holderFirstName = firstName;
      holderLastName = lastName;
      policyHolderAge = age;
      holderSmokerStatus = smokerStatus;
      holderHeight = height;
      holderWeight = weight;
   }
   
   public PolicyHolder(PolicyHolder object2)
   {
      holderFirstName = object2.holderFirstName;
      holderLastName = object2.holderLastName;
      policyHolderAge = object2.policyHolderAge;
      holderSmokerStatus = object2.holderSmokerStatus;
      holderHeight = object2.holderHeight;
      holderWeight = object2.holderWeight;
   }
   
   //Setters
      
       /**
      The setHolderFirstName method sets the first name of the Policy Holder
      @param firstName The first name
   */

   public void setHolderFirstName(String firstName){
      holderFirstName = firstName;
   }
   
       /**
      The setHolderLastName method sets the last name of the Policy Holder
      @param lastName The last name
   */

   public void setHolderLastName(String lastName){
      holderLastName = lastName;
   }
   
       /**
      The setPolicyHolderAge method sets the age of the Policy Holder
      @param age The age
   */

   public void setPolicyHolderAge(int age){
      policyHolderAge = age;
   }
   
       /**
      The setHolderSmokerStatus method sets the smoking status of the Policy Holder
      @param smokerStatus The smoking status
   */

   public void setHolderSmokerStatus(String smokerStatus){
      holderSmokerStatus = smokerStatus;
   }
   
       /**
      The setHolderHeight method sets the height of the Policy Holder
      @param height The height
   */

   public void setHolderHeight(double height){
      holderHeight = height;
   }
   
       /**
      The setHolderWeight method sets the weight of the Policy Holder
      @param weight The weight
   */

   public void setHolderWeight(double weight){
      holderWeight = weight;
   }
 
    //Getters
       
       /**
      The getHolderFirstName method returns the first name of the Policy Holder
      @return The holder's first name.
   */
   public String getHolderFirstName(){
      return holderFirstName;
   }
   
       /**
      The getHolderLastName method returns the last name of the Policy Holder
      @return The holder's last name.
   */
   public String getHolderLastName(){
      return holderLastName;
   }
       /**
      The getPolicyHolderAge method returns the age of the Policy Holder
      @return The age.
   */
   
   public int getPolicyHolderAge(){
      return policyHolderAge;
   }

       /**
      The getHolderSmokerStatus method returns the smoking status of the Policy Holder
      @return The smoking status.
   */
   
   public String getHolderSmokerStatus(){
   
      if (holderSmokerStatus.equalsIgnoreCase("smoker")) {
         return "Smoker";
      }
      else {
         return "Non-Smoker";
      }
   }

       /**
      The getHolderHeight method returns the height of the Policy Holder
      @return The height.
   */
   
   public double getHolderHeight(){
      return holderHeight;
   }
       /**
      The getHolderWeight method returns the weight of the Policy Holder
      @return The weight.
   */
  
   public double getHolderWeight(){
      return holderWeight;
   }
   //Other methods

   /**
      The calculateBMI method calculates and returns the BMI of the Policy Holder
      @return The BMI of the Policy Holder.
   */
   
   public double calculateBMI() {
      double bmi;
      bmi = (holderWeight * 703) / (holderHeight * holderHeight);
      return bmi;
   }

   /**
      The calculateInsurancePolicyPrice method calculates and returns the price of the Insurance Policy
      @param
      @return The Insurance policy price
   */

   public double calculateInsurancePolicyPrice() {
   
      int BASE_FEE = 600;
      int ageAdditionalFee;
      int smokerAdditionalFee;
      double bmiAdditionalFee;
      double insurancePolicyPrice;
      
      double bmi = calculateBMI();
   
      if (policyHolderAge > 50){
         ageAdditionalFee = 75;
      }
      else {
         ageAdditionalFee = 0;
      }
      
      if (getHolderSmokerStatus().equals("Smoker")){
         smokerAdditionalFee = 100;
      }
      else {
         smokerAdditionalFee = 0;
      }
      
      if (bmi > 35){
         bmiAdditionalFee = ((bmi - 35) * 20);
      }
      else {
         bmiAdditionalFee = 0;
      }
   
      insurancePolicyPrice = BASE_FEE + ageAdditionalFee + smokerAdditionalFee + bmiAdditionalFee;
   
      return insurancePolicyPrice;
   }
   public String toString() {
      return String.format("\nPolicyholder's First Name: " + holderFirstName +
             "\nPolicyholder's Last Name: " + holderLastName +
             "\nPolicyholder's Age: " + policyHolderAge +
             "\nPolicyholder's Smoking Status (Y/N): " + holderSmokerStatus +
             "\nPolicyholder's Height: %,.1f inches\n" +
             "Policyholder's Weight: %,.1f pounds\n" +
             "Policyholder's BMI: %,.2f\n" +
             "Policy Price: $%,.2f\n", holderHeight, holderWeight, calculateBMI(), calculateInsurancePolicyPrice());
   }
}