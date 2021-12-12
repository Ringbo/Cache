diff --git a/sonar-batch/src/test/java/org/sonar/batch/source/CodeColorizersTest.java b/sonar-batch/src/test/java/org/sonar/batch/source/CodeColorizersTest.java
index 6056247..3932cdb 100644
--- a/sonar-batch/src/test/java/org/sonar/batch/source/CodeColorizersTest.java
+++ b/sonar-batch/src/test/java/org/sonar/batch/source/CodeColorizersTest.java
@@ -62,9 +62,9 @@
     CodeColorizers codeColorizers = new CodeColorizers(Arrays.<CodeColorizerFormat>asList(new JavaScriptColorizerFormat()));
 
     File fileWithBom = temp.newFile();
-    FileUtils.write(fileWithBom, "\uFEFF");
+    FileUtils.write(fileWithBom, "\uFEFF", "UTF-8");
     File jsFile = new File(this.getClass().getResource("CodeColorizersTest/Person.js").toURI());
-    FileUtils.write(fileWithBom, FileUtils.readFileToString(jsFile), true);
+    FileUtils.write(fileWithBom, FileUtils.readFileToString(jsFile), "UTF-8", true);
 
     SyntaxHighlightingData syntaxHighlighting = codeColorizers.toSyntaxHighlighting(fileWithBom, "UTF-8", "js");
 
