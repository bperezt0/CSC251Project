public class Policy
{
   
   private PolicyHolder policyHolder;
   
   
   public Policy (PolicyHolder holder) {
      policyHolder = new PolicyHolder(holder);
   } 
   
   public void setPolicyHolder(PolicyHolder holder)
   {
      policyHolder = new PolicyHolder(holder);
   }
   
   public PolicyHolder getPolicyHolder()
   {
      return new PolicyHolder(policyHolder); 
   }
   
   public String toString() {
      return String.format(policyHolder.toString());
   }
   
}//End Class