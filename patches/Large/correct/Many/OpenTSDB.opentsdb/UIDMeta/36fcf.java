diff --git a/src/meta/UIDMeta.java b/src/meta/UIDMeta.java
index 3ff3055..12d7cc8 100644
--- a/src/meta/UIDMeta.java
+++ b/src/meta/UIDMeta.java
@@ -506,7 +506,7 @@
       if (custom == null) {
         json.writeNullField("custom");
       } else {
-        json.writeStartObject();
+        json.writeObjectFieldStart("custom");
         for (Map.Entry<String, String> entry : custom.entrySet()) {
           json.writeStringField(entry.getKey(), entry.getValue());
         }
