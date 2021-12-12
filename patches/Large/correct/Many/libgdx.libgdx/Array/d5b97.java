diff --git a/gdx/src/com/badlogic/gdx/utils/Array.java b/gdx/src/com/badlogic/gdx/utils/Array.java
index e088c30..73562d8 100644
--- a/gdx/src/com/badlogic/gdx/utils/Array.java
+++ b/gdx/src/com/badlogic/gdx/utils/Array.java
@@ -311,7 +311,7 @@
 	 * @return {@link #items} */
 	public T[] ensureCapacity (int additionalCapacity) {
 		int sizeNeeded = size + additionalCapacity;
-		if (sizeNeeded >= items.length) resize(Math.max(8, sizeNeeded));
+		if (sizeNeeded > items.length) resize(Math.max(8, sizeNeeded));
 		return items;
 	}
 
