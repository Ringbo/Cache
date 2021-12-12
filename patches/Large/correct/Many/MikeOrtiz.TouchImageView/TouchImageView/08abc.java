diff --git a/src/com/example/touch/TouchImageView.java b/src/com/example/touch/TouchImageView.java
index dbd4f33..4314e3d 100755
--- a/src/com/example/touch/TouchImageView.java
+++ b/src/com/example/touch/TouchImageView.java
@@ -380,7 +380,7 @@
     	
     	setScaleType(scaleType);
     	resetZoom();
-    	scaleImage(scale, viewWidth / 2, viewHeight / 2, false);
+    	scaleImage(scale, viewWidth / 2, viewHeight / 2, true);
     	matrix.getValues(m);
     	m[Matrix.MTRANS_X] = -((focusX * getImageWidth()) - (viewWidth * 0.5f));
     	m[Matrix.MTRANS_Y] = -((focusY * getImageHeight()) - (viewHeight * 0.5f));
