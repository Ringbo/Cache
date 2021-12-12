diff --git a/test/meta/TestTSMeta.java b/test/meta/TestTSMeta.java
index 034115f..1dc7db3 100644
--- a/test/meta/TestTSMeta.java
+++ b/test/meta/TestTSMeta.java
@@ -332,7 +332,7 @@
   public void incrementAndGetCounter() throws Exception {
     final byte[] tsuid = { 0, 0, 1, 0, 0, 1, 0, 0, 1 };
     TSMeta.incrementAndGetCounter(tsdb, tsuid).joinUninterruptibly();
-    verify(client).bufferAtomicIncrement((AtomicIncrementRequest)any());
+    verify(client).atomicIncrement((AtomicIncrementRequest)any());
   }
   
   @Test (expected = NoSuchUniqueId.class)
