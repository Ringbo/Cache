diff --git a/rt/transports/jms/src/main/java/org/apache/cxf/transport/jms/uri/JMSEndpoint.java b/rt/transports/jms/src/main/java/org/apache/cxf/transport/jms/uri/JMSEndpoint.java
index 8fb133f..1bf0f66 100644
--- a/rt/transports/jms/src/main/java/org/apache/cxf/transport/jms/uri/JMSEndpoint.java
+++ b/rt/transports/jms/src/main/java/org/apache/cxf/transport/jms/uri/JMSEndpoint.java
@@ -179,7 +179,7 @@
     private void configureProperties(Map<String, Object> params) {
         for (Map.Entry<String, Object> entry : params.entrySet()) {
             Object value = entry.getValue();
-            if (value == null || value.isEmpty()) {
+            if (value == null || value.equals("")) {
                 continue;
             }
             String key = entry.getKey();
