diff --git a/src/main/javassist/CtBehavior.java b/src/main/javassist/CtBehavior.java
index ea25648..01f907c 100644
--- a/src/main/javassist/CtBehavior.java
+++ b/src/main/javassist/CtBehavior.java
@@ -109,6 +109,8 @@
 
     /**
      * Obtains exceptions that this method/constructor may throw.
+     *
+     * @return a zero-length array if there is no throws clause.
      */
     public CtClass[] getExceptionTypes() throws NotFoundException {
         String[] exceptions;
@@ -126,7 +128,7 @@
      */
     public void setExceptionTypes(CtClass[] types) throws NotFoundException {
         declaringClass.checkModify();
-        if (types == null) {
+        if (types == null || types.length == 0) {
             methodInfo.removeExceptionsAttribute();
             return;
         }
