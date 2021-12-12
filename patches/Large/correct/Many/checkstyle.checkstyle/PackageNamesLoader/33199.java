diff --git a/src/main/java/com/puppycrawl/tools/checkstyle/PackageNamesLoader.java b/src/main/java/com/puppycrawl/tools/checkstyle/PackageNamesLoader.java
index afc6005..85f6835 100644
--- a/src/main/java/com/puppycrawl/tools/checkstyle/PackageNamesLoader.java
+++ b/src/main/java/com/puppycrawl/tools/checkstyle/PackageNamesLoader.java
@@ -89,8 +89,7 @@
     public void startElement(String namespaceURI,
                              String localName,
                              String qName,
-                             Attributes atts)
-        throws SAXException {
+                             Attributes atts) {
         if ("package".equals(qName)) {
             //push package name, name is mandatory attribute with not empty value by DTD
             final String name = atts.getValue("name");
