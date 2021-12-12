diff --git a/gdx/src/com/badlogic/gdx/utils/ShortArray.java b/gdx/src/com/badlogic/gdx/utils/ShortArray.java
index 0fb6379..940a321 100644
--- a/gdx/src/com/badlogic/gdx/utils/ShortArray.java
+++ b/gdx/src/com/badlogic/gdx/utils/ShortArray.java
@@ -102,7 +102,7 @@
 	public void addAll (short[] array, int offset, int length) {
 		short[] items = this.items;
 		int sizeNeeded = size + length;
-		if (sizeNeeded >= items.length) items = resize(Math.max(8, (int)(sizeNeeded * 1.75f)));
+		if (sizeNeeded > items.length) items = resize(Math.max(8, (int)(sizeNeeded * 1.75f)));
 		System.arraycopy(array, offset, items, size, length);
 		size += length;
 	}
@@ -245,7 +245,7 @@
 	 * @return {@link #items} */
 	public short[] ensureCapacity (int additionalCapacity) {
 		int sizeNeeded = size + additionalCapacity;
-		if (sizeNeeded >= items.length) resize(Math.max(8, sizeNeeded));
+		if (sizeNeeded > items.length) resize(Math.max(8, sizeNeeded));
 		return items;
 	}
 
