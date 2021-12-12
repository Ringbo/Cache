diff --git a/src/meta/TSMeta.java b/src/meta/TSMeta.java
index 7b90584..55a2ff8 100644
--- a/src/meta/TSMeta.java
+++ b/src/meta/TSMeta.java
@@ -774,7 +774,7 @@
       if (custom == null) {
         json.writeNullField("custom");
       } else {
-        json.writeStartObject();
+        json.writeObjectFieldStart("custom");
         for (Map.Entry<String, String> entry : custom.entrySet()) {
           json.writeStringField(entry.getKey(), entry.getValue());
         }
