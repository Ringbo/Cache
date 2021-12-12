diff --git a/src/main/javassist/expr/MethodCall.java b/src/main/javassist/expr/MethodCall.java
index 06ea641..281697c 100644
--- a/src/main/javassist/expr/MethodCall.java
+++ b/src/main/javassist/expr/MethodCall.java
@@ -131,7 +131,7 @@
      * Returns true if the called method is of a superclass of the current
      * class.
      */
-    boolean isSuper() {
+    public boolean isSuper() {
         return iterator.byteAt(currentPos) == INVOKESPECIAL
             && !where().getDeclaringClass().getName().equals(getClassName());
     }
