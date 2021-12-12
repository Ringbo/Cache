diff --git a/core/src/processing/core/PApplet.java b/core/src/processing/core/PApplet.java
index aecf394..bdc8002 100644
--- a/core/src/processing/core/PApplet.java
+++ b/core/src/processing/core/PApplet.java
@@ -721,7 +721,7 @@
 
   public void registerSize(Object o) {
     Class methodArgs[] = new Class[] { Integer.TYPE, Integer.TYPE };
-    registerWithArgs(preMethods, "size", o, methodArgs);
+    registerWithArgs(sizeMethods, "size", o, methodArgs);
   }
 
   public void registerPre(Object o) {
