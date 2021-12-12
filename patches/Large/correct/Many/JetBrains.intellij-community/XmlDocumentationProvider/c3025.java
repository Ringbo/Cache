diff --git a/xml/impl/src/com/intellij/xml/util/documentation/XmlDocumentationProvider.java b/xml/impl/src/com/intellij/xml/util/documentation/XmlDocumentationProvider.java
index c7579a4..6de6f70 100644
--- a/xml/impl/src/com/intellij/xml/util/documentation/XmlDocumentationProvider.java
+++ b/xml/impl/src/com/intellij/xml/util/documentation/XmlDocumentationProvider.java
@@ -50,12 +50,12 @@
   @Nullable
   public String getQuickNavigateInfo(PsiElement element) {
     final String name = ElementDescriptionUtil.getElementDescription(element, UsageViewShortNameLocation.INSTANCE);
-    if (StringUtil.isNotEmpty(name)) return null;
+    if (StringUtil.isEmpty(name)) return null;
     final String typeName = ElementDescriptionUtil.getElementDescription(element, UsageViewTypeLocation.INSTANCE);
     final PsiFile file = element.getContainingFile();
     final StringBuilder sb = new StringBuilder();
     if (StringUtil.isNotEmpty(typeName)) sb.append(typeName).append(" ");
-    sb.append(name);
+    sb.append("\"").append(name).append("\"");
     if (file != null) {
       sb.append(" [").append(file.getName()).append("]");
     }
