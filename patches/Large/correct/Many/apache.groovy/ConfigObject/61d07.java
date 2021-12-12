diff --git a/src/main/groovy/util/ConfigObject.java b/src/main/groovy/util/ConfigObject.java
index e1caf15..bc8092a 100644
--- a/src/main/groovy/util/ConfigObject.java
+++ b/src/main/groovy/util/ConfigObject.java
@@ -286,7 +286,7 @@
     private void populate(String suffix, Map config, Map map) {
         for (Object o : map.entrySet()) {
             Map.Entry next = (Map.Entry) o;
-            String key = (String) next.getKey();
+            Object key = next.getKey();
             Object value = next.getValue();
 
             if (value instanceof Map) {
