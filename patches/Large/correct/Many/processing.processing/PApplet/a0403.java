diff --git a/core/src/processing/core/PApplet.java b/core/src/processing/core/PApplet.java
index 2638bc6..91d12d2 100644
--- a/core/src/processing/core/PApplet.java
+++ b/core/src/processing/core/PApplet.java
@@ -7384,12 +7384,11 @@
   static public OutputStream createOutput(File file) {
     try {
       createPath(file);  // make sure the path exists
-      OutputStream output =
-        new BufferedOutputStream(new FileOutputStream(file));
+      OutputStream output = new FileOutputStream(file);
       if (file.getName().toLowerCase().endsWith(".gz")) {
-        return new GZIPOutputStream(output);
+        return new BufferedOutputStream(new GZIPOutputStream(output));
       }
-      return output;
+      return new BufferedOutputStream(output);
 
     } catch (IOException e) {
       e.printStackTrace();
