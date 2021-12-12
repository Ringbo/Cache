diff --git a/src/WorldEditPlayer.java b/src/WorldEditPlayer.java
index 85a75f6..f085e96 100644
--- a/src/WorldEditPlayer.java
+++ b/src/WorldEditPlayer.java
@@ -95,7 +95,7 @@
      */
     public boolean isHoldingPickAxe() {
         int item = getItemInHand();
-        return item == 271 || item == 270 || item == 274 || item == 278
+        return item == 257 || item == 270 || item == 274 || item == 278
                 || item == 285;
     }
 
