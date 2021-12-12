diff --git a/java/testFramework/src/com/intellij/testFramework/CompilerTester.java b/java/testFramework/src/com/intellij/testFramework/CompilerTester.java
index 4815d3d..ba1519a 100644
--- a/java/testFramework/src/com/intellij/testFramework/CompilerTester.java
+++ b/java/testFramework/src/com/intellij/testFramework/CompilerTester.java
@@ -117,7 +117,7 @@
     path.getChildren();
     assert path != null;
     path.refresh(false, true);
-    return path.findChild(className.replace('.', '/') + ".class");
+    return path.findFileByRelativePath(className.replace('.', '/') + ".class");
   }
 
   public void touch(VirtualFile file) throws IOException {
