diff --git a/components/camel-cxf/src/main/java/org/apache/camel/component/cxf/converter/CxfPayloadConverter.java b/components/camel-cxf/src/main/java/org/apache/camel/component/cxf/converter/CxfPayloadConverter.java
index 44a12c8..a613e47 100644
--- a/components/camel-cxf/src/main/java/org/apache/camel/component/cxf/converter/CxfPayloadConverter.java
+++ b/components/camel-cxf/src/main/java/org/apache/camel/component/cxf/converter/CxfPayloadConverter.java
@@ -126,7 +126,7 @@
                 } else if (value instanceof Node) {
                     src = new DOMSource((Node)value);
                 } else if (value instanceof Source) {
-                    src = (Source)src;
+                    src = (Source)value;
                 }
                 if (src == null) {
                     // assuming staxsource is preferred, otherwise use the one preferred
