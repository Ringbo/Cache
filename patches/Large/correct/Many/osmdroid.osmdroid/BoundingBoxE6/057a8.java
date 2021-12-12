diff --git a/osmdroid-android/src/org/osmdroid/util/BoundingBoxE6.java b/osmdroid-android/src/org/osmdroid/util/BoundingBoxE6.java
index 709a3a4..57d68b9 100644
--- a/osmdroid-android/src/org/osmdroid/util/BoundingBoxE6.java
+++ b/osmdroid-android/src/org/osmdroid/util/BoundingBoxE6.java
@@ -223,7 +223,7 @@
 
 	public boolean contains(final int aLatitudeE6, final int aLongitudeE6) {
 		return ((aLatitudeE6 < this.mLatNorthE6) && (aLatitudeE6 > this.mLatSouthE6))
-				|| ((aLongitudeE6 < this.mLonEastE6) && (aLongitudeE6 > this.mLonWestE6));
+				&& ((aLongitudeE6 < this.mLonEastE6) && (aLongitudeE6 > this.mLonWestE6));
 	}
 
 	// ===========================================================
