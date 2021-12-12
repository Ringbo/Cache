diff --git a/components/camel-cxf/src/main/java/org/apache/camel/component/cxf/converter/CxfPayloadConverter.java b/components/camel-cxf/src/main/java/org/apache/camel/component/cxf/converter/CxfPayloadConverter.java
index f33ad5e..0fa3c60 100644
--- a/components/camel-cxf/src/main/java/org/apache/camel/component/cxf/converter/CxfPayloadConverter.java
+++ b/components/camel-cxf/src/main/java/org/apache/camel/component/cxf/converter/CxfPayloadConverter.java
@@ -147,7 +147,8 @@
         if (CxfPayload.class.isAssignableFrom(value.getClass())) {
             CxfPayload<?> payload = (CxfPayload<?>) value;
             
-            if (payload.getBodySources().size() == 1) {
+            if (payload.getBodySources() != null 
+                && payload.getBodySources().size() == 1) {
                 if (type.isAssignableFrom(Document.class)) {
                     Source s = payload.getBodySources().get(0);
                     Document d;
