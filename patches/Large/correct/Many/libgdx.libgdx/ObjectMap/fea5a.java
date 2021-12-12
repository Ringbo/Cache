diff --git a/gdx/src/com/badlogic/gdx/utils/ObjectMap.java b/gdx/src/com/badlogic/gdx/utils/ObjectMap.java
index 09757d1..d03ff84 100644
--- a/gdx/src/com/badlogic/gdx/utils/ObjectMap.java
+++ b/gdx/src/com/badlogic/gdx/utils/ObjectMap.java
@@ -64,7 +64,7 @@
 	 * before growing the backing table. */
 	public ObjectMap (int initialCapacity, float loadFactor) {
 		if (initialCapacity < 0) throw new IllegalArgumentException("initialCapacity must be >= 0: " + initialCapacity);
-		if (capacity > 1 << 30) throw new IllegalArgumentException("initialCapacity is too large: " + initialCapacity);
+		if (initialCapacity > 1 << 30) throw new IllegalArgumentException("initialCapacity is too large: " + initialCapacity);
 		capacity = MathUtils.nextPowerOfTwo(initialCapacity);
 
 		if (loadFactor <= 0) throw new IllegalArgumentException("loadFactor must be > 0: " + loadFactor);
