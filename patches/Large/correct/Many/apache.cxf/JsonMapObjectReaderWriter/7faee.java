diff --git a/rt/rs/extensions/providers/src/main/java/org/apache/cxf/jaxrs/provider/json/JsonMapObjectReaderWriter.java b/rt/rs/extensions/providers/src/main/java/org/apache/cxf/jaxrs/provider/json/JsonMapObjectReaderWriter.java
index e7cfd61..e9e6b6c 100644
--- a/rt/rs/extensions/providers/src/main/java/org/apache/cxf/jaxrs/provider/json/JsonMapObjectReaderWriter.java
+++ b/rt/rs/extensions/providers/src/main/java/org/apache/cxf/jaxrs/provider/json/JsonMapObjectReaderWriter.java
@@ -265,7 +265,7 @@
     }
     private static class JsonObjectSettable implements Settable {
         private JsonMapObject obj;
-        public JsonObjectSettable(JsonMapObject obj) {
+        JsonObjectSettable(JsonMapObject obj) {
             this.obj = obj;
         }
         public void put(String key, Object value) {
@@ -277,7 +277,7 @@
     }
     private class StringBuilderOutput implements Output {
         private StringBuilder sb;
-        public StringBuilderOutput(StringBuilder sb) {
+        StringBuilderOutput(StringBuilder sb) {
             this.sb = sb;
         }
         @Override
@@ -289,7 +289,7 @@
     }
     private class StreamOutput implements Output {
         private OutputStream os;
-        public StreamOutput(OutputStream os) {
+        StreamOutput(OutputStream os) {
             this.os = os;
         }
         @Override
