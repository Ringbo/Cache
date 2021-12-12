diff --git a/xml/impl/src/com/intellij/lang/html/HtmlParsing.java b/xml/impl/src/com/intellij/lang/html/HtmlParsing.java
index 5371b76..e500762 100644
--- a/xml/impl/src/com/intellij/lang/html/HtmlParsing.java
+++ b/xml/impl/src/com/intellij/lang/html/HtmlParsing.java
@@ -229,9 +229,7 @@
     // Done header, start content
 
     boolean isInlineTagContainer = HtmlUtil.isInlineTagContainerL(tagName);
-    boolean isOptionalTagEnd = HtmlUtil.isOptionalEndForHtmlTagL(tagName) ||
-                               "body".equalsIgnoreCase(tagName) ||
-                               "html".equalsIgnoreCase(tagName);
+    boolean isOptionalTagEnd = HtmlUtil.isOptionalEndForHtmlTagL(tagName);
 
     PsiBuilder.Marker firstBlockChild = null;
 
@@ -364,7 +362,7 @@
 
     xmlText = terminateText(xmlText);
 
-    if (isOptionalTagEnd) {
+    if (isOptionalTagEnd || "body".equalsIgnoreCase(tagName) || "html".equalsIgnoreCase(tagName)) {
       if (firstBlockChild != null) {
         tag.doneBefore(XmlElementType.HTML_TAG, firstBlockChild);
       }
