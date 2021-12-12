diff --git a/src/main/java/com/puppycrawl/tools/checkstyle/ConfigurationLoader.java b/src/main/java/com/puppycrawl/tools/checkstyle/ConfigurationLoader.java
index 88a8b51..3f62994 100644
--- a/src/main/java/com/puppycrawl/tools/checkstyle/ConfigurationLoader.java
+++ b/src/main/java/com/puppycrawl/tools/checkstyle/ConfigurationLoader.java
@@ -505,8 +505,7 @@
         @Override
         public void endElement(String namespaceURI,
                                String localName,
-                               String qName)
-            throws SAXException {
+                               String qName) {
             if (qName.equals(MODULE)) {
 
                 final Configuration recentModule =
