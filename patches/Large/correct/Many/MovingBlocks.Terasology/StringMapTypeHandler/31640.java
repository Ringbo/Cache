diff --git a/src/main/java/org/terasology/entitySystem/metadata/core/StringMapTypeHandler.java b/src/main/java/org/terasology/entitySystem/metadata/core/StringMapTypeHandler.java
index 9dd8b62..3b38292 100644
--- a/src/main/java/org/terasology/entitySystem/metadata/core/StringMapTypeHandler.java
+++ b/src/main/java/org/terasology/entitySystem/metadata/core/StringMapTypeHandler.java
@@ -56,7 +56,7 @@
     public Map<String, T> copy(Map<String, T> value) {
         if (value != null) {
             Map<String, T> result = Maps.newHashMap();
-            for (Map.Entry<String, T> entry : result.entrySet()) {
+            for (Map.Entry<String, T> entry : value.entrySet()) {
                 result.put(entry.getKey(), contentsHandler.copy(entry.getValue()));
             }
             return result;
