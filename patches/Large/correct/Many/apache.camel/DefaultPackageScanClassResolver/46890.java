diff --git a/camel-core/src/main/java/org/apache/camel/impl/DefaultPackageScanClassResolver.java b/camel-core/src/main/java/org/apache/camel/impl/DefaultPackageScanClassResolver.java
index d012eb7..4b91fbe 100644
--- a/camel-core/src/main/java/org/apache/camel/impl/DefaultPackageScanClassResolver.java
+++ b/camel-core/src/main/java/org/apache/camel/impl/DefaultPackageScanClassResolver.java
@@ -206,7 +206,7 @@
                     log.trace("URL from classloader: " + url);
                 }
                 
-                url = customerResourceLocator(url);
+                url = customResourceLocator(url);
 
                 String urlPath = url.getFile();
                 urlPath = URLDecoder.decode(urlPath, "UTF-8");
