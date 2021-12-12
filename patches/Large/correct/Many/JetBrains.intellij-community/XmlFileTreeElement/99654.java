diff --git a/source/com/intellij/ide/structureView/impl/xml/XmlFileTreeElement.java b/source/com/intellij/ide/structureView/impl/xml/XmlFileTreeElement.java
index 4d16054..84ed72e 100644
--- a/source/com/intellij/ide/structureView/impl/xml/XmlFileTreeElement.java
+++ b/source/com/intellij/ide/structureView/impl/xml/XmlFileTreeElement.java
@@ -43,7 +43,7 @@
 
   public StructureViewTreeElement[] getChildrenBase() {
     XmlDocument document = getElement().getDocument();
-    if (document != null) {
+    if (document != null && document.getRootTag() != null) {
       return new StructureViewTreeElement[]{new XmlTagTreeElement(document.getRootTag())};
     }
     return new StructureViewTreeElement[0];
