diff --git a/gdx/src/com/badlogic/gdx/utils/StringBuilder.java b/gdx/src/com/badlogic/gdx/utils/StringBuilder.java
index db250b1..92f8a3f 100644
--- a/gdx/src/com/badlogic/gdx/utils/StringBuilder.java
+++ b/gdx/src/com/badlogic/gdx/utils/StringBuilder.java
@@ -105,7 +105,7 @@
 		if (newSize > chars.length) {
 			enlargeBuffer(newSize);
 		}
-		System.arraycopy(value, 0, value, length, value.length);
+		System.arraycopy(value, 0, chars, length, value.length);
 		length = newSize;
 	}
 
