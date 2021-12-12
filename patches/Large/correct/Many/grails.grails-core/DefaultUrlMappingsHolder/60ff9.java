diff --git a/src/web/org/codehaus/groovy/grails/web/mapping/DefaultUrlMappingsHolder.java b/src/web/org/codehaus/groovy/grails/web/mapping/DefaultUrlMappingsHolder.java
index bbbffb5..d307200 100644
--- a/src/web/org/codehaus/groovy/grails/web/mapping/DefaultUrlMappingsHolder.java
+++ b/src/web/org/codehaus/groovy/grails/web/mapping/DefaultUrlMappingsHolder.java
@@ -229,10 +229,10 @@
     class UrlMappingKey {
         String controller;
         String action;
-        Collection paramNames = Collections.EMPTY_SET;
+        Set paramNames = Collections.EMPTY_SET;
 
 
-        public UrlMappingKey(String controller, String action, Collection paramNames) {
+        public UrlMappingKey(String controller, String action, Set paramNames) {
             this.controller = controller;
             this.action = action;
             this.paramNames = paramNames;
