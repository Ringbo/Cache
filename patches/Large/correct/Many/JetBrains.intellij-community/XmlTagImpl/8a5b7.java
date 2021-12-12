diff --git a/xml/impl/src/com/intellij/psi/impl/source/xml/XmlTagImpl.java b/xml/impl/src/com/intellij/psi/impl/source/xml/XmlTagImpl.java
index 50bc5a0..96dac79 100644
--- a/xml/impl/src/com/intellij/psi/impl/source/xml/XmlTagImpl.java
+++ b/xml/impl/src/com/intellij/psi/impl/source/xml/XmlTagImpl.java
@@ -110,7 +110,7 @@
   public XmlNSDescriptor getNSDescriptor(final String namespace, boolean strict) {
     final XmlTag parentTag = getParentTag();
 
-    if (parentTag == null) {
+    if (parentTag == null && namespace.equals(XmlUtil.XHTML_URI)) {
       PsiFile containingFile = getContainingFile();
       if (!(containingFile instanceof XmlFile) && PsiUtil.isInJspFile(containingFile)) {
         containingFile = PsiUtil.getJspFile(containingFile);
@@ -118,9 +118,7 @@
       final XmlDocument document = ((XmlFile)containingFile).getDocument();
       final XmlProlog prolog = document.getProlog();
 
-      if(prolog != null && prolog.getDoctype() != null &&
-         namespace.equals(XmlUtil.XHTML_URI)
-        ) {
+      if(prolog != null && prolog.getDoctype() != null) {
         final String url = prolog.getDoctype().getDtdUri();
         XmlNSDescriptor nsDescriptor = url != null ? document.getDefaultNSDescriptor(url, true):null;
         
