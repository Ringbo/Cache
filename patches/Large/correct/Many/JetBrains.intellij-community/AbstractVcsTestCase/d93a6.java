diff --git a/openapi/src/com/intellij/testFramework/AbstractVcsTestCase.java b/openapi/src/com/intellij/testFramework/AbstractVcsTestCase.java
index 66c6e98..7dd289d 100644
--- a/openapi/src/com/intellij/testFramework/AbstractVcsTestCase.java
+++ b/openapi/src/com/intellij/testFramework/AbstractVcsTestCase.java
@@ -196,7 +196,7 @@
     if (sorted) {
       Arrays.sort(lines);
     }
-    Assert.assertEquals(stdoutLines.length, lines.length); 
+    Assert.assertEquals(runResult.stdOut, stdoutLines.length, lines.length); 
     for(int i=0; i<stdoutLines.length; i++) {
       Assert.assertEquals(stdoutLines [i], compressWhitespace(lines [i]));
     }
