diff --git a/components/camel-jaxb/src/test/java/org/apache/camel/converter/jaxb/NonXmlFilterReaderTest.java b/components/camel-jaxb/src/test/java/org/apache/camel/converter/jaxb/NonXmlFilterReaderTest.java
index 44d8e90..e1f5ed0 100644
--- a/components/camel-jaxb/src/test/java/org/apache/camel/converter/jaxb/NonXmlFilterReaderTest.java
+++ b/components/camel-jaxb/src/test/java/org/apache/camel/converter/jaxb/NonXmlFilterReaderTest.java
@@ -89,7 +89,7 @@
     static class ConstantReader extends Reader {
         private char[] constant;
 
-        public ConstantReader(char[] constant) {
+        ConstantReader(char[] constant) {
             this.constant = constant;
         }
 
