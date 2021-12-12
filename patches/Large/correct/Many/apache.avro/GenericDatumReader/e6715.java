diff --git a/src/java/org/apache/avro/generic/GenericDatumReader.java b/src/java/org/apache/avro/generic/GenericDatumReader.java
index 43dbb83..83fc172 100644
--- a/src/java/org/apache/avro/generic/GenericDatumReader.java
+++ b/src/java/org/apache/avro/generic/GenericDatumReader.java
@@ -229,7 +229,7 @@
       }
       return map;
     case UNION:   return defaultFieldValue(old, schema.getTypes().get(0), json);
-    case FIXED:   return createFixed(old,json.getTextValue().getBytes(),schema);
+    case FIXED:   return createFixed(old,json.getTextValue().getBytes("ISO-8859-1"),schema);
     case STRING:  return createString(json.getTextValue());
     case BYTES:  return createBytes(json.getTextValue().getBytes("ISO-8859-1"));
     case INT:     return json.getIntValue();
