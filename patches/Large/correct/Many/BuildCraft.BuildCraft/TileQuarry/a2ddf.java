diff --git a/common/buildcraft/builders/tile/TileQuarry.java b/common/buildcraft/builders/tile/TileQuarry.java
index 174a558..f8e72af 100644
--- a/common/buildcraft/builders/tile/TileQuarry.java
+++ b/common/buildcraft/builders/tile/TileQuarry.java
@@ -117,7 +117,7 @@
                 if (frameBox.contains(pos)) {
                     check(pos);
                 } else if (miningBox.contains(pos)) {
-                    if (!world.isAirBlock(pos) && boxIterator != null) {
+                    if (!world.isAirBlock(pos) && !canSkip(pos) && boxIterator != null) {
                         BoxIterator tempBoxIterator = createBoxIterator();
                         while (!Objects.equals(tempBoxIterator.getCurrent(), pos)) {
                             if (tempBoxIterator.advance() == null) {
