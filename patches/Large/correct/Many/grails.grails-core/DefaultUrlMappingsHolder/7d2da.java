diff --git a/src/web/org/codehaus/groovy/grails/web/mapping/DefaultUrlMappingsHolder.java b/src/web/org/codehaus/groovy/grails/web/mapping/DefaultUrlMappingsHolder.java
index d34cc12..24fe377 100644
--- a/src/web/org/codehaus/groovy/grails/web/mapping/DefaultUrlMappingsHolder.java
+++ b/src/web/org/codehaus/groovy/grails/web/mapping/DefaultUrlMappingsHolder.java
@@ -102,7 +102,7 @@
         return this.mappings;
     }
 
-    public UrlMapping getReverseMapping(final String controller, final String action, Map params) {
+    public UrlCreator getReverseMapping(final String controller, final String action, Map params) {
         if(params == null) params = Collections.EMPTY_MAP;
 
         UrlMapping mapping = (UrlMapping)mappingsLookup.get(new UrlMappingKey(controller, action, params.keySet()));
