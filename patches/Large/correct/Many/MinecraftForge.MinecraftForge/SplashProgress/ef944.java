diff --git a/src/main/java/net/minecraftforge/fml/client/SplashProgress.java b/src/main/java/net/minecraftforge/fml/client/SplashProgress.java
index 04e08fb..df02ff5 100644
--- a/src/main/java/net/minecraftforge/fml/client/SplashProgress.java
+++ b/src/main/java/net/minecraftforge/fml/client/SplashProgress.java
@@ -453,7 +453,7 @@
                 setColor(barBorderColor);
                 drawBox(barWidth, barHeight);
                 // interior
-                setColor(backgroundColor);
+                setColor(barBackgroundColor);
                 glTranslatef(1, 1, 0);
                 drawBox(barWidth - 2, barHeight - 2);
                 // slidy part
