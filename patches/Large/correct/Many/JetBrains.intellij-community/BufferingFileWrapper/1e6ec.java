diff --git a/plugins/android/src/org/jetbrains/android/util/BufferingFileWrapper.java b/plugins/android/src/org/jetbrains/android/util/BufferingFileWrapper.java
index 76ec548..dd0b9bd 100644
--- a/plugins/android/src/org/jetbrains/android/util/BufferingFileWrapper.java
+++ b/plugins/android/src/org/jetbrains/android/util/BufferingFileWrapper.java
@@ -31,11 +31,11 @@
   }
 
   private byte[] readFile() throws IOException {
-    final InputStream is = new BufferedInputStream(new FileInputStream(myFile));
+    DataInputStream is = new DataInputStream(new FileInputStream(myFile));
     try {
-      final byte[] data = new byte[is.available()];
+      byte[] data = new byte[(int)myFile.length()];
       //noinspection ResultOfMethodCallIgnored
-      is.read(data);
+      is.readFully(data);
       return data;
     }
     finally {
