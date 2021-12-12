diff --git a/xml/impl/src/com/intellij/xml/util/CheckEmptyScriptTagInspection.java b/xml/impl/src/com/intellij/xml/util/CheckEmptyScriptTagInspection.java
index f9c1397..4ff89e4 100644
--- a/xml/impl/src/com/intellij/xml/util/CheckEmptyScriptTagInspection.java
+++ b/xml/impl/src/com/intellij/xml/util/CheckEmptyScriptTagInspection.java
@@ -85,7 +85,7 @@
 
   static boolean isScriptTag(final XmlTag tag) {
     return ( SCRIPT_TAG_NAME.equals(tag.getName()) ||
-          (tag instanceof HtmlTag && SCRIPT_TAG_NAME.equalsIgnoreCase(tag.getLocalName()))
+          (tag instanceof HtmlTag && SCRIPT_TAG_NAME.equalsIgnoreCase(tag.getName()))
         ) && tag.getLanguage() != XMLLanguage.INSTANCE;
   }
 
