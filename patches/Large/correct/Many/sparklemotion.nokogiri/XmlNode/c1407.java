diff --git a/ext/java/nokogiri/XmlNode.java b/ext/java/nokogiri/XmlNode.java
index 81f614f..c5ab80c 100644
--- a/ext/java/nokogiri/XmlNode.java
+++ b/ext/java/nokogiri/XmlNode.java
@@ -839,7 +839,7 @@
         RubyArray docErrors = getErrorArray(doc);
         if (isErrorIncreased(documentErrors, docErrors)) {
             for (int i = 0; i < docErrors.getLength(); i++) {
-                documentErrors.add(docErrors.get(i));
+                documentErrors.add(docErrors.entry(i));
             }
             document.setInstanceVariable("@errors", documentErrors);
             XmlNodeSet xmlNodeSet = XmlNodeSet.newXmlNodeSet(context, RubyArray.newArray(runtime));
