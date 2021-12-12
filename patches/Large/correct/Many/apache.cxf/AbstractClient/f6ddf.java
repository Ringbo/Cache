diff --git a/rt/frontend/jaxrs/src/main/java/org/apache/cxf/jaxrs/client/AbstractClient.java b/rt/frontend/jaxrs/src/main/java/org/apache/cxf/jaxrs/client/AbstractClient.java
index 791ec60..4b01a7c 100644
--- a/rt/frontend/jaxrs/src/main/java/org/apache/cxf/jaxrs/client/AbstractClient.java
+++ b/rt/frontend/jaxrs/src/main/java/org/apache/cxf/jaxrs/client/AbstractClient.java
@@ -398,7 +398,7 @@
             .createMessageBodyWriter(theClass, type, anns, contentType, outMessage);
         if (mbw != null) {
             try {
-                mbw.writeTo(o, cls, type, anns, contentType, headers, os);
+                mbw.writeTo(o, theClass, type, anns, contentType, headers, os);
                 if (os != null) {
                     os.flush();
                 }
