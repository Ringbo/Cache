diff --git a/src/components/org/apache/jmeter/assertions/XMLAssertion.java b/src/components/org/apache/jmeter/assertions/XMLAssertion.java
index a92003a..7ada8ac 100644
--- a/src/components/org/apache/jmeter/assertions/XMLAssertion.java
+++ b/src/components/org/apache/jmeter/assertions/XMLAssertion.java
@@ -70,7 +70,7 @@
         }
         result.setFailure(false);
         XMLReader builder = XML_READER.get();
-        if(XML_READER!=null) {
+        if(builder != null) {
             try {
                 builder.parse(new InputSource(new StringReader(resultData)));
             } catch (SAXException | IOException e) {
