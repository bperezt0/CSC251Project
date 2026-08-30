public class Policy
{
   private int policyNumber;
   private String providerName;
   private String holderFirstName;
   private String holderLastName;
   private int policyHolderAge;
   private String holderSmokerStatus;
   private double holderHeight;
   private double holderWeight;
   
   public Policy()
   {
   
   }
   
   public Policy(int pNumber, String pName, String firstName, String lastName, 
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
   
   public void setPolicyNumber(int pNumber){
      policyNumber = pNumber;
   }
   
   public void setProviderName(String pName){
      providerName = pName;
   }
   
   public void setHolderFirstName(String firstName){
      holderFirstName = firstName;
   }
   
   public void setHolderLastName(String lastName){
      holderLastName = lastName;
   }
   
   public void setPolicyHolderAge(int age){
      policyHolderAge = age;
   }
   
   public void setHolderSmokerStatus(String smokerStatus){
      holderSmokerStatus = smokerStatus;
   }
   
   public void setHolderHeight(double height){
      holderHeight = height;
   }
   
   public void setHolderWeight(double weight){
      holderWeight = weight;
   }
   
   public int getPolicyNumber(){
      return policyNumber;
   }
   
   public String getProviderName(){
      return providerName;
   }
   
   public String getHolderFirstName(){
      return holderFirstName;
   }
   
   public String getHolderLastName(){
      return holderLastName;
   }
   
   public int getPolicyHolderAge(){
      return policyHolderAge;
   }
   
   public String getHolderSmokerStatus(){
   
      if (holderSmokerStatus.equalsIgnoreCase("smoker")) {
         return "Smoker";
      }
      else {
         return "Non-Smoker";
      }
   }
   
   public double getHolderHeight(){
      return holderHeight;
   }
   
   public double getHolderWeight(){
      return holderWeight;
   }
   
   public double calculateBMI() {
      double bmi;
      bmi = (holderWeight * 703) / (holderHeight * holderHeight);
      return bmi;
   }

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