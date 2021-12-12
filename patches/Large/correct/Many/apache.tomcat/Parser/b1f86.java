diff --git a/java/org/apache/jasper/compiler/Parser.java b/java/org/apache/jasper/compiler/Parser.java
index 837f199..473ffeb 100644
--- a/java/org/apache/jasper/compiler/Parser.java
+++ b/java/org/apache/jasper/compiler/Parser.java
@@ -232,7 +232,7 @@
         }
         watchString = watchString + quote;
 
-        String attrValue = parseAttributeValue(watchString, ignoreEL);
+        String attrValue = parseAttributeValue(qName, watchString, ignoreEL);
         attrs.addAttribute(uri, localName, qName, "CDATA", attrValue);
         return true;
     }
@@ -263,11 +263,11 @@
      * RTAttributeValueDouble ::= ((QuotedChar - '"')* - ((QuotedChar-'"')'%>"')
      * ('%>"' | TRANSLATION_ERROR)
      */
-    private String parseAttributeValue(String watch, boolean ignoreEL) throws JasperException {
+    private String parseAttributeValue(String qName, String watch, boolean ignoreEL) throws JasperException {
         Mark start = reader.mark();
         Mark stop = reader.skipUntilIgnoreEsc(watch, ignoreEL);
         if (stop == null) {
-            err.jspError(start, "jsp.error.attribute.unterminated", watch);
+            err.jspError(start, "jsp.error.attribute.unterminated", qName);
         }
 
         String ret = null;
