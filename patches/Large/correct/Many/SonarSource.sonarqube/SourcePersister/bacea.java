diff --git a/sonar-batch/src/main/java/org/sonar/batch/index/SourcePersister.java b/sonar-batch/src/main/java/org/sonar/batch/index/SourcePersister.java
index cf1fae2..bbbd47c 100644
--- a/sonar-batch/src/main/java/org/sonar/batch/index/SourcePersister.java
+++ b/sonar-batch/src/main/java/org/sonar/batch/index/SourcePersister.java
@@ -132,7 +132,7 @@
 
       @Override
       public void consume(int lineIdx, @Nullable byte[] hash) {
-        if (lineIdx > 0) {
+        if (lineIdx > 1) {
           result.append("\n");
         }
         result.append(hash != null ? Hex.encodeHexString(hash) : "");
