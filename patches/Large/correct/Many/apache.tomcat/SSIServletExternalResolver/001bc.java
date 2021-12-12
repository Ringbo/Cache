diff --git a/java/org/apache/catalina/ssi/SSIServletExternalResolver.java b/java/org/apache/catalina/ssi/SSIServletExternalResolver.java
index f86e2d7..89a1692 100644
--- a/java/org/apache/catalina/ssi/SSIServletExternalResolver.java
+++ b/java/org/apache/catalina/ssi/SSIServletExternalResolver.java
@@ -170,9 +170,9 @@
             }
         } else if(nameParts[0].equals("CONTENT")) {
             if (nameParts[1].equals("LENGTH")) {
-                int contentLength = req.getContentLength();
+                long contentLength = req.getContentLengthLong();
                 if (contentLength >= 0) {
-                    retVal = Integer.toString(contentLength);
+                    retVal = Long.toString(contentLength);
                 }
             } else if (nameParts[1].equals("TYPE")) {
                 retVal = req.getContentType();
@@ -504,7 +504,7 @@
         long fileSize = -1;
         try {
             URLConnection urlConnection = getURLConnection(path, virtual);
-            fileSize = urlConnection.getContentLength();
+            fileSize = urlConnection.getContentLengthLong();
         } catch (IOException e) {
             // Ignore this. It will always fail for non-file based includes
         }
