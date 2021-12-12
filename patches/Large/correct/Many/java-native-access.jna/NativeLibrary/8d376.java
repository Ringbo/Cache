diff --git a/src/com/sun/jna/NativeLibrary.java b/src/com/sun/jna/NativeLibrary.java
index c03f7a4..789d61e 100644
--- a/src/com/sun/jna/NativeLibrary.java
+++ b/src/com/sun/jna/NativeLibrary.java
@@ -299,9 +299,9 @@
      *      included somewhere in the classpath, either bundled in a jar file
      *      or as a plain file within the classpath.
      */
-    public static final NativeLibrary getInstance(String libraryName, ClassLoader loader) {
+    public static final NativeLibrary getInstance(String libraryName, ClassLoader classLoader) {
         Map map = new HashMap();
-        map.put(Library.OPTION_CLASSLOADER, loader);
+        map.put(Library.OPTION_CLASSLOADER, classLoader);
         return getInstance(libraryName, map);
     }
 
@@ -328,7 +328,7 @@
 
         // Use current process to load libraries we know are already
         // loaded by the VM to ensure we get the correct version
-        if ((Platform.isLinux() || Platform.isAix())
+        if ((Platform.isLinux() || Platform.isAIX())
             && Platform.C_LIBRARY_NAME.equals(libraryName)) {
             libraryName = null;
         }
