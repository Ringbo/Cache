diff --git a/components/camel-zipfile/src/main/java/org/apache/camel/dataformat/zipfile/ZipFileDataFormat.java b/components/camel-zipfile/src/main/java/org/apache/camel/dataformat/zipfile/ZipFileDataFormat.java
index 1dd79e7..e5cffac 100644
--- a/components/camel-zipfile/src/main/java/org/apache/camel/dataformat/zipfile/ZipFileDataFormat.java
+++ b/components/camel-zipfile/src/main/java/org/apache/camel/dataformat/zipfile/ZipFileDataFormat.java
@@ -58,7 +58,7 @@
         ZipOutputStream zos = new ZipOutputStream(stream);
         zos.putNextEntry(new ZipEntry(filename));
 
-        InputStream is = exchange.getContext().getTypeConverter().mandatoryConvertTo(InputStream.class, graph);
+        InputStream is = exchange.getContext().getTypeConverter().mandatoryConvertTo(InputStream.class, exchange, graph);
 
         try {
             IOHelper.copy(is, zos);
