diff --git a/hazelcast/src/test/java/com/hazelcast/spi/InvocationTest.java b/hazelcast/src/test/java/com/hazelcast/spi/InvocationTest.java
index 4197872..0b7e868 100644
--- a/hazelcast/src/test/java/com/hazelcast/spi/InvocationTest.java
+++ b/hazelcast/src/test/java/com/hazelcast/spi/InvocationTest.java
@@ -95,7 +95,7 @@
      */
     private static class TargetOperation extends AbstractOperation {
         public void run() throws InterruptedException {
-            Thread.sleep(5000);
+            Thread.sleep(10000);
         }
     }
 
