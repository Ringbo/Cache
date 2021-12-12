diff --git a/bundles/io/org.eclipse.smarthome.io.rest.sitemap/src/main/java/org/eclipse/smarthome/io/rest/sitemap/internal/SitemapResource.java b/bundles/io/org.eclipse.smarthome.io.rest.sitemap/src/main/java/org/eclipse/smarthome/io/rest/sitemap/internal/SitemapResource.java
index 9f58255..df3ef7c 100644
--- a/bundles/io/org.eclipse.smarthome.io.rest.sitemap/src/main/java/org/eclipse/smarthome/io/rest/sitemap/internal/SitemapResource.java
+++ b/bundles/io/org.eclipse.smarthome.io.rest.sitemap/src/main/java/org/eclipse/smarthome/io/rest/sitemap/internal/SitemapResource.java
@@ -571,6 +571,7 @@
      *
      * @param widgets
      *            the widgets of the page to observe
+     * @return true if the timeout is reached
      */
     private boolean waitForChanges(EList<Widget> widgets) {
         long startTime = (new Date()).getTime();
@@ -593,7 +594,7 @@
         for (GenericItem item : items) {
             item.removeStateChangeListener(listener);
         }
-        return !timeout;
+        return timeout;
     }
 
     /**
