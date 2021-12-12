diff --git a/common/src/main/java/org/broadleafcommerce/common/resource/service/ResourceMinificationServiceImpl.java b/common/src/main/java/org/broadleafcommerce/common/resource/service/ResourceMinificationServiceImpl.java
index 1abba4f..f9ac20b 100644
--- a/common/src/main/java/org/broadleafcommerce/common/resource/service/ResourceMinificationServiceImpl.java
+++ b/common/src/main/java/org/broadleafcommerce/common/resource/service/ResourceMinificationServiceImpl.java
@@ -106,7 +106,7 @@
 
         String type = getFileType(originalResource, filename);
         if (type == null) {
-            LOG.trace("Unsupported minification resource: " + filename);
+            LOG.info("Unsupported minification resource: " + filename);
             return originalResource;
         }
 
@@ -136,7 +136,7 @@
         } catch (ResourceMinificationException e) {
             // We're throwing and catching ResourceMinificationException for backwards compatibility. 
             // In 5.4 this method will throw a ResourceMinificationException
-            throw new RuntimeException(e);
+            throw new IOException(e);
         }
     }
 
