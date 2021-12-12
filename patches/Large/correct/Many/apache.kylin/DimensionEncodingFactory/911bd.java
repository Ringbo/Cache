diff --git a/core-metadata/src/main/java/org/apache/kylin/dimension/DimensionEncodingFactory.java b/core-metadata/src/main/java/org/apache/kylin/dimension/DimensionEncodingFactory.java
index 4954ead..3eddba7 100644
--- a/core-metadata/src/main/java/org/apache/kylin/dimension/DimensionEncodingFactory.java
+++ b/core-metadata/src/main/java/org/apache/kylin/dimension/DimensionEncodingFactory.java
@@ -71,7 +71,7 @@
         if (factoryMap == null)
             initFactoryMap();
 
-        Map<String, Integer> result = Maps.newHashMap();
+        Map<String, Integer> result = Maps.newTreeMap();
         for (Pair<String, Integer> p : factoryMap.keySet()) {
             if (result.containsKey(p.getFirst())) {
                 if (result.get(p.getFirst()) > p.getSecond()) {
