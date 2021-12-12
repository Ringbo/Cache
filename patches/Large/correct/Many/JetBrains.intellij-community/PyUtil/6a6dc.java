diff --git a/python/src/com/jetbrains/python/psi/PyUtil.java b/python/src/com/jetbrains/python/psi/PyUtil.java
index a672cb3..39a18fb 100644
--- a/python/src/com/jetbrains/python/psi/PyUtil.java
+++ b/python/src/com/jetbrains/python/psi/PyUtil.java
@@ -193,7 +193,7 @@
   // TODO: move to a saner place
 
   public static boolean instanceOf(Object obj, Class... possibleClasses) {
-    if (obj == null || possibleClasses == null) return true;
+    if (obj == null || possibleClasses == null) return false;
     for (Class cls : possibleClasses) {
       if (cls.isInstance(obj)) return true;
     }
