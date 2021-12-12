diff --git a/src/test/java/org/tron/common/runtime/vm/CPUEnergyTest.java b/src/test/java/org/tron/common/runtime/vm/CPUEnergyTest.java
index 92c1db0..052b936 100644
--- a/src/test/java/org/tron/common/runtime/vm/CPUEnergyTest.java
+++ b/src/test/java/org/tron/common/runtime/vm/CPUEnergyTest.java
@@ -90,7 +90,7 @@
     long consumeUserResourcePercent = 100;
     TVMTestResult result = deployCallValueTestContract(value, feeLimit,
         consumeUserResourcePercent);
-    Assert.assertEquals(result.getReceipt().getEnergyUsageTotal(), 52439);
+    Assert.assertEquals(result.getReceipt().getEnergyTotal(), 52439);
     byte[] contractAddress = result.getContractAddress();
 
     /* =================================== CALL simpleCall() =================================== */
@@ -99,7 +99,7 @@
         .triggerContractAndReturnTVMTestResult(Hex.decode(OWNER_ADDRESS),
             contractAddress, triggerData, 0, feeLimit, deposit, null);
 
-    Assert.assertEquals(result.getReceipt().getEnergyUsageTotal(), 7370);
+    Assert.assertEquals(result.getReceipt().getEnergyTotal(), 7370);
 
     /* =================================== CALL complexCall() =================================== */
     triggerData = TVMTestUtils.parseABI("complexCall()", null);
@@ -107,7 +107,7 @@
         .triggerContractAndReturnTVMTestResult(Hex.decode(OWNER_ADDRESS),
             contractAddress, triggerData, 0, feeLimit, deposit, null);
 
-    Assert.assertEquals(result.getReceipt().getEnergyUsageTotal(), 9459);
+    Assert.assertEquals(result.getReceipt().getEnergyTotal(), 9459);
     // boolean haveException = false;
     // try {
     //   result = TVMTestUtils
