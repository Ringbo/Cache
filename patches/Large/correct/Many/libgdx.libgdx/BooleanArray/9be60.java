diff --git a/gdx/src/com/badlogic/gdx/utils/BooleanArray.java b/gdx/src/com/badlogic/gdx/utils/BooleanArray.java
index 06fdadf..6e6837d 100644
--- a/gdx/src/com/badlogic/gdx/utils/BooleanArray.java
+++ b/gdx/src/com/badlogic/gdx/utils/BooleanArray.java
@@ -99,7 +99,7 @@
 
 	public void add (boolean value1, boolean value2, boolean value3, boolean value4) {
 		boolean[] items = this.items;
-		if (size + 3 >= items.length) items = resize(Math.max(8, (int)(size * 1.75f)));
+		if (size + 3 >= items.length) items = resize(Math.max(8, (int)(size * 1.8f))); // 1.75 isn't enough when size=5.
 		items[size] = value1;
 		items[size + 1] = value2;
 		items[size + 2] = value3;
