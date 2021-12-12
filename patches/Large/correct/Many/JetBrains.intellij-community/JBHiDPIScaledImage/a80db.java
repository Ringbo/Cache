diff --git a/platform/util/src/com/intellij/util/JBHiDPIScaledImage.java b/platform/util/src/com/intellij/util/JBHiDPIScaledImage.java
index 637dc12..f9eeed3 100644
--- a/platform/util/src/com/intellij/util/JBHiDPIScaledImage.java
+++ b/platform/util/src/com/intellij/util/JBHiDPIScaledImage.java
@@ -173,7 +173,7 @@
     if (myImage != null) {
       return new JBHiDPIScaledImage(scaled, newUserWidth, newUserHeight, getType());
     }
-    JBHiDPIScaledImage newImg = new JBHiDPIScaledImage(newUserWidth, newUserHeight, getType());
+    JBHiDPIScaledImage newImg = new JBHiDPIScaledImage(myScale, newUserWidth, newUserHeight, getType(), RoundingMode.ROUND);
     Graphics2D g = newImg.createGraphics();
     g.drawImage(scaled, 0, 0, (int)round(newUserWidth), (int)round(newUserHeight),
                 0, 0, scaled.getWidth(null), scaled.getHeight(null), null);
