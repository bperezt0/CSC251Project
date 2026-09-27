public class PolicyHolder
{
   private int policyNumber;
   private String providerName;
   private String holderFirstName;
   private String holderLastName;
   private int policyHolderAge;
   private String holderSmokerStatus;
   private double holderHeight;
   private double holderWeight;

   
      /**
      Constructor that accepts argument for each field
      @param pNumber The policy number of the user
      @param pName The name of the Insurance Provider 
      @param firstName The first name of the Policy Holder
      @param lastName The last name of the Policy Holder
      @param age The age of the Policy Holder
      @param smokerStatus The smoking status of the Policy Holder
      @param height The height of the Policy Holder
      @param weight The weight of the Policy Holder 
   */
   
   public PolicyHolder(int pNumber, String pName, String firstName, String lastName, 
                 int age, String smokerStatus, double height, double weight)
   {
      policyNumber = pNumber;
      providerName = pName;
      holderFirstName = firstName;
      holderLastName = lastName;
      policyHolderAge = age;
      holderSmokerStatus = smokerStatus;
      holderHeight = height;
      holderWeight = weight;
   }
   
   public PolicyHolder(PolicyHolder object2)
   {
      policyNumber = object2.policyNumber;
      providerName = object2.providerName;
      holderFirstName = object2.holderFirstName;
      holderLastName = object2.holderLastName;
      policyHolderAge = object2.policyHolderAge;
      holderSmokerStatus = object2.holderSmokerStatus;
      holderHeight = object2.holderHeight;
      holderWeight = object2.holderWeight;
   }
   
   //Setters
    
    /**
      The setPolicyNumber method sets the policy number of the policy holder
      @param pNumber The policy number
   */

   public void setPolicyNumber(int pNumber){
      policyNumber = pNumber;
   }
   
       /**
      The setProviderName method sets the name of the Insurance Provider
      @param pName The provider name
   */
   
   public void setProviderName(String pName){
      providerName = pName;
   }
   
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
      The getPolicyNumber method returns the Policy number of the Policy Holder
      @return The policy number.
   */
   public int getPolicyNumber(){
      return policyNumber;
   }
   
       /**
      The getProviderName method returns the Provider name of the Policy Holder
      @return The provider name.
   */
   public String getProviderName(){
      return providerName;
   }
   
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
  
   
   
   
   
   
   
}