diff --git a/extensions/gdx-tools/src/com/badlogic/gdx/tools/imagepacker/MaxRectsPacker.java b/extensions/gdx-tools/src/com/badlogic/gdx/tools/imagepacker/MaxRectsPacker.java
index fb6d59f..bcd48cf 100644
--- a/extensions/gdx-tools/src/com/badlogic/gdx/tools/imagepacker/MaxRectsPacker.java
+++ b/extensions/gdx-tools/src/com/badlogic/gdx/tools/imagepacker/MaxRectsPacker.java
@@ -52,20 +52,20 @@
 		if (settings.fast) {
 			if (settings.rotation) {
 				// Sort by longest side if rotation is enabled.
-				sort.sort(inputRects.items, new Comparator<Rect>() {
+				sort.sort(inputRects, new Comparator<Rect>() {
 					public int compare (Rect o1, Rect o2) {
 						int n1 = o1.width > o1.height ? o1.width : o1.height;
 						int n2 = o2.width > o2.height ? o2.width : o2.height;
 						return n2 - n1;
 					}
-				}, 0, inputRects.size);
+				});
 			} else {
 				// Sort only by width (largest to smallest) if rotation is disabled.
-				sort.sort(inputRects.items, new Comparator<Rect>() {
+				sort.sort(inputRects, new Comparator<Rect>() {
 					public int compare (Rect o1, Rect o2) {
 						return o2.width - o1.width;
 					}
-				}, 0, inputRects.size);
+				});
 			}
 		}
 
@@ -136,7 +136,7 @@
 		if (bestResult == null)
 			bestResult = packAtSize(false, settings.maxWidth - edgePaddingX, settings.maxHeight - edgePaddingY, inputRects);
 
-		bestResult.outputRects.sort(rectComparator);
+		sort.sort(bestResult.outputRects, rectComparator);
 
 		return bestResult;
 	}
