diff --git a/src/main/java/com/puppycrawl/tools/checkstyle/ConfigurationLoader.java b/src/main/java/com/puppycrawl/tools/checkstyle/ConfigurationLoader.java
index 263738a..cfc800e 100644
--- a/src/main/java/com/puppycrawl/tools/checkstyle/ConfigurationLoader.java
+++ b/src/main/java/com/puppycrawl/tools/checkstyle/ConfigurationLoader.java
@@ -424,7 +424,7 @@
          * @throws SAXException if an error occurs
          * @throws ParserConfigurationException if an error occurs
          */
-        public InternalLoader()
+        InternalLoader()
             throws SAXException, ParserConfigurationException {
             super(createIdToResourceNameMap());
         }
