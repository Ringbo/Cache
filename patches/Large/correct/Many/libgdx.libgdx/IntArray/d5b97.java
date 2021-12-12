diff --git a/gdx/src/com/badlogic/gdx/utils/IntArray.java b/gdx/src/com/badlogic/gdx/utils/IntArray.java
index 7bfdbb1..690603c 100644
--- a/gdx/src/com/badlogic/gdx/utils/IntArray.java
+++ b/gdx/src/com/badlogic/gdx/utils/IntArray.java
@@ -95,7 +95,7 @@
 	public void addAll (int[] array, int offset, int length) {
 		int[] items = this.items;
 		int sizeNeeded = size + length;
-		if (sizeNeeded >= items.length) items = resize(Math.max(8, (int)(sizeNeeded * 1.75f)));
+		if (sizeNeeded > items.length) items = resize(Math.max(8, (int)(sizeNeeded * 1.75f)));
 		System.arraycopy(array, offset, items, size, length);
 		size += length;
 	}
@@ -238,7 +238,7 @@
 	 * @return {@link #items} */
 	public int[] ensureCapacity (int additionalCapacity) {
 		int sizeNeeded = size + additionalCapacity;
-		if (sizeNeeded >= items.length) resize(Math.max(8, sizeNeeded));
+		if (sizeNeeded > items.length) resize(Math.max(8, sizeNeeded));
 		return items;
 	}
 
