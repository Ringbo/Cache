diff --git a/gdx/src/com/badlogic/gdx/graphics/g3d/model/Node.java b/gdx/src/com/badlogic/gdx/graphics/g3d/model/Node.java
index 410f489..3208eef 100644
--- a/gdx/src/com/badlogic/gdx/graphics/g3d/model/Node.java
+++ b/gdx/src/com/badlogic/gdx/graphics/g3d/model/Node.java
@@ -199,7 +199,7 @@
 	 * @param child The Node to add as child of this Node
 	 * @return the zero-based index of the child */
 	public <T extends Node> int insertChild (int index, final T child) {
-		for (Node p = this; p != null; p = child.getParent()) {
+		for (Node p = this; p != null; p = p.getParent()) {
 			if (p == child) throw new GdxRuntimeException("Cannot add a parent as a child");
 		}
 		Node p = child.getParent();
