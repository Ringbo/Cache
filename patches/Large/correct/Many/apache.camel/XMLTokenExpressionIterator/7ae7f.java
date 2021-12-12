diff --git a/core/camel-core/src/main/java/org/apache/camel/builder/XMLTokenExpressionIterator.java b/core/camel-core/src/main/java/org/apache/camel/builder/XMLTokenExpressionIterator.java
index dd67a9a..ce44a39 100644
--- a/core/camel-core/src/main/java/org/apache/camel/builder/XMLTokenExpressionIterator.java
+++ b/core/camel-core/src/main/java/org/apache/camel/builder/XMLTokenExpressionIterator.java
@@ -221,7 +221,7 @@
             // perform the first offset compliance test
             int coff = reader.getLocation().getCharacterOffset();
             if (coff != 0) {
-                LOG.error("XMLStreamReader {} not supporting Location");
+                LOG.error("XMLStreamReader {} not supporting Location", reader);
                 throw new XMLStreamException("reader not supporting Location");
             }
 
@@ -474,7 +474,7 @@
                     // perform the second compliance test
                     if (!compliant) {
                         if (token != null && token.startsWith("<") && !token.startsWith("<?")) {
-                            LOG.error("XMLStreamReader {} not supporting Location");
+                            LOG.error("XMLStreamReader not supporting Location");
                             throw new XMLStreamException("reader not supporting Location");
                         }
                         compliant = true;
