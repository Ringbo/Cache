diff --git a/plugins/cvs2/javacvs-src/org/netbeans/lib/cvsclient/response/ResponseParser.java b/plugins/cvs2/javacvs-src/org/netbeans/lib/cvsclient/response/ResponseParser.java
index 046859f..9d47b80 100644
--- a/plugins/cvs2/javacvs-src/org/netbeans/lib/cvsclient/response/ResponseParser.java
+++ b/plugins/cvs2/javacvs-src/org/netbeans/lib/cvsclient/response/ResponseParser.java
@@ -237,7 +237,7 @@
     int read = 0;
     final ByteArrayOutputStream bufferStream = new ByteArrayOutputStream();
     while (read < fileLength) {
-      final int readBytes = connectionStreams.getInputStream().read(buffer);
+      final int readBytes = connectionStreams.getInputStream().read(buffer, 0, fileLength);
       bufferStream.write(buffer, 0, readBytes);
       read += readBytes;
     }
