diff --git a/core/src/processing/core/PGraphicsJava2D.java b/core/src/processing/core/PGraphicsJava2D.java
index 48113e0..06394c8 100644
--- a/core/src/processing/core/PGraphicsJava2D.java
+++ b/core/src/processing/core/PGraphicsJava2D.java
@@ -305,7 +305,7 @@
       int wide = width * pixelDensity;
       int high = height * pixelDensity;
 //      System.out.println("re-creating image");
-      image = gc.createCompatibleImage(wide, high);
+      image = gc.createCompatibleImage(wide, high, Transparency.TRANSLUCENT);
 //      image = gc.createCompatibleVolatileImage(wide, high);
       //image = surface.getComponent().createImage(width, height);
     }
