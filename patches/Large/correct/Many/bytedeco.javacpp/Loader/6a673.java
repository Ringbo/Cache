diff --git a/src/main/java/org/bytedeco/javacpp/Loader.java b/src/main/java/org/bytedeco/javacpp/Loader.java
index 094270b..a538371 100644
--- a/src/main/java/org/bytedeco/javacpp/Loader.java
+++ b/src/main/java/org/bytedeco/javacpp/Loader.java
@@ -538,7 +538,7 @@
         String version2 = s2.length > 1 ? s2[s2.length-1] : "";
 
         // If we do not already have the native library file ...
-        String filename = loadedLibraries.get(libnameversion);
+        String filename = loadedLibraries.get(libnameversion2);
         if (filename != null) {
             try {
                 return new URL[] { new File(filename).toURI().toURL() };
