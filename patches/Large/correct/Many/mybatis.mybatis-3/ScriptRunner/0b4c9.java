diff --git a/src/main/java/org/apache/ibatis/jdbc/ScriptRunner.java b/src/main/java/org/apache/ibatis/jdbc/ScriptRunner.java
index 6a77e34..0598760 100644
--- a/src/main/java/org/apache/ibatis/jdbc/ScriptRunner.java
+++ b/src/main/java/org/apache/ibatis/jdbc/ScriptRunner.java
@@ -203,7 +203,8 @@
   }
 
   private boolean commandReadyToExecute(String trimmedLine) {
-    return !fullLineDelimiter && trimmedLine.endsWith(delimiter) || fullLineDelimiter && trimmedLine.equals(delimiter);
+    // issue #561 remove anything after the delimiter
+    return !fullLineDelimiter && trimmedLine.contains(delimiter) || fullLineDelimiter && trimmedLine.equals(delimiter);
   }
 
   private void executeStatement(String command) throws SQLException, UnsupportedEncodingException {
