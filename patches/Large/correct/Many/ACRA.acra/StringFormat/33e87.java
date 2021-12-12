diff --git a/acra-core/src/main/java/org/acra/data/StringFormat.java b/acra-core/src/main/java/org/acra/data/StringFormat.java
index 6276f65..ed7990f 100644
--- a/acra-core/src/main/java/org/acra/data/StringFormat.java
+++ b/acra-core/src/main/java/org/acra/data/StringFormat.java
@@ -85,7 +85,7 @@
         private Map<String, String> toStringMap(Map<String, Object> map, String joiner) {
             final Map<String, String> stringMap = new HashMap<>(map.size());
             for (final Map.Entry<String, Object> entry : map.entrySet()) {
-                map.put(entry.getKey(), valueToString(joiner, entry.getValue()));
+                stringMap.put(entry.getKey(), valueToString(joiner, entry.getValue()));
             }
             return stringMap;
         }
