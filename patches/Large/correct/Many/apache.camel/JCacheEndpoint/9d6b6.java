diff --git a/components/camel-jcache/src/main/java/org/apache/camel/component/jcache/JCacheEndpoint.java b/components/camel-jcache/src/main/java/org/apache/camel/component/jcache/JCacheEndpoint.java
index b81ad00..ab052fd 100644
--- a/components/camel-jcache/src/main/java/org/apache/camel/component/jcache/JCacheEndpoint.java
+++ b/components/camel-jcache/src/main/java/org/apache/camel/component/jcache/JCacheEndpoint.java
@@ -32,24 +32,24 @@
     @UriPath(description = "the cache name")
     @Metadata(required = "true")
     private final String cacheName;
-    private final JCacheConfiguration cacheCnfiguration;
+    private final JCacheConfiguration cacheConfiguration;
     private final JCacheManager<Object, Object> cacheManager;
 
     public JCacheEndpoint(String uri, JCacheComponent component, JCacheConfiguration configuration, String cacheName) {
         super(uri, component);
 
         this.cacheName = cacheName;
-        this.cacheCnfiguration = configuration;
+        this.cacheConfiguration = configuration;
         this.cacheManager = new JCacheManager<>(
             configuration,
             cacheName,
-            getCamelContext().getApplicationContextClassLoader(),
-            super.getCamelContext());
+            component.getCamelContext().getApplicationContextClassLoader(),
+            component.getCamelContext());
     }
 
     @Override
     public Producer createProducer() throws Exception {
-        return new JCacheProducer(this, cacheCnfiguration);
+        return new JCacheProducer(this, cacheConfiguration);
     }
 
     @Override
