diff --git a/hazelcast/src/main/java/com/hazelcast/concurrent/countdownlatch/CountDownLatchService.java b/hazelcast/src/main/java/com/hazelcast/concurrent/countdownlatch/CountDownLatchService.java
index 6e1b489..926b20d 100644
--- a/hazelcast/src/main/java/com/hazelcast/concurrent/countdownlatch/CountDownLatchService.java
+++ b/hazelcast/src/main/java/com/hazelcast/concurrent/countdownlatch/CountDownLatchService.java
@@ -52,7 +52,7 @@
     }
 
     public boolean setCount(String name, int count) {
-        if (count <= 0) {
+        if (count < 0) {
             latches.remove(name);
             return false;
         } else {
@@ -66,7 +66,7 @@
     }
 
     public void setCountDirect(String name, int count) {
-        if (count <= 0) {
+        if (count < 0) {
             latches.remove(name);
         } else {
             CountDownLatchInfo latch = latches.get(name);
