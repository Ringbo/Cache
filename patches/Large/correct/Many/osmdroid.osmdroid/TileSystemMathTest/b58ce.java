diff --git a/osmdroid-android-it/src/main/java/org/osmdroid/TileSystemMathTest.java b/osmdroid-android-it/src/main/java/org/osmdroid/TileSystemMathTest.java
index 2fe09dd..0adb0ec 100644
--- a/osmdroid-android-it/src/main/java/org/osmdroid/TileSystemMathTest.java
+++ b/osmdroid-android-it/src/main/java/org/osmdroid/TileSystemMathTest.java
@@ -95,7 +95,7 @@
 		assertEquals(268435456, TileSystem.MapSize(20));
 		assertEquals(536870912, TileSystem.MapSize(21));
 		assertEquals(1073741824, TileSystem.MapSize(22));
-		assertEquals(-2147483648, TileSystem.MapSize(23));
+		assertEquals(1073741824, TileSystem.MapSize(23));
 	}
 
 	/**
@@ -126,7 +126,7 @@
 		assertEquals(0.1493, TileSystem.GroundResolution(0, 20), delta);
 		assertEquals(0.0746, TileSystem.GroundResolution(0, 21), delta);
 		assertEquals(0.0373, TileSystem.GroundResolution(0, 22), delta);
-		assertEquals(-0.0187, TileSystem.GroundResolution(0, 23), delta);
+		assertEquals(0.0373, TileSystem.GroundResolution(0, 23), delta);
 	}
 
 	/**
@@ -157,7 +157,7 @@
 		assertEquals(564.25, TileSystem.MapScale(0, 20, 96), delta);
 		assertEquals(282.12, TileSystem.MapScale(0, 21, 96), delta);
 		assertEquals(141.06, TileSystem.MapScale(0, 22, 96), delta);
-		assertEquals(-70.53, TileSystem.MapScale(0, 23, 96), delta);
+		assertEquals(141.06, TileSystem.MapScale(0, 23, 96), delta);
 	}
 
 	/**
