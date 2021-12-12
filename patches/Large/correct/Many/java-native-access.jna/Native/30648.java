diff --git a/jnalib/src/com/sun/jna/Native.java b/jnalib/src/com/sun/jna/Native.java
index 9bf6a73..bf91e8b 100644
--- a/jnalib/src/com/sun/jna/Native.java
+++ b/jnalib/src/com/sun/jna/Native.java
@@ -601,7 +601,7 @@
             return null;
         try {
             ClassLoader cl = Native.class.getClassLoader();
-            Method m = ClassLoader.class.getMethod("findLibrary", new Class[] { String.class });
+            Method m = ClassLoader.class.getDeclaredMethod("findLibrary", new Class[] { String.class });
             m.setAccessible(true);
             String libpath = (String)m.invoke(cl, new Object[] { libName });
             if (libpath != null) {
