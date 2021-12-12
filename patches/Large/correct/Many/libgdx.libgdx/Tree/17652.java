diff --git a/gdx/src/com/badlogic/gdx/scenes/scene2d/ui/Tree.java b/gdx/src/com/badlogic/gdx/scenes/scene2d/ui/Tree.java
index 2451bff..41dfaa1 100644
--- a/gdx/src/com/badlogic/gdx/scenes/scene2d/ui/Tree.java
+++ b/gdx/src/com/badlogic/gdx/scenes/scene2d/ui/Tree.java
@@ -305,7 +305,7 @@
 			Node node = nodes.get(i);
 			if (node.actor.getY() < low) break;
 			if (!node.isSelectable()) continue;
-			if (node.actor.getY() <= high) selectedNodes.add(node);
+			if (node.actor.getY() <= high && !selectedNodes.contains(node, true)) selectedNodes.add(node);
 			if (node.expanded) selectNodes(node.children, low, high);
 		}
 	}
