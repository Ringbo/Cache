diff --git a/compiler/tests/org/jetbrains/jet/test/generator/SimpleTestMethodModel.java b/compiler/tests/org/jetbrains/jet/test/generator/SimpleTestMethodModel.java
index 694b756..c11b64b 100644
--- a/compiler/tests/org/jetbrains/jet/test/generator/SimpleTestMethodModel.java
+++ b/compiler/tests/org/jetbrains/jet/test/generator/SimpleTestMethodModel.java
@@ -54,7 +54,7 @@
         Matcher matcher = filenamePattern.matcher(file.getName());
         boolean found = matcher.find();
         assert found : file.getName() + " isn't matched by regex " + filenamePattern.pattern();
-        assert matcher.groupCount() == 2 : filenamePattern.pattern();
+        assert matcher.groupCount() == 1 : filenamePattern.pattern();
         String extractedName = matcher.group(1);
 
         String unescapedName;
