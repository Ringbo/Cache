diff --git a/hazelcast/src/main/java/com/hazelcast/spi/impl/BasicInvocation.java b/hazelcast/src/main/java/com/hazelcast/spi/impl/BasicInvocation.java
index 774097d..caebfe7 100644
--- a/hazelcast/src/main/java/com/hazelcast/spi/impl/BasicInvocation.java
+++ b/hazelcast/src/main/java/com/hazelcast/spi/impl/BasicInvocation.java
@@ -763,7 +763,7 @@
         }
 
         private Object newOperationTimeoutException(int pollCount, long pollTimeoutMs) {
-            boolean hasResponse = potentialResponse == null;
+            boolean hasResponse = potentialResponse != null;
             int backupsExpected = expectedBackupCount;
             int backupsCompleted = availableBackups;
 
