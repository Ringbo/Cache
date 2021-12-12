diff --git a/xml/impl/src/com/intellij/xml/breadcrumbs/BreadcrumbsComponent.java b/xml/impl/src/com/intellij/xml/breadcrumbs/BreadcrumbsComponent.java
index cfcbed1..c8225ec 100644
--- a/xml/impl/src/com/intellij/xml/breadcrumbs/BreadcrumbsComponent.java
+++ b/xml/impl/src/com/intellij/xml/breadcrumbs/BreadcrumbsComponent.java
@@ -171,12 +171,12 @@
 
     //final PsiFile file = myFile.getViewProvider().getPsi(myLanguage);
     //return file != null ? file.getViewProvider().findElementAt(offset) : null;
-    return myFile.getViewProvider().findElementAt(offset);
+    return myFile.isValid() ? myFile.getViewProvider().findElementAt(offset) : null;
   }
 
   @Nullable
   private List<LineElement> getLineElements(@Nullable final PsiElement endElement) {
-    if (endElement == null) {
+    if (endElement == null || !endElement.isValid()) {
       return null;
     }
 
