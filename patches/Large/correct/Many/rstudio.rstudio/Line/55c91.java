diff --git a/src/gwt/src/org/rstudio/studio/client/workbench/views/vcs/diff/Line.java b/src/gwt/src/org/rstudio/studio/client/workbench/views/vcs/diff/Line.java
index 802811a..96bc7e1 100644
--- a/src/gwt/src/org/rstudio/studio/client/workbench/views/vcs/diff/Line.java
+++ b/src/gwt/src/org/rstudio/studio/client/workbench/views/vcs/diff/Line.java
@@ -108,7 +108,7 @@
 
    public Line reverse()
    {
-      if (appliesTo_.length > 1)
+      if (appliesTo_.length > 2)
          throw new UnsupportedOperationException("Can't reverse combined diff");
 
       return new Line(type_.getInverse(),
