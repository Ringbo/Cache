diff --git a/src/com/sun/jna/NativeLibrary.java b/src/com/sun/jna/NativeLibrary.java
index 602f9be..6f9e53f 100644
--- a/src/com/sun/jna/NativeLibrary.java
+++ b/src/com/sun/jna/NativeLibrary.java
@@ -257,7 +257,7 @@
             if (handle == 0) {
                 try {
                     File embedded = Native.extractFromResourcePath(libraryName, (ClassLoader)options.get(Library.OPTION_CLASSLOADER));
-                    handle = Native.open(embedded.getAbsolutePath());
+                    handle = Native.open(embedded.getAbsolutePath(), openFlags);
                     libraryPath = embedded.getAbsolutePath();
                     // Don't leave temporary files around
                     if (Native.isUnpacked(embedded)) {
