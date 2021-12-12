diff --git a/gdx/src/com/badlogic/gdx/utils/LongArray.java b/gdx/src/com/badlogic/gdx/utils/LongArray.java
index 9ab512c..36e817f 100644
--- a/gdx/src/com/badlogic/gdx/utils/LongArray.java
+++ b/gdx/src/com/badlogic/gdx/utils/LongArray.java
@@ -97,7 +97,7 @@
 
 	public void add (long value1, long value2, long value3, long value4) {
 		long[] items = this.items;
-		if (size + 3 >= items.length) items = resize(Math.max(8, (int)(size * 1.75f)));
+		if (size + 3 >= items.length) items = resize(Math.max(8, (int)(size * 1.8f))); // 1.75 isn't enough when size=5.
 		items[size] = value1;
 		items[size + 1] = value2;
 		items[size + 2] = value3;
