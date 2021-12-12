diff --git a/presto-spi/src/main/java/com/facebook/presto/spi/SerializableNativeValue.java b/presto-spi/src/main/java/com/facebook/presto/spi/SerializableNativeValue.java
index 3d3d63f..e37b1da 100644
--- a/presto-spi/src/main/java/com/facebook/presto/spi/SerializableNativeValue.java
+++ b/presto-spi/src/main/java/com/facebook/presto/spi/SerializableNativeValue.java
@@ -84,7 +84,7 @@
                 throws IOException
         {
             generator.writeStartObject();
-            generator.writeStringField("type", value.getType().getCanonicalName());
+            generator.writeStringField("type", value.getType().getName());
             generator.writeFieldName("value");
             if (value.getValue() == null) {
                 generator.writeNull();
