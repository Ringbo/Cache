diff --git a/rt/frontend/jaxrs/src/main/java/org/apache/cxf/jaxrs/provider/AegisJSONProvider.java b/rt/frontend/jaxrs/src/main/java/org/apache/cxf/jaxrs/provider/AegisJSONProvider.java
index 7db6796..575c376 100644
--- a/rt/frontend/jaxrs/src/main/java/org/apache/cxf/jaxrs/provider/AegisJSONProvider.java
+++ b/rt/frontend/jaxrs/src/main/java/org/apache/cxf/jaxrs/provider/AegisJSONProvider.java
@@ -139,7 +139,7 @@
         // the namespace map. Oh, the namespace map.
         // This is wrong, but might make unit tests pass until we redesign.
         if (typeToRead != null) {
-            namespaceMap.put(typeToRead.getSchemaType().getNamespaceURI(), "ns1");
+            namespaceMap.putIfAbsent(typeToRead.getSchemaType().getNamespaceURI(), "ns1");
         }
         return JSONUtils.createStreamReader(is, readXsiType, namespaceMap);
     }
