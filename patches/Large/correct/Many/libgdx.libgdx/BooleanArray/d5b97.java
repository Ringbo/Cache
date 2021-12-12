diff --git a/gdx/src/com/badlogic/gdx/utils/BooleanArray.java b/gdx/src/com/badlogic/gdx/utils/BooleanArray.java
index b493cf3..771ddbe 100644
--- a/gdx/src/com/badlogic/gdx/utils/BooleanArray.java
+++ b/gdx/src/com/badlogic/gdx/utils/BooleanArray.java
@@ -97,7 +97,7 @@
 	public void addAll (boolean[] array, int offset, int length) {
 		boolean[] items = this.items;
 		int sizeNeeded = size + length;
-		if (sizeNeeded >= items.length) items = resize(Math.max(8, (int)(sizeNeeded * 1.75f)));
+		if (sizeNeeded > items.length) items = resize(Math.max(8, (int)(sizeNeeded * 1.75f)));
 		System.arraycopy(array, offset, items, size, length);
 		size += length;
 	}
@@ -197,7 +197,7 @@
 	 * @return {@link #items} */
 	public boolean[] ensureCapacity (int additionalCapacity) {
 		int sizeNeeded = size + additionalCapacity;
-		if (sizeNeeded >= items.length) resize(Math.max(8, sizeNeeded));
+		if (sizeNeeded > items.length) resize(Math.max(8, sizeNeeded));
 		return items;
 	}
 
