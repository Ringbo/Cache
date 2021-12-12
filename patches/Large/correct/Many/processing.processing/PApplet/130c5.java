diff --git a/core/src/processing/core/PApplet.java b/core/src/processing/core/PApplet.java
index 7606f28..49ab538 100644
--- a/core/src/processing/core/PApplet.java
+++ b/core/src/processing/core/PApplet.java
@@ -6920,18 +6920,19 @@
    *
    */
   public InputStream createInput(String filename) {
-    InputStream input = new BufferedInputStream(createInputRaw(filename));
+    InputStream input = createInputRaw(filename);
     final String lower = filename.toLowerCase();
     if ((input != null) &&
         (lower.endsWith(".gz") || lower.endsWith(".svgz"))) {
       try {
-        return new GZIPInputStream(input);
+        // buffered has to go *around* the GZ, otherwise 25x slower
+        return new BufferedInputStream(new GZIPInputStream(input));
       } catch (IOException e) {
         printStackTrace(e);
         return null;
       }
     }
-    return input;
+    return new BufferedInputStream(input);
   }
 
 
@@ -7103,11 +7104,11 @@
       throw new IllegalArgumentException("File passed to createInput() was null");
     }
     try {
-      InputStream input = new BufferedInputStream(new FileInputStream(file));
+      InputStream input = new FileInputStream(file);
       if (file.getName().toLowerCase().endsWith(".gz")) {
-        return new GZIPInputStream(input);
+        return new BufferedInputStream(new GZIPInputStream(input));
       }
-      return input;
+      return new BufferedInputStream(input);
 
     } catch (IOException e) {
       System.err.println("Could not createInput() for " + file);
