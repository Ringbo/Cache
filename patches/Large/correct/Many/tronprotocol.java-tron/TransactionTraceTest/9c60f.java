diff --git a/src/test/java/org/tron/core/db/TransactionTraceTest.java b/src/test/java/org/tron/core/db/TransactionTraceTest.java
index 8e91544..12054fb 100644
--- a/src/test/java/org/tron/core/db/TransactionTraceTest.java
+++ b/src/test/java/org/tron/core/db/TransactionTraceTest.java
@@ -152,7 +152,7 @@
       trace.exec(runtime);
       trace.pay();
       Assert.assertEquals(0, trace.getReceipt().getEnergyUsage());
-      Assert.assertEquals(49503930, trace.getReceipt().getEnergyFee());
+      Assert.assertEquals(6034503930L, trace.getReceipt().getEnergyFee());
       // Assert.assertEquals(deployStorageDelta, trace.getReceipt().getStorageDelta());
       // Assert.assertEquals(494800000, trace.getReceipt().getStorageFee());
       accountCapsule = dbManager.getAccountStore().get(accountCapsule.getAddress().toByteArray());
@@ -189,7 +189,7 @@
       trace.exec(runtime);
       trace.pay();
       Assert.assertEquals(50000, trace.getReceipt().getEnergyUsage());
-      Assert.assertEquals(6033531930L, trace.getReceipt().getEnergyFee());
+      Assert.assertEquals(6033003930L, trace.getReceipt().getEnergyFee());
       Assert.assertEquals(6034503930L,
           trace.getReceipt().getEnergyUsage() * 30 + trace.getReceipt().getEnergyFee());
       // Assert.assertEquals(deployStorageDelta, trace.getReceipt().getStorageDelta());
