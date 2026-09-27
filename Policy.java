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


}//End Class