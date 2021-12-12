diff --git a/common/buildcraft/lib/misc/data/Box.java b/common/buildcraft/lib/misc/data/Box.java
index f6c63b2..ad851a1 100644
--- a/common/buildcraft/lib/misc/data/Box.java
+++ b/common/buildcraft/lib/misc/data/Box.java
@@ -250,9 +250,9 @@
 
     public boolean doesIntersectWith(Box box) {
         if (isInitialized() && box.isInitialized()) {
-            return min.getX() < box.max.getX() && max.getX() > box.min.getX()//
-                && min.getY() < box.max.getY() && max.getY() > box.min.getY() //
-                && min.getZ() < box.max.getZ() && max.getZ() > box.min.getZ();
+            return min.getX() <= box.max.getX() && max.getX() >= box.min.getX()//
+                && min.getY() <= box.max.getY() && max.getY() >= box.min.getY()//
+                && min.getZ() <= box.max.getZ() && max.getZ() >= box.min.getZ();
         }
         return false;
     }
