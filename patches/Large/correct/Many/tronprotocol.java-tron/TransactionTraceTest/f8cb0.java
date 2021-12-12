diff --git a/src/test/java/org/tron/core/db/TransactionTraceTest.java b/src/test/java/org/tron/core/db/TransactionTraceTest.java
index f50f3cd..8e91544 100644
--- a/src/test/java/org/tron/core/db/TransactionTraceTest.java
+++ b/src/test/java/org/tron/core/db/TransactionTraceTest.java
@@ -188,7 +188,7 @@
     try {
       trace.exec(runtime);
       trace.pay();
-      Assert.assertEquals(32400, trace.getReceipt().getEnergyUsage());
+      Assert.assertEquals(50000, trace.getReceipt().getEnergyUsage());
       Assert.assertEquals(6033531930L, trace.getReceipt().getEnergyFee());
       Assert.assertEquals(6034503930L,
           trace.getReceipt().getEnergyUsage() * 30 + trace.getReceipt().getEnergyFee());
