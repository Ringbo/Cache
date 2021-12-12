diff --git a/src/org/geometerplus/fbreader/network/NetworkLibrary.java b/src/org/geometerplus/fbreader/network/NetworkLibrary.java
index 79efce4..121a9c0 100644
--- a/src/org/geometerplus/fbreader/network/NetworkLibrary.java
+++ b/src/org/geometerplus/fbreader/network/NetworkLibrary.java
@@ -204,7 +204,7 @@
 				toRemove.add(srTree);
 			}
 		} else {
-			if (srTree.Result != mySearchResult) {
+			if (srTree != null && srTree.Result != mySearchResult) {
 				toRemove.add(srTree);
 				srTree = null;
 			}
