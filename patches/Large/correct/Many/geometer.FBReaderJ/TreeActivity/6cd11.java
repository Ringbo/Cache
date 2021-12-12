diff --git a/src/org/geometerplus/android/fbreader/tree/TreeActivity.java b/src/org/geometerplus/android/fbreader/tree/TreeActivity.java
index 78137ad..0101407 100644
--- a/src/org/geometerplus/android/fbreader/tree/TreeActivity.java
+++ b/src/org/geometerplus/android/fbreader/tree/TreeActivity.java
@@ -108,7 +108,7 @@
 					parent = getTreeByKey(myHistory.remove(myHistory.size() - 1));
 				}
 			}
-			if (parent == null) {
+			if (parent == null && myCurrentTree != null) {
 				parent = myCurrentTree.Parent;
 			}
 			if (parent != null && !isTreeInvisible(parent)) {
