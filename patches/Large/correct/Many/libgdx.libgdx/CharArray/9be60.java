diff --git a/gdx/src/com/badlogic/gdx/utils/CharArray.java b/gdx/src/com/badlogic/gdx/utils/CharArray.java
index 1571e19..6c6c793 100644
--- a/gdx/src/com/badlogic/gdx/utils/CharArray.java
+++ b/gdx/src/com/badlogic/gdx/utils/CharArray.java
@@ -97,7 +97,7 @@
 
 	public void add (char value1, char value2, char value3, char value4) {
 		char[] items = this.items;
-		if (size + 3 >= items.length) items = resize(Math.max(8, (int)(size * 1.75f)));
+		if (size + 3 >= items.length) items = resize(Math.max(8, (int)(size * 1.8f))); // 1.75 isn't enough when size=5.
 		items[size] = value1;
 		items[size + 1] = value2;
 		items[size + 2] = value3;
