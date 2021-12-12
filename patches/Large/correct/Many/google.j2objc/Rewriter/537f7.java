diff --git a/src/main/java/com/google/devtools/j2objc/translate/Rewriter.java b/src/main/java/com/google/devtools/j2objc/translate/Rewriter.java
index 29fde96..5764e26 100644
--- a/src/main/java/com/google/devtools/j2objc/translate/Rewriter.java
+++ b/src/main/java/com/google/devtools/j2objc/translate/Rewriter.java
@@ -265,7 +265,7 @@
    * checking.
    */
   private void handleCompareToMethod(MethodDeclaration node, IMethodBinding binding) {
-    if (!binding.getName().equals("compareTo")) {
+    if (!binding.getName().equals("compareTo") || node.getBody() == null) {
       return;
     }
     ITypeBinding comparableType =
