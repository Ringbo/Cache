diff --git a/src/gwt/src/org/rstudio/studio/client/workbench/views/jobs/view/JobItem.java b/src/gwt/src/org/rstudio/studio/client/workbench/views/jobs/view/JobItem.java
index a9f2fb9..37bfeec 100644
--- a/src/gwt/src/org/rstudio/studio/client/workbench/views/jobs/view/JobItem.java
+++ b/src/gwt/src/org/rstudio/studio/client/workbench/views/jobs/view/JobItem.java
@@ -131,9 +131,15 @@
       {
          if (DomUtils.isDescendant(
                Element.as(evt.getNativeEvent().getEventTarget()),
-               running_.getElement()))
+               running_.getElement()) ||
+             DomUtils.isDescendant(
+               Element.as(evt.getNativeEvent().getEventTarget()),
+                   stop_.getElement()) ||
+             DomUtils.isDescendant(
+                   Element.as(evt.getNativeEvent().getEventTarget()),
+                   launcherStop_.getElement()))
          {
-            // ignore clicks occurring inside the progress area
+            // ignore clicks occurring inside the progress area, or the stop button
             return;
          }
          RStudioGinjector.INSTANCE.getEventBus().fireEvent(
