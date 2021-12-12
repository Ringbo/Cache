diff --git a/components/camel-cxf/src/main/java/org/apache/camel/component/cxf/CxfEndpoint.java b/components/camel-cxf/src/main/java/org/apache/camel/component/cxf/CxfEndpoint.java
index cc3e48f..d6ed579 100644
--- a/components/camel-cxf/src/main/java/org/apache/camel/component/cxf/CxfEndpoint.java
+++ b/components/camel-cxf/src/main/java/org/apache/camel/component/cxf/CxfEndpoint.java
@@ -923,7 +923,9 @@
                 message.remove(CxfConstants.CAMEL_CXF_ATTACHMENTS);
             }
 
-            if (DataFormat.PAYLOAD == message.get(DataFormat.class)) {
+            // Don't try to reset the parameters if the parameter is not CxfPayload instance
+            // as the setParameter will be called more than once when using the fail over feature
+            if (DataFormat.PAYLOAD == message.get(DataFormat.class) && params[0] instanceof CxfPayload) {
 
                 CxfPayload<?> payload = (CxfPayload<?>) params[0];
                 List<Source> elements = payload.getBodySources();
