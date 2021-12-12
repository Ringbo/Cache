diff --git a/xml/impl/src/com/intellij/xml/breadcrumbs/BreadcrumbsXmlWrapper.java b/xml/impl/src/com/intellij/xml/breadcrumbs/BreadcrumbsXmlWrapper.java
index 15da6bf..4d87fc8 100644
--- a/xml/impl/src/com/intellij/xml/breadcrumbs/BreadcrumbsXmlWrapper.java
+++ b/xml/impl/src/com/intellij/xml/breadcrumbs/BreadcrumbsXmlWrapper.java
@@ -167,7 +167,7 @@
   }
 
   private FileBreadcrumbsCollector findBreadcrumbsCollector() {
-    for (FileBreadcrumbsCollector extension : Extensions.getExtensions(FileBreadcrumbsCollector.EP_NAME)) {
+    for (FileBreadcrumbsCollector extension : Extensions.getExtensions(FileBreadcrumbsCollector.EP_NAME, myProject)) {
       if (extension.handlesFile(myFile)) {
         return extension;
       }
