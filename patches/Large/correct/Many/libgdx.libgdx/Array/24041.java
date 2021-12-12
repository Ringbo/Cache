diff --git a/gdx/src/com/badlogic/gdx/utils/Array.java b/gdx/src/com/badlogic/gdx/utils/Array.java
index 35d4178..d2df0b8 100644
--- a/gdx/src/com/badlogic/gdx/utils/Array.java
+++ b/gdx/src/com/badlogic/gdx/utils/Array.java
@@ -64,7 +64,7 @@
 
 	/** Creates an ordered array with {@link #items} of the specified type and a capacity of 16. */
 	public Array (Class<T> arrayType) {
-		this(false, 16, arrayType);
+		this(true, 16, arrayType);
 	}
 
 	/** Creates a new array containing the elements in the specified array. The new array will have the same type of backing array
