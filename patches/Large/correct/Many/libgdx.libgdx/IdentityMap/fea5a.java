diff --git a/gdx/src/com/badlogic/gdx/utils/IdentityMap.java b/gdx/src/com/badlogic/gdx/utils/IdentityMap.java
index a52ce7f..7d79b85 100644
--- a/gdx/src/com/badlogic/gdx/utils/IdentityMap.java
+++ b/gdx/src/com/badlogic/gdx/utils/IdentityMap.java
@@ -67,7 +67,7 @@
 	 * before growing the backing table. */
 	public IdentityMap (int initialCapacity, float loadFactor) {
 		if (initialCapacity < 0) throw new IllegalArgumentException("initialCapacity must be >= 0: " + initialCapacity);
-		if (capacity > 1 << 30) throw new IllegalArgumentException("initialCapacity is too large: " + initialCapacity);
+		if (initialCapacity > 1 << 30) throw new IllegalArgumentException("initialCapacity is too large: " + initialCapacity);
 		capacity = MathUtils.nextPowerOfTwo(initialCapacity);
 
 		if (loadFactor <= 0) throw new IllegalArgumentException("loadFactor must be > 0: " + loadFactor);
