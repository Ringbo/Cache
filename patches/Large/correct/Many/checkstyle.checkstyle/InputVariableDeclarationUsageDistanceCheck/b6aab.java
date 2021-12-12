diff --git a/src/it/resources/com/google/checkstyle/test/chapter4formatting/rule4822variabledistance/InputVariableDeclarationUsageDistanceCheck.java b/src/it/resources/com/google/checkstyle/test/chapter4formatting/rule4822variabledistance/InputVariableDeclarationUsageDistanceCheck.java
index e336075..873e6fe 100644
--- a/src/it/resources/com/google/checkstyle/test/chapter4formatting/rule4822variabledistance/InputVariableDeclarationUsageDistanceCheck.java
+++ b/src/it/resources/com/google/checkstyle/test/chapter4formatting/rule4822variabledistance/InputVariableDeclarationUsageDistanceCheck.java
@@ -461,7 +461,7 @@
     
     public void testIssue32_7() {
         String line = "abc";
-        writer.write(line);
+        otherWriter.write(line);
         line.charAt(1);
         builder.append(line);
         test(line, line, line);
@@ -777,7 +777,7 @@
     	
     }
     
-    static class writer {
+    static class otherWriter {
 
 		public static void write(String line)
 		{
