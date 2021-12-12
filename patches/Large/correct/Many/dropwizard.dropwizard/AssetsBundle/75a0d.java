diff --git a/dropwizard-core/src/main/java/com/yammer/dropwizard/bundles/AssetsBundle.java b/dropwizard-core/src/main/java/com/yammer/dropwizard/bundles/AssetsBundle.java
index 4423c3e..fd5f88e 100644
--- a/dropwizard-core/src/main/java/com/yammer/dropwizard/bundles/AssetsBundle.java
+++ b/dropwizard-core/src/main/java/com/yammer/dropwizard/bundles/AssetsBundle.java
@@ -80,7 +80,7 @@
      */
     public AssetsBundle(String resourcePath, CacheBuilderSpec cacheBuilderSpec, String uriPath) {
         checkArgument(resourcePath.startsWith("/"), "%s is not an absolute path", resourcePath);
-        checkArgument(!"/".equals(resourcePath), "%s is the classpath root");
+        checkArgument(!"/".equals(resourcePath), "%s is the classpath root", resourcePath);
         this.resourcePath = resourcePath.endsWith("/") ? resourcePath : (resourcePath + '/');
         this.uriPath = uriPath.endsWith("/") ? uriPath : (uriPath + '/');
         this.cacheBuilderSpec = cacheBuilderSpec;
