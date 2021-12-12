diff --git a/gdx/src/com/badlogic/gdx/utils/IntArray.java b/gdx/src/com/badlogic/gdx/utils/IntArray.java
index 55e05b5..ed5cec0 100644
--- a/gdx/src/com/badlogic/gdx/utils/IntArray.java
+++ b/gdx/src/com/badlogic/gdx/utils/IntArray.java
@@ -97,7 +97,7 @@
 
 	public void add (int value1, int value2, int value3, int value4) {
 		int[] items = this.items;
-		if (size + 3 >= items.length) items = resize(Math.max(8, (int)(size * 1.75f)));
+		if (size + 3 >= items.length) items = resize(Math.max(8, (int)(size * 1.8f))); // 1.75 isn't enough when size=5.
 		items[size] = value1;
 		items[size + 1] = value2;
 		items[size + 2] = value3;
