diff --git a/core/src/main/java/fi/iki/elonen/NanoHTTPD.java b/core/src/main/java/fi/iki/elonen/NanoHTTPD.java
index 8c81435..f49ce93 100644
--- a/core/src/main/java/fi/iki/elonen/NanoHTTPD.java
+++ b/core/src/main/java/fi/iki/elonen/NanoHTTPD.java
@@ -833,7 +833,7 @@
                         String boundaryStartString = "boundary=";
                         int boundaryContentStart = contentTypeHeader.indexOf(boundaryStartString) + boundaryStartString.length();
                         String boundary = contentTypeHeader.substring(boundaryContentStart, contentTypeHeader.length());
-                        if (boundary.startsWith("\"") && boundary.startsWith("\"")) {
+                        if (boundary.startsWith("\"") && boundary.endsWith("\"")) {
                             boundary = boundary.substring(1, boundary.length() - 1);
                         }
 
