diff --git a/heron/uploaders/src/java/com/twitter/heron/uploader/s3/S3Uploader.java b/heron/uploaders/src/java/com/twitter/heron/uploader/s3/S3Uploader.java
index 09f56bb..e1b8254 100644
--- a/heron/uploaders/src/java/com/twitter/heron/uploader/s3/S3Uploader.java
+++ b/heron/uploaders/src/java/com/twitter/heron/uploader/s3/S3Uploader.java
@@ -199,7 +199,7 @@
       return resourceUrl.toURI();
     } catch (URISyntaxException e) {
       throw new UploaderException(
-          String.format("Could not convert URL %s to URI", resourceUrl, e));
+          String.format("Could not convert URL %s to URI", resourceUrl));
     }
   }
 
