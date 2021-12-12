diff --git a/gdx/src/com/badlogic/gdx/utils/IntIntMap.java b/gdx/src/com/badlogic/gdx/utils/IntIntMap.java
index 6bd8d89..e5365a6 100644
--- a/gdx/src/com/badlogic/gdx/utils/IntIntMap.java
+++ b/gdx/src/com/badlogic/gdx/utils/IntIntMap.java
@@ -69,7 +69,7 @@
 	 * before growing the backing table. */
 	public IntIntMap (int initialCapacity, float loadFactor) {
 		if (initialCapacity < 0) throw new IllegalArgumentException("initialCapacity must be >= 0: " + initialCapacity);
-		if (capacity > 1 << 30) throw new IllegalArgumentException("initialCapacity is too large: " + initialCapacity);
+		if (initialCapacity > 1 << 30) throw new IllegalArgumentException("initialCapacity is too large: " + initialCapacity);
 		capacity = MathUtils.nextPowerOfTwo(initialCapacity);
 
 		if (loadFactor <= 0) throw new IllegalArgumentException("loadFactor must be > 0: " + loadFactor);
