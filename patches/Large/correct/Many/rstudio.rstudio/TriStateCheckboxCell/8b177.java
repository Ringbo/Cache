diff --git a/src/gwt/src/org/rstudio/core/client/cellview/TriStateCheckboxCell.java b/src/gwt/src/org/rstudio/core/client/cellview/TriStateCheckboxCell.java
index aef32f8..cb91d30 100644
--- a/src/gwt/src/org/rstudio/core/client/cellview/TriStateCheckboxCell.java
+++ b/src/gwt/src/org/rstudio/core/client/cellview/TriStateCheckboxCell.java
@@ -119,7 +119,7 @@
    @Override
    public void render(Context context, Boolean value, SafeHtmlBuilder sb)
    {
-      ImageResource img;
+      ImageResource2x img;
       if (value == null)
          img = new ImageResource2x(RES.checkboxIndeterminate2x());
       else if (value)
@@ -127,8 +127,7 @@
       else
          img = new ImageResource2x(RES.checkboxOff2x());
 
-      sb.append(SafeHtmlUtils.fromTrustedString(
-            AbstractImagePrototype.create(img).getHTML()));
+      sb.append(img.getSafeHtml());
    }
 
    @Override
