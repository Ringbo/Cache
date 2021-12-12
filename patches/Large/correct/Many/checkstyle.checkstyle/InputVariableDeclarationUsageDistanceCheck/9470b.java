diff --git a/src/test/resources/com/puppycrawl/tools/checkstyle/coding/InputVariableDeclarationUsageDistanceCheck.java b/src/test/resources/com/puppycrawl/tools/checkstyle/coding/InputVariableDeclarationUsageDistanceCheck.java
index 8c15042..4388952 100644
--- a/src/test/resources/com/puppycrawl/tools/checkstyle/coding/InputVariableDeclarationUsageDistanceCheck.java
+++ b/src/test/resources/com/puppycrawl/tools/checkstyle/coding/InputVariableDeclarationUsageDistanceCheck.java
@@ -461,7 +461,7 @@
     
     public void testIssue32_7() {
         String line = "abc";
-        writer.write(line);
+        otherWriter.write(line);
         line.charAt(1);
         builder.append(line);
         test(line, line, line);
@@ -814,7 +814,7 @@
     	
     }
     
-    static class writer {
+    static class otherWriter {
 
 		public static void write(String line)
 		{
