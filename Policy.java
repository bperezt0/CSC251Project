public class Policy
{  
   private int policyNumber;
   private String providerName;
   private PolicyHolder policyHolder;
   private static int policyCount = 0;


   public Policy (int pNum, String pName, PolicyHolder holder) {
      policyNumber = pNum;
      providerName = pName;
      policyHolder = new PolicyHolder(holder);
       
      policyCount++;
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

   public void setPolicyHolder(PolicyHolder holder)
   {
      policyHolder = new PolicyHolder(holder);
   }
   
    //Getters
    
    /**
      The getPolicyNumber method returns the Policy number of the Policy Holder
      @return The policy number.
   */
   public int getPolicyNumber() {
      return policyNumber;
   }
       /**
      The getProviderName method returns the Provider name of the Policy Holder
      @return The provider name.
   */
   public String getProviderName() {
      return providerName;
   }  
   public PolicyHolder getPolicyHolder()
   {
      return new PolicyHolder(policyHolder); 
   }
   
   public static int policyCount() {
      return policyCount;
   }
   
   public String toString() {
      return String.format("Policy Number: " + policyNumber +
             "\nProvider Name: " + providerName + 
             policyHolder.toString());
   }
   
}//End Class