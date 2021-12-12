diff --git a/graphics/java/android/graphics/RectF.java b/graphics/java/android/graphics/RectF.java
index 293dfcc..c633d84 100644
--- a/graphics/java/android/graphics/RectF.java
+++ b/graphics/java/android/graphics/RectF.java
@@ -84,7 +84,7 @@
         if (this == o) return true;
         if (o == null || getClass() != o.getClass()) return false;
 
-        Rect r = (Rect) o;
+        RectF r = (RectF) o;
         return left == r.left && top == r.top && right == r.right && bottom == r.bottom;
     }
 
