diff --git a/src/java/org/apache/cassandra/service/StorageService.java b/src/java/org/apache/cassandra/service/StorageService.java
index 622380e..d997459 100644
--- a/src/java/org/apache/cassandra/service/StorageService.java
+++ b/src/java/org/apache/cassandra/service/StorageService.java
@@ -1618,7 +1618,7 @@
         if (!localTokensToRemove.isEmpty())
             SystemKeyspace.updateLocalTokens(Collections.<Token>emptyList(), localTokensToRemove);
 
-        if (isMoving)
+        if (isMoving || operationMode == Mode.MOVING)
         {
             tokenMetadata.removeFromMoving(endpoint);
 
