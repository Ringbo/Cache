diff --git a/core/client-internal/src/main/java/alluxio/client/UfsUtils.java b/core/client-internal/src/main/java/alluxio/client/UfsUtils.java
index 26bba94..dfdd469 100644
--- a/core/client-internal/src/main/java/alluxio/client/UfsUtils.java
+++ b/core/client-internal/src/main/java/alluxio/client/UfsUtils.java
@@ -95,7 +95,7 @@
         AlluxioURI alluxioUriToLoad = alluxioUri.join(file);
         LOG.debug("Loading metadata for Alluxio uri: " + alluxioUriToLoad);
         // TODO(calvin): Remove the need for this hack
-        AlluxioURI alluxioPath = new AlluxioURI(alluxioUri.getPath());
+        AlluxioURI alluxioPath = new AlluxioURI(alluxioUriToLoad.getPath());
         if (!fs.exists(alluxioPath)) {
           fs.loadMetadata(alluxioPath);
         }
