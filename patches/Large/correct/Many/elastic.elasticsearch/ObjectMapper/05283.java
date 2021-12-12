diff --git a/modules/elasticsearch/src/main/java/org/elasticsearch/index/mapper/xcontent/ObjectMapper.java b/modules/elasticsearch/src/main/java/org/elasticsearch/index/mapper/xcontent/ObjectMapper.java
index 731664d..0c33847 100644
--- a/modules/elasticsearch/src/main/java/org/elasticsearch/index/mapper/xcontent/ObjectMapper.java
+++ b/modules/elasticsearch/src/main/java/org/elasticsearch/index/mapper/xcontent/ObjectMapper.java
@@ -140,7 +140,7 @@
 
                 if (fieldName.equals("dynamic")) {
                     String value = fieldNode.toString();
-                    if (value.equals("strict")) {
+                    if (value.equalsIgnoreCase("strict")) {
                         builder.dynamic(Dynamic.STRICT);
                     } else {
                         builder.dynamic(nodeBooleanValue(fieldNode) ? Dynamic.TRUE : Dynamic.FALSE);
@@ -590,11 +590,11 @@
         // inherit the root behavior
         if (this instanceof RootObjectMapper) {
             if (dynamic != Dynamic.TRUE) {
-                builder.field("dynamic", dynamic);
+                builder.field("dynamic", dynamic.name().toLowerCase());
             }
         } else {
             if (dynamic != Defaults.DYNAMIC) {
-                builder.field("dynamic", dynamic);
+                builder.field("dynamic", dynamic.name().toLowerCase());
             }
         }
         if (enabled != Defaults.ENABLED) {
