diff --git a/spring-platform-netflix-core/src/main/java/org/springframework/platform/netflix/zuul/filters/route/RibbonRoutingFilter.java b/spring-platform-netflix-core/src/main/java/org/springframework/platform/netflix/zuul/filters/route/RibbonRoutingFilter.java
index 49067d6..b937fc2 100644
--- a/spring-platform-netflix-core/src/main/java/org/springframework/platform/netflix/zuul/filters/route/RibbonRoutingFilter.java
+++ b/spring-platform-netflix-core/src/main/java/org/springframework/platform/netflix/zuul/filters/route/RibbonRoutingFilter.java
@@ -162,9 +162,9 @@
         MultivaluedMap<String, String> params = new MultivaluedMapImpl();
         if (map == null) return params;
 
-        for (String key : params.keySet()) {
+        for (String key : map.keySet()) {
 
-            for (String value : params.get(key)) {
+            for (String value : map.get(key)) {
                 params.add(key, value);
             }
         }
