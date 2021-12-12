diff --git a/xml/impl/src/com/intellij/xml/breadcrumbs/BreadcrumbsXmlWrapper.java b/xml/impl/src/com/intellij/xml/breadcrumbs/BreadcrumbsXmlWrapper.java
index 8cd9a8e..3db9987 100644
--- a/xml/impl/src/com/intellij/xml/breadcrumbs/BreadcrumbsXmlWrapper.java
+++ b/xml/impl/src/com/intellij/xml/breadcrumbs/BreadcrumbsXmlWrapper.java
@@ -111,7 +111,7 @@
     manager.addFileStatusListener(new FileStatusListener() {
       @Override
       public void fileStatusesChanged() {
-        updateCrumbs();
+        queueUpdate();
       }
     }, this);
 
