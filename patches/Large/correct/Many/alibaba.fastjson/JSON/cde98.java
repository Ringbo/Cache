diff --git a/src/main/java/com/alibaba/fastjson/JSON.java b/src/main/java/com/alibaba/fastjson/JSON.java
index c12f6b3..6eda084 100755
--- a/src/main/java/com/alibaba/fastjson/JSON.java
+++ b/src/main/java/com/alibaba/fastjson/JSON.java
@@ -1001,7 +1001,7 @@
             for (Map.Entry<Object, Object> entry : map.entrySet()) {
                 Object key = entry.getKey();
                 String jsonKey = TypeUtils.castToString(key);
-                Object jsonValue = toJSON(entry.getValue());
+                Object jsonValue = toJSON(entry.getValue(), config);
                 json.put(jsonKey, jsonValue);
             }
 
@@ -1014,7 +1014,7 @@
             JSONArray array = new JSONArray(collection.size());
 
             for (Object item : collection) {
-                Object jsonValue = toJSON(item);
+                Object jsonValue = toJSON(item, config);
                 array.add(jsonValue);
             }
 
