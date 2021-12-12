diff --git a/source/com/intellij/lang/xml/XMLLanguage.java b/source/com/intellij/lang/xml/XMLLanguage.java
index 1ed1ce9..fb3dd35 100644
--- a/source/com/intellij/lang/xml/XMLLanguage.java
+++ b/source/com/intellij/lang/xml/XMLLanguage.java
@@ -65,7 +65,7 @@
   public boolean mayHaveReferences(IElementType token, short searchContext) {
     if(token == XmlTokenType.XML_ATTRIBUTE_VALUE_TOKEN) return true;
     if(token == XmlTokenType.XML_DATA_CHARACTERS) {
-      return (searchContext | UsageSearchContext.IN_PLAIN_TEXT) != 0;
+      return (searchContext & UsageSearchContext.IN_PLAIN_TEXT) != 0;
     }
     return false;
   }
