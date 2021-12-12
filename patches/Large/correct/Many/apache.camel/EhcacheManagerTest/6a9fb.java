diff --git a/components/camel-ehcache/src/test/java/org/apache/camel/component/ehcache/EhcacheManagerTest.java b/components/camel-ehcache/src/test/java/org/apache/camel/component/ehcache/EhcacheManagerTest.java
index 839dee4..e2663ff 100644
--- a/components/camel-ehcache/src/test/java/org/apache/camel/component/ehcache/EhcacheManagerTest.java
+++ b/components/camel-ehcache/src/test/java/org/apache/camel/component/ehcache/EhcacheManagerTest.java
@@ -75,7 +75,7 @@
 
         try {
             SimpleRegistry registry = new SimpleRegistry();
-            registry.put("myConf", new XmlConfiguration(getClass().getResource("/ehcache/ehcache-file-config.xml")));
+            registry.bind("myConf", new XmlConfiguration(getClass().getResource("/ehcache/ehcache-file-config.xml")));
 
             context = new DefaultCamelContext(registry);
             context.addRoutes(new RouteBuilder() {
@@ -120,7 +120,7 @@
             cacheManager = CacheManagerBuilder.newCacheManagerBuilder().build(true);
 
             SimpleRegistry registry = new SimpleRegistry();
-            registry.put("myManager", cacheManager);
+            registry.bind("myManager", cacheManager);
 
             context = new DefaultCamelContext(registry);
             context.addRoutes(new RouteBuilder() {
