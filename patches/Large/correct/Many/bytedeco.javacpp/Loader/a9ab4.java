diff --git a/src/main/java/org/bytedeco/javacpp/Loader.java b/src/main/java/org/bytedeco/javacpp/Loader.java
index 1e47459..4b3f1db 100644
--- a/src/main/java/org/bytedeco/javacpp/Loader.java
+++ b/src/main/java/org/bytedeco/javacpp/Loader.java
@@ -1119,7 +1119,7 @@
      *         (but {@code if (!isLoadLibraries) { return null; }})
      * @throws UnsatisfiedLinkError on failure
      */
-    public static String loadLibrary(URL[] urls, String libnameversion, String ... preloaded) {
+    public synchronized static String loadLibrary(URL[] urls, String libnameversion, String ... preloaded) {
         if (!isLoadLibraries()) {
             return null;
         }
