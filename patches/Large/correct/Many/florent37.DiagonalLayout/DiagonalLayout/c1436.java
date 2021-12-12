diff --git a/diagonallayout/src/main/java/com/github/florent37/diagonallayout/DiagonalLayout.java b/diagonallayout/src/main/java/com/github/florent37/diagonallayout/DiagonalLayout.java
index 0590670..0c03197 100644
--- a/diagonallayout/src/main/java/com/github/florent37/diagonallayout/DiagonalLayout.java
+++ b/diagonallayout/src/main/java/com/github/florent37/diagonallayout/DiagonalLayout.java
@@ -169,7 +169,7 @@
 
     private Path createOutlinePath(float perpendicularHeight) {
         Path path = new Path();
-        switch (settings.getDirection()) {
+        switch (settings.getPosition()) {
             case DiagonalLayoutSettings.BOTTOM:
                 if (settings.isDirectionLeft()) {
                     path.moveTo(getPaddingLeft(), getPaddingRight());
