diff --git a/common/buildcraft/factory/tile/TileMiner.java b/common/buildcraft/factory/tile/TileMiner.java
index d761c84..17fbdb7 100644
--- a/common/buildcraft/factory/tile/TileMiner.java
+++ b/common/buildcraft/factory/tile/TileMiner.java
@@ -59,7 +59,7 @@
 
         if (!battery.isFull()) {
             //  test with the output of a stone engine
-            battery.addPower(MjAPI.MJ); // remove this
+            battery.addPower(MjAPI.MJ, false); // remove this
         }
 
         battery.tick(getWorld(), getPos());
