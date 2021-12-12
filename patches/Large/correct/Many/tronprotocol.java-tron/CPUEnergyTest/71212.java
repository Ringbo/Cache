diff --git a/src/test/java/org/tron/common/runtime/vm/CPUEnergyTest.java b/src/test/java/org/tron/common/runtime/vm/CPUEnergyTest.java
index 65d8534..92c1db0 100644
--- a/src/test/java/org/tron/common/runtime/vm/CPUEnergyTest.java
+++ b/src/test/java/org/tron/common/runtime/vm/CPUEnergyTest.java
@@ -90,7 +90,7 @@
     long consumeUserResourcePercent = 100;
     TVMTestResult result = deployCallValueTestContract(value, feeLimit,
         consumeUserResourcePercent);
-    Assert.assertEquals(result.getReceipt().getEnergyUsageTotal(), 52457);
+    Assert.assertEquals(result.getReceipt().getEnergyUsageTotal(), 52439);
     byte[] contractAddress = result.getContractAddress();
 
     /* =================================== CALL simpleCall() =================================== */
