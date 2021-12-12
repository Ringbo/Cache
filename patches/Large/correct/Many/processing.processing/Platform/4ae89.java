diff --git a/app/src/processing/app/Platform.java b/app/src/processing/app/Platform.java
index 3578e0a..91ea3c3 100644
--- a/app/src/processing/app/Platform.java
+++ b/app/src/processing/app/Platform.java
@@ -288,7 +288,7 @@
       // Decode URL
       String decodedPath;
       try {
-        decodedPath = pathURL.toURI().getPath();
+        decodedPath = pathURL.toURI().getSchemeSpecificPart();
       } catch (URISyntaxException e) {
         e.printStackTrace();
         return null;
