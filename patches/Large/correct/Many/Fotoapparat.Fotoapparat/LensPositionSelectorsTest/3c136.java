diff --git a/library/src/test/java/io/fotoapparat/parameter/selector/LensPositionSelectorsTest.java b/library/src/test/java/io/fotoapparat/parameter/selector/LensPositionSelectorsTest.java
index 10f3d40..7794ec8 100644
--- a/library/src/test/java/io/fotoapparat/parameter/selector/LensPositionSelectorsTest.java
+++ b/library/src/test/java/io/fotoapparat/parameter/selector/LensPositionSelectorsTest.java
@@ -23,7 +23,7 @@
 
 		// When
 		LensPosition result = LensPositionSelectors
-				.lensPosition(LensPosition.FRONT)
+				.front()
 				.select(availablePositions);
 
 		// Then
@@ -43,7 +43,7 @@
 
 		// When
 		LensPosition result = LensPositionSelectors
-				.lensPosition(LensPosition.FRONT)
+				.front()
 				.select(availablePositions);
 
 		// Then
@@ -61,7 +61,7 @@
 
 		// When
 		LensPosition result = LensPositionSelectors
-				.lensPosition(LensPosition.BACK)
+				.back()
 				.select(availablePositions);
 
 		// Then
@@ -81,7 +81,7 @@
 
 		// When
 		LensPosition result = LensPositionSelectors
-				.lensPosition(LensPosition.BACK)
+				.back()
 				.select(availablePositions);
 
 		// Then
@@ -99,7 +99,7 @@
 
 		// When
 		LensPosition result = LensPositionSelectors
-				.lensPosition(LensPosition.EXTERNAL)
+				.external()
 				.select(availablePositions);
 
 		// Then
@@ -119,7 +119,7 @@
 
 		// When
 		LensPosition result = LensPositionSelectors
-				.lensPosition(LensPosition.EXTERNAL)
+				.external()
 				.select(availablePositions);
 
 		// Then
