diff --git a/src/gwt/src/org/rstudio/studio/client/pdfviewer/ui/PDFViewerPanel.java b/src/gwt/src/org/rstudio/studio/client/pdfviewer/ui/PDFViewerPanel.java
index 4375a33..0b88733 100644
--- a/src/gwt/src/org/rstudio/studio/client/pdfviewer/ui/PDFViewerPanel.java
+++ b/src/gwt/src/org/rstudio/studio/client/pdfviewer/ui/PDFViewerPanel.java
@@ -64,14 +64,14 @@
    public void updateSelectedPage(int pageNumber)
    {
       if (selectedPageLabel_ != null)
-         selectedPageLabel_.removeAttribute("selected");
+         selectedPageLabel_.removeClassName("selected");
 
       selectedPageLabel_ =
                    Document.get().getElementById("thumbnailLabel" + pageNumber);
 
       if (selectedPageLabel_ != null)
       {
-         selectedPageLabel_.setAttribute("selected", "selected");
+         selectedPageLabel_.addClassName("selected");
 
          Element scroller = Document.get().getElementById("sidebarScrollView");
          Element page =
