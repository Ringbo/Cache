diff --git a/gdx/src/com/badlogic/gdx/utils/ObjectFloatMap.java b/gdx/src/com/badlogic/gdx/utils/ObjectFloatMap.java
index 521dc0c..c880f35 100644
--- a/gdx/src/com/badlogic/gdx/utils/ObjectFloatMap.java
+++ b/gdx/src/com/badlogic/gdx/utils/ObjectFloatMap.java
@@ -64,7 +64,7 @@
 	 * before growing the backing table. */
 	public ObjectFloatMap (int initialCapacity, float loadFactor) {
 		if (initialCapacity < 0) throw new IllegalArgumentException("initialCapacity must be >= 0: " + initialCapacity);
-		if (capacity > 1 << 30) throw new IllegalArgumentException("initialCapacity is too large: " + initialCapacity);
+		if (initialCapacity > 1 << 30) throw new IllegalArgumentException("initialCapacity is too large: " + initialCapacity);
 		capacity = MathUtils.nextPowerOfTwo(initialCapacity);
 
 		if (loadFactor <= 0) throw new IllegalArgumentException("loadFactor must be > 0: " + loadFactor);
