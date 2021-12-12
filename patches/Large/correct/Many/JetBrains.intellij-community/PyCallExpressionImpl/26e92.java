diff --git a/python/src/com/jetbrains/python/psi/impl/PyCallExpressionImpl.java b/python/src/com/jetbrains/python/psi/impl/PyCallExpressionImpl.java
index ab66282..452702f 100644
--- a/python/src/com/jetbrains/python/psi/impl/PyCallExpressionImpl.java
+++ b/python/src/com/jetbrains/python/psi/impl/PyCallExpressionImpl.java
@@ -76,7 +76,7 @@
     if (calleeReference != null) {
       PsiReference cref = calleeReference.getReference();
       if (cref != null) {
-        PyElement resolved = (PyElement) cref.resolve();
+        PsiElement resolved = cref.resolve();
         if (resolved != null) {
           EnumSet<Flag> flags = EnumSet.noneOf(Flag.class);
           //boolean is_inst = isByInstance();
