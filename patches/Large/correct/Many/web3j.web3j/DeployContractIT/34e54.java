diff --git a/src/integration-test/java/org/web3j/protocol/scenarios/DeployContractIT.java b/src/integration-test/java/org/web3j/protocol/scenarios/DeployContractIT.java
index 735c517..f049d6f 100644
--- a/src/integration-test/java/org/web3j/protocol/scenarios/DeployContractIT.java
+++ b/src/integration-test/java/org/web3j/protocol/scenarios/DeployContractIT.java
@@ -57,7 +57,7 @@
         List<Uint> uint = FunctionReturnDecoder.decode(
                 responseValue, function.getOutputParameters());
         assertThat(uint.size(), is(1));
-        assertThat(uint.get(0).getValue(), equalTo(BigInteger.valueOf(55)));
+        assertThat(uint.get(0).getValue(), equalTo(BigInteger.valueOf(13)));
     }
 
     private String sendTransaction(BigInteger gas) throws Exception {
