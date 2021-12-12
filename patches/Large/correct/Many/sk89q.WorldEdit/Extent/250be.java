diff --git a/src/main/java/com/sk89q/worldedit/Extent.java b/src/main/java/com/sk89q/worldedit/Extent.java
index 4959e9e..284a356 100644
--- a/src/main/java/com/sk89q/worldedit/Extent.java
+++ b/src/main/java/com/sk89q/worldedit/Extent.java
@@ -31,7 +31,7 @@
      * Get a copy of the block at the given location. May return null if the location
      * given is out of bounds. The returned block must not be tied to any real block
      * in the world, so changes to the returned {@link BaseBlock} have no effect until
-     * {@link #setBlock(Vector, BaseBlock)} is called.
+     * {@link #setBlock(Vector, BaseBlock, boolean)} is called.
      *
      * @param location location of the block
      * @return the block, or null if the block does not exist
@@ -72,6 +72,6 @@
      * @param notifyAdjacent true to notify adjacent blocks of changes
      * @return true if the block was successfully set (return value may not be accurate)
      */
-    boolean setBlock(Vector location, BaseBlock block, boolean notifyAdjacent);
+    boolean setBlock(Vector location, BaseBlock block, boolean notifyAdjacent) throws WorldEditException;
 
 }
