diff --git a/gdx/src/com/badlogic/gdx/utils/ByteArray.java b/gdx/src/com/badlogic/gdx/utils/ByteArray.java
index a65bf86..9f5848e 100644
--- a/gdx/src/com/badlogic/gdx/utils/ByteArray.java
+++ b/gdx/src/com/badlogic/gdx/utils/ByteArray.java
@@ -97,7 +97,7 @@
 
 	public void add (byte value1, byte value2, byte value3, byte value4) {
 		byte[] items = this.items;
-		if (size + 3 >= items.length) items = resize(Math.max(8, (int)(size * 1.75f)));
+		if (size + 3 >= items.length) items = resize(Math.max(8, (int)(size * 1.8f))); // 1.75 isn't enough when size=5.
 		items[size] = value1;
 		items[size + 1] = value2;
 		items[size + 2] = value3;
