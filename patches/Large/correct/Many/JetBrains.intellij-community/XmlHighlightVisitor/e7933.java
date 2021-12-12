diff --git a/source/com/intellij/codeInsight/daemon/impl/analysis/XmlHighlightVisitor.java b/source/com/intellij/codeInsight/daemon/impl/analysis/XmlHighlightVisitor.java
index 84a892c..009ecb5 100644
--- a/source/com/intellij/codeInsight/daemon/impl/analysis/XmlHighlightVisitor.java
+++ b/source/com/intellij/codeInsight/daemon/impl/analysis/XmlHighlightVisitor.java
@@ -428,7 +428,7 @@
       return;
     }
 
-    if (attributeDescriptor.hasIdType()) {
+    if (myRefCountHolder != null && attributeDescriptor.hasIdType()) {
       String unquotedValue = getUnquotedValue(value, tag);
       final XmlTag xmlTag = myRefCountHolder.getTagById(unquotedValue);
 
@@ -469,7 +469,7 @@
   }
 
   public static HighlightInfo checkIdRefAttrValue(XmlAttributeValue value, RefCountHolder holder) {
-    if (!(value.getParent() instanceof XmlAttribute)) return null;
+    if (!(value.getParent() instanceof XmlAttribute) || holder==null) return null;
     XmlAttribute attribute = (XmlAttribute)value.getParent();
 
     XmlTag tag = attribute.getParent();
