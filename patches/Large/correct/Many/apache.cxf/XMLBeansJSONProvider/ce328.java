diff --git a/rt/rs/extensions/providers/src/main/java/org/apache/cxf/jaxrs/provider/xmlbeans/XMLBeansJSONProvider.java b/rt/rs/extensions/providers/src/main/java/org/apache/cxf/jaxrs/provider/xmlbeans/XMLBeansJSONProvider.java
index 274d7da..3594b7f 100644
--- a/rt/rs/extensions/providers/src/main/java/org/apache/cxf/jaxrs/provider/xmlbeans/XMLBeansJSONProvider.java
+++ b/rt/rs/extensions/providers/src/main/java/org/apache/cxf/jaxrs/provider/xmlbeans/XMLBeansJSONProvider.java
@@ -70,7 +70,7 @@
             result = parseXmlBean(type, r);
 
             xsr.close();
-            result = null;
+            xsr = null;
 
         } catch (XMLStreamException e) {
             throw new WebApplicationException(HttpURLConnection.HTTP_INTERNAL_ERROR);
