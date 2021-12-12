diff --git a/python/src/com/jetbrains/python/psi/impl/PyBuiltinCache.java b/python/src/com/jetbrains/python/psi/impl/PyBuiltinCache.java
index 3433def..c227b3f 100644
--- a/python/src/com/jetbrains/python/psi/impl/PyBuiltinCache.java
+++ b/python/src/com/jetbrains/python/psi/impl/PyBuiltinCache.java
@@ -54,7 +54,7 @@
    */
   @NotNull
   public static PyBuiltinCache getInstance(@Nullable PsiElement reference) {
-    if (reference != null) {
+    if (reference != null && reference.isValid()) {
       Sdk sdk = findSdkForFile(reference.getContainingFile());
       if (sdk != null) {
         return PythonSdkPathCache.getInstance(reference.getProject(), sdk).getBuiltins();
