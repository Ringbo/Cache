diff --git a/gdx/src/com/badlogic/gdx/scenes/scene2d/ui/Container.java b/gdx/src/com/badlogic/gdx/scenes/scene2d/ui/Container.java
index 7dc5690..eb02c1b 100644
--- a/gdx/src/com/badlogic/gdx/scenes/scene2d/ui/Container.java
+++ b/gdx/src/com/badlogic/gdx/scenes/scene2d/ui/Container.java
@@ -14,7 +14,7 @@
  * {@link Table} with a single cell but is more lightweight.
  * @author Nathan Sweet */
 public class Container<T extends Actor> extends WidgetGroup {
-	private Actor actor;
+	private T actor;
 	private Value minWidth = Value.minWidth, minHeight = Value.minHeight;
 	private Value prefWidth = Value.prefWidth, prefHeight = Value.prefHeight;
 	private Value maxWidth = Value.zero, maxHeight = Value.zero;
@@ -31,7 +31,7 @@
 		setTransform(false);
 	}
 
-	public Container (Actor actor) {
+	public Container (T actor) {
 		this();
 		setActor(actor);
 	}
@@ -151,7 +151,7 @@
 	}
 
 	/** @param actor May be null. */
-	public void setActor (Actor actor) {
+	public void setActor (T actor) {
 		if (actor == this) throw new IllegalArgumentException("actor cannot be the Container.");
 		if (this.actor != null) super.removeActor(this.actor);
 		this.actor = actor;
@@ -160,7 +160,7 @@
 
 	/** @return May be null. */
 	public T getActor () {
-		return (T)actor;
+		return actor;
 	}
 
 	/** @deprecated Container may have only a single child.
