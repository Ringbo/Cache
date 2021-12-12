diff --git a/gdx/src/com/badlogic/gdx/utils/ShortArray.java b/gdx/src/com/badlogic/gdx/utils/ShortArray.java
index 7af6756..b152ad3 100644
--- a/gdx/src/com/badlogic/gdx/utils/ShortArray.java
+++ b/gdx/src/com/badlogic/gdx/utils/ShortArray.java
@@ -104,7 +104,7 @@
 
 	public void add (short value1, short value2, short value3, short value4) {
 		short[] items = this.items;
-		if (size + 3 >= items.length) items = resize(Math.max(8, (int)(size * 1.75f)));
+		if (size + 3 >= items.length) items = resize(Math.max(8, (int)(size * 1.8f))); // 1.75 isn't enough when size=5.
 		items[size] = value1;
 		items[size + 1] = value2;
 		items[size + 2] = value3;
