diff --git a/core/src/main/java/fi/iki/elonen/NanoHTTPD.java b/core/src/main/java/fi/iki/elonen/NanoHTTPD.java
index c796aa4..2ebf093 100644
--- a/core/src/main/java/fi/iki/elonen/NanoHTTPD.java
+++ b/core/src/main/java/fi/iki/elonen/NanoHTTPD.java
@@ -659,7 +659,7 @@
                     // First line is boundary string
                     String mpline = in.readLine();
                     headerLines++;
-                    if (!mpline.contains(boundary)) {
+                    if (mpline == null || !mpline.contains(boundary)) {
                         throw new ResponseException(Response.Status.BAD_REQUEST, "BAD REQUEST: Content type is multipart/form-data but chunk does not start with boundary.");
                     }
 
