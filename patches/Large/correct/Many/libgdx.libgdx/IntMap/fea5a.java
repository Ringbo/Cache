diff --git a/gdx/src/com/badlogic/gdx/utils/IntMap.java b/gdx/src/com/badlogic/gdx/utils/IntMap.java
index 1208b96..0397ea8 100644
--- a/gdx/src/com/badlogic/gdx/utils/IntMap.java
+++ b/gdx/src/com/badlogic/gdx/utils/IntMap.java
@@ -67,7 +67,7 @@
 	 * before growing the backing table. */
 	public IntMap (int initialCapacity, float loadFactor) {
 		if (initialCapacity < 0) throw new IllegalArgumentException("initialCapacity must be >= 0: " + initialCapacity);
-		if (capacity > 1 << 30) throw new IllegalArgumentException("initialCapacity is too large: " + initialCapacity);
+		if (initialCapacity > 1 << 30) throw new IllegalArgumentException("initialCapacity is too large: " + initialCapacity);
 		capacity = MathUtils.nextPowerOfTwo(initialCapacity);
 
 		if (loadFactor <= 0) throw new IllegalArgumentException("loadFactor must be > 0: " + loadFactor);
