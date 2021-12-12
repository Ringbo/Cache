diff --git a/refactoring/tests/com/intellij/refactoring/FindMethodDuplicatesTest.java b/refactoring/tests/com/intellij/refactoring/FindMethodDuplicatesTest.java
index d860f63..a9932aa 100644
--- a/refactoring/tests/com/intellij/refactoring/FindMethodDuplicatesTest.java
+++ b/refactoring/tests/com/intellij/refactoring/FindMethodDuplicatesTest.java
@@ -31,7 +31,7 @@
   }
 
   protected Sdk getProjectJDK() {
-    return JavaSdkImpl.getMockJdk("java 1.5");
+    return JavaSdkImpl.getMockJdk15("java 1.5");
   }
 
   private void doTest() throws Exception {
