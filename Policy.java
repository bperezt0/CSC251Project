public class Policy
{
   private static int policyCount = 0;
   private PolicyHolder policyHolder;


   public Policy (PolicyHolder holder) {
      policyHolder = new PolicyHolder(holder);
   } 
   public Policy(){
      policyCount ++;
   }
   
   public void setPolicyHolder(PolicyHolder holder)
   {
      policyHolder = new PolicyHolder(holder);
   }
   
   public PolicyHolder getPolicyHolder()
   {
      return new PolicyHolder(policyHolder); 
   }
   
   public static int getPolicyCount() {
      return policyCount;
   }
   
   public String toString() {
      return policyHolder.toString();
   }
   
}//End Class