diff --git a/src/com/goide/runconfig/testing/GoTestFinder.java b/src/com/goide/runconfig/testing/GoTestFinder.java
index b208f6b..62d2650 100644
--- a/src/com/goide/runconfig/testing/GoTestFinder.java
+++ b/src/com/goide/runconfig/testing/GoTestFinder.java
@@ -43,7 +43,7 @@
   }
 
   public static boolean isTestFile(@NotNull VirtualFile file) {
-    return file.getNameWithoutExtension().endsWith(GoConstants.TEST_SUFFIX_WITH_EXTENSION);
+    return file.getName().endsWith(GoConstants.TEST_SUFFIX_WITH_EXTENSION);
   }
 
   public static boolean isTestOrExampleFunction(@NotNull GoFunctionOrMethodDeclaration function) {
