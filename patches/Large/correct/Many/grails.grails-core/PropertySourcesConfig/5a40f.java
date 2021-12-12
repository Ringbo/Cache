diff --git a/grails-core/src/main/groovy/org/grails/config/PropertySourcesConfig.java b/grails-core/src/main/groovy/org/grails/config/PropertySourcesConfig.java
index a2b945c..c1ea54c 100644
--- a/grails-core/src/main/groovy/org/grails/config/PropertySourcesConfig.java
+++ b/grails-core/src/main/groovy/org/grails/config/PropertySourcesConfig.java
@@ -71,7 +71,7 @@
     }
 
     private void mergeEnumerablePropertySource(EnumerablePropertySource enumerablePropertySource) {
-        Map map = new HashMap();
+        Map map = new LinkedHashMap();
         for(String propertyName : enumerablePropertySource.getPropertyNames()) {
             map.put(propertyName, enumerablePropertySource.getProperty(propertyName));
         }
