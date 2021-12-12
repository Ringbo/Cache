diff --git a/camel-core/src/main/java/org/apache/camel/util/CamelContextHelper.java b/camel-core/src/main/java/org/apache/camel/util/CamelContextHelper.java
index c8d80e7..7708231 100644
--- a/camel-core/src/main/java/org/apache/camel/util/CamelContextHelper.java
+++ b/camel-core/src/main/java/org/apache/camel/util/CamelContextHelper.java
@@ -365,7 +365,7 @@
      */
     public static SortedMap<String, Properties> findComponents(CamelContext camelContext) throws LoadPropertiesException {
         ClassResolver resolver = camelContext.getClassResolver();
-        LOG.info("Finding all components using class resolver: {} -> {}", new Object[]{resolver});
+        LOG.debug("Finding all components using class resolver: {} -> {}", new Object[]{resolver});
         Enumeration<URL> iter = resolver.loadAllResourcesAsURL(COMPONENT_DESCRIPTOR);
         return findComponents(camelContext, iter);
     }
@@ -376,7 +376,7 @@
         SortedMap<String, Properties> map = new TreeMap<String, Properties>();
         while (componentDescriptionIter != null && componentDescriptionIter.hasMoreElements()) {
             URL url = componentDescriptionIter.nextElement();
-            LOG.info("Finding components in url: {}", url);
+            LOG.trace("Finding components in url: {}", url);
             try {
                 Properties properties = new Properties();
                 properties.load(url.openStream());
