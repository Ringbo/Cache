diff --git a/hazelcast/src/main/java/com/hazelcast/spi/impl/BasicInvocationFuture.java b/hazelcast/src/main/java/com/hazelcast/spi/impl/BasicInvocationFuture.java
index 7bc5007..bf52375 100644
--- a/hazelcast/src/main/java/com/hazelcast/spi/impl/BasicInvocationFuture.java
+++ b/hazelcast/src/main/java/com/hazelcast/spi/impl/BasicInvocationFuture.java
@@ -219,7 +219,7 @@
             if (!interrupted && longPolling) {
                 // no response!
                 Address target = invocation.getTarget();
-                if (invocation.nodeEngine.getThisAddress().equals(target)) {
+                if (invocation.remote && invocation.nodeEngine.getThisAddress().equals(target)) {
                     // target may change during invocation because of migration!
                     continue;
                 }
@@ -264,7 +264,7 @@
     }
 
     private Object newOperationTimeoutException(int pollCount, long pollTimeoutMs) {
-        boolean hasResponse = invocation.pendingResponse == null;
+        boolean hasResponse = invocation.pendingResponse != null;
         int backupsExpected = invocation.backupsExpected;
         int backupsCompleted = invocation.backupsCompleted;
 
