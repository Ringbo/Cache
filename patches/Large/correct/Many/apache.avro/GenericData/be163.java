diff --git a/lang/java/avro/src/main/java/org/apache/avro/generic/GenericData.java b/lang/java/avro/src/main/java/org/apache/avro/generic/GenericData.java
index 9f3cc4d..76eb625 100644
--- a/lang/java/avro/src/main/java/org/apache/avro/generic/GenericData.java
+++ b/lang/java/avro/src/main/java/org/apache/avro/generic/GenericData.java
@@ -1030,7 +1030,7 @@
     LogicalType logicalType = schema.getLogicalType();
     if (logicalType == null)           // not a logical type -- use raw copy
       return (T)deepCopyRaw(schema, value);
-    Conversion conversion = getConversionByClass(value.getClass());
+    Conversion conversion = getConversionByClass(value.getClass(), logicalType);
     if (conversion == null)            // no conversion defined -- try raw copy
       return (T)deepCopyRaw(schema, value);
     // logical type with conversion: convert to raw, copy, then convert back to logical
