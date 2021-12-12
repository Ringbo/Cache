diff --git a/src/org/geometerplus/android/fbreader/network/CatalogManagerActivity.java b/src/org/geometerplus/android/fbreader/network/CatalogManagerActivity.java
index efa4d67..d71e41c 100644
--- a/src/org/geometerplus/android/fbreader/network/CatalogManagerActivity.java
+++ b/src/org/geometerplus/android/fbreader/network/CatalogManagerActivity.java
@@ -52,7 +52,7 @@
 			final TreeSet<CatalogItem> cItems = new TreeSet<CatalogItem>();
 			for (String id : enabledIds) {
 				final NetworkTree tree = NetworkLibrary.Instance().getCatalogTreeByUrlAll(id);
-				if (tree != null) {
+				if (tree != null && tree.getLink() != null) {
 					cItems.add(new CatalogItem(id, true, tree));
 				}
 			}
