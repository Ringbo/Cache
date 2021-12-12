diff --git a/src/gwt/src/org/rstudio/studio/client/packrat/ui/PackratActionDialog.java b/src/gwt/src/org/rstudio/studio/client/packrat/ui/PackratActionDialog.java
index b1aaa30..0de9f1d 100644
--- a/src/gwt/src/org/rstudio/studio/client/packrat/ui/PackratActionDialog.java
+++ b/src/gwt/src/org/rstudio/studio/client/packrat/ui/PackratActionDialog.java
@@ -58,7 +58,7 @@
       try
       {
          JsArray<PackratPackageAction> actions = JsArray.createArray().cast();
-         new PackratActionDialogContents(actions);
+         new PackratActionDialogContents("", actions);
       }
       catch(Exception e)
       { 
