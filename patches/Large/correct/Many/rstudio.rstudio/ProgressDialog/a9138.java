diff --git a/src/gwt/src/org/rstudio/core/client/widget/ProgressDialog.java b/src/gwt/src/org/rstudio/core/client/widget/ProgressDialog.java
index e6346bf..6a42bfe 100644
--- a/src/gwt/src/org/rstudio/core/client/widget/ProgressDialog.java
+++ b/src/gwt/src/org/rstudio/core/client/widget/ProgressDialog.java
@@ -146,7 +146,7 @@
    
    protected void setLabel(String text)
    {
-      if (BrowseCap.isChrome())
+      if (BrowseCap.isChrome() || BrowseCap.isMacintoshDesktop())
       {
          Size labelSize = DomMetrics.measureHTML(text);
          labelCell_.getStyle().setWidth(labelSize.width + 10, Unit.PX);
