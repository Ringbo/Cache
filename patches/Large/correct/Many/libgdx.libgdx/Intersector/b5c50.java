diff --git a/gdx/src/com/badlogic/gdx/math/Intersector.java b/gdx/src/com/badlogic/gdx/math/Intersector.java
index cb89080..47053d0 100644
--- a/gdx/src/com/badlogic/gdx/math/Intersector.java
+++ b/gdx/src/com/badlogic/gdx/math/Intersector.java
@@ -699,7 +699,7 @@
 				}
 			}
 
-			if (!((min1 < min2 && max1 > min2) || (min2 < min1 && max2 > min1))) {
+			if (!((min1 <= min2 && max1 >= min2) || (min2 <= min1 && max2 >= min1))) {
 				return false;
 			} else {
 				float o = Math.min(max1, max2) - Math.max(min1, min2);
@@ -764,7 +764,7 @@
 				}
 			}
 
-			if (!((min1 < min2 && max1 > min2) || (min2 < min1 && max2 > min1))) {
+			if (!((min1 <= min2 && max1 >= min2) || (min2 <= min1 && max2 >= min1))) {
 				return false;
 			} else {
 				float o = Math.min(max1, max2) - Math.max(min1, min2);
