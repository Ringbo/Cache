diff --git a/src/org/geometerplus/android/fbreader/LibraryTabActivity.java b/src/org/geometerplus/android/fbreader/LibraryTabActivity.java
index 0bc323d..16ca1e4 100644
--- a/src/org/geometerplus/android/fbreader/LibraryTabActivity.java
+++ b/src/org/geometerplus/android/fbreader/LibraryTabActivity.java
@@ -234,7 +234,7 @@
 					iconView.setVisibility(View.GONE);
 					break;
 				case Type.TREE:
-					setIcon(view, iconView, tree);
+					setIcon(iconView, tree);
 					break;
 			}
 			((TextView)view.findViewById(R.id.library_tree_item_name)).setText(tree.getName());
