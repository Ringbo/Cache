diff --git a/hazelcast/src/main/java/com/hazelcast/spi/impl/BasicInvocationFuture.java b/hazelcast/src/main/java/com/hazelcast/spi/impl/BasicInvocationFuture.java
index b147a58..ce576be 100644
--- a/hazelcast/src/main/java/com/hazelcast/spi/impl/BasicInvocationFuture.java
+++ b/hazelcast/src/main/java/com/hazelcast/spi/impl/BasicInvocationFuture.java
@@ -219,7 +219,7 @@
             if (!interrupted && longPolling) {
                 // no response!
                 Address target = basicInvocation.getTarget();
-                if (basicInvocation.nodeEngine.getThisAddress().equals(target)) {
+                if (basicInvocation.remote && basicInvocation.nodeEngine.getThisAddress().equals(target)) {
                     // target may change during invocation because of migration!
                     continue;
                 }
@@ -264,7 +264,7 @@
     }
 
     private Object newOperationTimeoutException(int pollCount, long pollTimeoutMs) {
-        boolean hasResponse = basicInvocation.potentialResponse == null;
+        boolean hasResponse = basicInvocation.potentialResponse != null;
         int backupsExpected = basicInvocation.backupsExpected;
         int backupsCompleted = basicInvocation.backupsCompleted;
 
