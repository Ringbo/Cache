diff --git a/gdx/src/com/badlogic/gdx/utils/Array.java b/gdx/src/com/badlogic/gdx/utils/Array.java
index 860bbc3..f064ef8 100644
--- a/gdx/src/com/badlogic/gdx/utils/Array.java
+++ b/gdx/src/com/badlogic/gdx/utils/Array.java
@@ -120,7 +120,7 @@
 
 	public void add (T value1, T value2, T value3, T value4) {
 		T[] items = this.items;
-		if (size + 3 >= items.length) items = resize(Math.max(8, (int)(size * 1.75f)));
+		if (size + 3 >= items.length) items = resize(Math.max(8, (int)(size * 1.8f))); // 1.75 isn't enough when size=5.
 		items[size] = value1;
 		items[size + 1] = value2;
 		items[size + 2] = value3;
