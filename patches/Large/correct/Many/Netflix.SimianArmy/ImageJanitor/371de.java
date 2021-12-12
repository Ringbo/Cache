diff --git a/src/main/java/com/netflix/simianarmy/aws/janitor/ImageJanitor.java b/src/main/java/com/netflix/simianarmy/aws/janitor/ImageJanitor.java
index 62895ad..074f845 100644
--- a/src/main/java/com/netflix/simianarmy/aws/janitor/ImageJanitor.java
+++ b/src/main/java/com/netflix/simianarmy/aws/janitor/ImageJanitor.java
@@ -54,7 +54,7 @@
     @Override
     protected void cleanup(Resource resource) {
         LOGGER.info(String.format("Deleting image %s", resource.getId()));
-        awsClient.deleteLaunchConfiguration(resource.getId());
+        awsClient.deleteImage(resource.getId());
     }
 
     @Override
