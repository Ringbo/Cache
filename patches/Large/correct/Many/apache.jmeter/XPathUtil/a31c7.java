diff --git a/src/core/org/apache/jmeter/util/XPathUtil.java b/src/core/org/apache/jmeter/util/XPathUtil.java
index 673fa52..2983589 100644
--- a/src/core/org/apache/jmeter/util/XPathUtil.java
+++ b/src/core/org/apache/jmeter/util/XPathUtil.java
@@ -529,7 +529,7 @@
             throws XMLStreamException, FactoryConfigurationError{
         List<String[]> res= new ArrayList<>();
         XMLStreamReader reader;
-        if(StringUtils.isNoneEmpty(xml)) {
+        if(StringUtils.isNotEmpty(xml)) {
             reader = XMLInputFactory.newFactory().createXMLStreamReader(new StringReader(xml));
             while (reader.hasNext()) {
                 int event = reader.next();
