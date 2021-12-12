diff --git a/gdx/src/com/badlogic/gdx/utils/ObjectIntMap.java b/gdx/src/com/badlogic/gdx/utils/ObjectIntMap.java
index 0fe6084..9e822aa 100644
--- a/gdx/src/com/badlogic/gdx/utils/ObjectIntMap.java
+++ b/gdx/src/com/badlogic/gdx/utils/ObjectIntMap.java
@@ -64,7 +64,7 @@
 	 * before growing the backing table. */
 	public ObjectIntMap (int initialCapacity, float loadFactor) {
 		if (initialCapacity < 0) throw new IllegalArgumentException("initialCapacity must be >= 0: " + initialCapacity);
-		if (capacity > 1 << 30) throw new IllegalArgumentException("initialCapacity is too large: " + initialCapacity);
+		if (initialCapacity > 1 << 30) throw new IllegalArgumentException("initialCapacity is too large: " + initialCapacity);
 		capacity = MathUtils.nextPowerOfTwo(initialCapacity);
 
 		if (loadFactor <= 0) throw new IllegalArgumentException("loadFactor must be > 0: " + loadFactor);
