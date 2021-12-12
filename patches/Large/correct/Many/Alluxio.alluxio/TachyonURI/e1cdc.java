diff --git a/core/src/main/java/tachyon/TachyonURI.java b/core/src/main/java/tachyon/TachyonURI.java
index 57c4685..d45a2bd 100644
--- a/core/src/main/java/tachyon/TachyonURI.java
+++ b/core/src/main/java/tachyon/TachyonURI.java
@@ -104,7 +104,7 @@
     try {
       parentUri =
           new URI(parentUri.getScheme(), parentUri.getAuthority(),
-              parentUri.getPath() + SEPARATOR, null);
+              parentUri.getPath() + SEPARATOR, null, null);
     } catch (URISyntaxException e) {
       throw new IllegalArgumentException(e);
     }
