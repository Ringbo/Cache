diff --git a/src-ui/org/pentaho/di/ui/core/widget/TableView.java b/src-ui/org/pentaho/di/ui/core/widget/TableView.java
index d961519..090cb79 100644
--- a/src-ui/org/pentaho/di/ui/core/widget/TableView.java
+++ b/src-ui/org/pentaho/di/ui/core/widget/TableView.java
@@ -1115,7 +1115,7 @@
                 if (!bg.equals(defaultBackgroundColor))
                 {
                     String colorName = "bg "+bg.toString();
-                    r[1] = colorName;
+                    r[0] = colorName;
                     r[1] = new Long( (bg.getRed()<<16)+(bg.getGreen()<<8)+(bg.getBlue()) );
                     // Save it in the used colors map!
                     usedColors.put(colorName, bg);
