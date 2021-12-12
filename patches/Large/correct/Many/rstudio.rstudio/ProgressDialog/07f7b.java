diff --git a/src/gwt/src/org/rstudio/core/client/widget/ProgressDialog.java b/src/gwt/src/org/rstudio/core/client/widget/ProgressDialog.java
index 6a42bfe..8424da8 100644
--- a/src/gwt/src/org/rstudio/core/client/widget/ProgressDialog.java
+++ b/src/gwt/src/org/rstudio/core/client/widget/ProgressDialog.java
@@ -146,7 +146,7 @@
    
    protected void setLabel(String text)
    {
-      if (BrowseCap.isChrome() || BrowseCap.isMacintoshDesktop())
+      if (BrowseCap.isChrome() || BrowseCap.isCocoaDesktop())
       {
          Size labelSize = DomMetrics.measureHTML(text);
          labelCell_.getStyle().setWidth(labelSize.width + 10, Unit.PX);
