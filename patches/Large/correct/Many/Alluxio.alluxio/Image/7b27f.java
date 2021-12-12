diff --git a/core/src/main/java/tachyon/master/Image.java b/core/src/main/java/tachyon/master/Image.java
index 35698cf..c14245a 100644
--- a/core/src/main/java/tachyon/master/Image.java
+++ b/core/src/main/java/tachyon/master/Image.java
@@ -85,7 +85,7 @@
     }
     LOG.info("Loading image " + path);
     DataInputStream imageIs = new DataInputStream(ufs.open(path));
-    JsonParser parser = JsonObject.createObjectMapper().getJsonFactory().createJsonParser(imageIs);
+    JsonParser parser = JsonObject.createObjectMapper().getFactory().createParser(imageIs);
 
     info.loadImage(parser, path);
     imageIs.close();
