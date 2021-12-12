diff --git a/src/org/nutz/lang/Lang.java b/src/org/nutz/lang/Lang.java
index c4a8ed6..1626e2a 100644
--- a/src/org/nutz/lang/Lang.java
+++ b/src/org/nutz/lang/Lang.java
@@ -2615,7 +2615,7 @@
         return sb;
     }
     
-    public static Class<?> loadClassQuite(String className) throws ClassNotFoundException {
+    public static Class<?> loadClassQuite(String className) {
         try {
             return loadClass(className);
         }
