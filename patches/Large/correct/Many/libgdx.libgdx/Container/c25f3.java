diff --git a/gdx/src/com/badlogic/gdx/scenes/scene2d/ui/Container.java b/gdx/src/com/badlogic/gdx/scenes/scene2d/ui/Container.java
index 40146f3..8dd0fce 100644
--- a/gdx/src/com/badlogic/gdx/scenes/scene2d/ui/Container.java
+++ b/gdx/src/com/badlogic/gdx/scenes/scene2d/ui/Container.java
@@ -286,7 +286,7 @@
 
 	/** Sets the minWidth and minHeight to the specified values. */
 	public Container<T> minSize (float width, float height) {
-		minSize(new Fixed(width));
+		minSize(new Fixed(width), new Fixed(height));
 		return this;
 	}
 
@@ -326,7 +326,7 @@
 
 	/** Sets the prefWidth and prefHeight to the specified value. */
 	public Container<T> prefSize (float width, float height) {
-		prefSize(new Fixed(width));
+		prefSize(new Fixed(width), new Fixed(height));
 		return this;
 	}
 
@@ -378,7 +378,7 @@
 
 	/** Sets the maxWidth and maxHeight to the specified values. */
 	public Container<T> maxSize (float width, float height) {
-		maxSize(new Fixed(width));
+		maxSize(new Fixed(width), new Fixed(height));
 		return this;
 	}
 
