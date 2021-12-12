diff --git a/gdx/src/com/badlogic/gdx/utils/ObjectSet.java b/gdx/src/com/badlogic/gdx/utils/ObjectSet.java
index 126fda7..565058a 100644
--- a/gdx/src/com/badlogic/gdx/utils/ObjectSet.java
+++ b/gdx/src/com/badlogic/gdx/utils/ObjectSet.java
@@ -61,7 +61,7 @@
 	 * before growing the backing table. */
 	public ObjectSet (int initialCapacity, float loadFactor) {
 		if (initialCapacity < 0) throw new IllegalArgumentException("initialCapacity must be >= 0: " + initialCapacity);
-		if (capacity > 1 << 30) throw new IllegalArgumentException("initialCapacity is too large: " + initialCapacity);
+		if (initialCapacity > 1 << 30) throw new IllegalArgumentException("initialCapacity is too large: " + initialCapacity);
 		capacity = MathUtils.nextPowerOfTwo(initialCapacity);
 
 		if (loadFactor <= 0) throw new IllegalArgumentException("loadFactor must be > 0: " + loadFactor);
