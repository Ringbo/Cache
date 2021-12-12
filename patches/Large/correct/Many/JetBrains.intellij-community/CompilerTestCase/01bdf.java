diff --git a/java/compiler/tests/com/intellij/compiler/CompilerTestCase.java b/java/compiler/tests/com/intellij/compiler/CompilerTestCase.java
index b988849..95fb48f 100644
--- a/java/compiler/tests/com/intellij/compiler/CompilerTestCase.java
+++ b/java/compiler/tests/com/intellij/compiler/CompilerTestCase.java
@@ -480,7 +480,7 @@
             myDataDir = null;
             mySourceDir = null;
             myOriginalSourceDir = null;
-            CompilerTestUtil.disableExternalCompiler();
+            CompilerTestUtil.disableExternalCompiler(myProject);
             CompilerTestCase.super.tearDown();
           }
           catch (Exception e) {
