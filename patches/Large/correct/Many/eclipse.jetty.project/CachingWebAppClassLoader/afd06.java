diff --git a/jetty-webapp/src/main/java/org/eclipse/jetty/webapp/CachingWebAppClassLoader.java b/jetty-webapp/src/main/java/org/eclipse/jetty/webapp/CachingWebAppClassLoader.java
index 569068c..02ce7a3 100644
--- a/jetty-webapp/src/main/java/org/eclipse/jetty/webapp/CachingWebAppClassLoader.java
+++ b/jetty-webapp/src/main/java/org/eclipse/jetty/webapp/CachingWebAppClassLoader.java
@@ -65,18 +65,21 @@
         
         URL url = _cache.get(name);
         
-        if (name==null)
+        if (url == null)
         {
+            // Not found in cache, try parent
             url = super.getResource(name);
         
             if (url==null)
             {
+                // Still not found, cache the not-found result
                 if (LOG.isDebugEnabled())
                     LOG.debug("Caching not found resource {}",name);
                 _notFound.add(name);
             }
             else
             {
+                // Cache the new result
                 _cache.putIfAbsent(name,url);
             }
         }
