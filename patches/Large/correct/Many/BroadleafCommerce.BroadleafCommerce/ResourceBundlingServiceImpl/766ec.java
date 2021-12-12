diff --git a/common/src/main/java/org/broadleafcommerce/common/resource/service/ResourceBundlingServiceImpl.java b/common/src/main/java/org/broadleafcommerce/common/resource/service/ResourceBundlingServiceImpl.java
index d4f19d7..52d3ab6 100644
--- a/common/src/main/java/org/broadleafcommerce/common/resource/service/ResourceBundlingServiceImpl.java
+++ b/common/src/main/java/org/broadleafcommerce/common/resource/service/ResourceBundlingServiceImpl.java
@@ -104,7 +104,7 @@
     }
     
     protected Resource readBundle(String versionedBundleName) {
-        File bundleFile = fileService.getLocalResource(getResourcePath(versionedBundleName));
+        File bundleFile = fileService.getResource(getResourcePath(versionedBundleName));
         return new FileSystemResource(bundleFile);
     }
     
