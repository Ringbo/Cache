diff --git a/src/main/java/com/alibaba/fastjson/JSON.java b/src/main/java/com/alibaba/fastjson/JSON.java
index b4ffff3..8b375a0 100755
--- a/src/main/java/com/alibaba/fastjson/JSON.java
+++ b/src/main/java/com/alibaba/fastjson/JSON.java
@@ -771,7 +771,7 @@
             
             JSONObject json = new JSONObject();
             try {
-                javaBeanSerializer.getFieldValues(json);
+                javaBeanSerializer.getFieldValues(javaObject, json);
             } catch (Exception e) {
                 throw new JSONException("toJSON error", e);
             }
