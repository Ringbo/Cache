diff --git a/components/camel-cache/src/main/java/org/apache/camel/component/cache/CacheProducer.java b/components/camel-cache/src/main/java/org/apache/camel/component/cache/CacheProducer.java
index a1e3bbb..e347716 100755
--- a/components/camel-cache/src/main/java/org/apache/camel/component/cache/CacheProducer.java
+++ b/components/camel-cache/src/main/java/org/apache/camel/component/cache/CacheProducer.java
@@ -102,13 +102,13 @@
                 LOG.debug("Adding an element with key " + key + " into the Cache");
             }
             element = createElementFromBody(exchange, CacheConstants.CACHE_OPERATION_ADD);
-            cache.put(new Element(key, element), true);
+            cache.put(new Element(key, element));
         } else if (operation.equalsIgnoreCase(CacheConstants.CACHE_OPERATION_UPDATE)) {
             if (LOG.isDebugEnabled()) {
                 LOG.debug("Updating an element with key " + key + " into the Cache");
             }
             element = createElementFromBody(exchange, CacheConstants.CACHE_OPERATION_UPDATE);
-            cache.put(new Element(key, element), true);
+            cache.put(new Element(key, element));
         } else if (operation.equalsIgnoreCase(CacheConstants.CACHE_OPERATION_DELETEALL)) {
             if (LOG.isDebugEnabled()) {
                 LOG.debug("Deleting All elements from the Cache");
@@ -118,7 +118,7 @@
             if (LOG.isDebugEnabled()) {
                 LOG.debug("Deleting an element with key " + key + " into the Cache");
             }
-            cache.remove(key, true);
+            cache.remove(key);
         } else if (operation.equalsIgnoreCase(CacheConstants.CACHE_OPERATION_GET)) {
             if (LOG.isDebugEnabled()) {
                 LOG.debug("Quering an element with key " + key + " from the Cache");
