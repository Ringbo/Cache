diff --git a/src/it/feio/android/omninotes/ListActivity.java b/src/it/feio/android/omninotes/ListActivity.java
index f50b27b..41b5626 100644
--- a/src/it/feio/android/omninotes/ListActivity.java
+++ b/src/it/feio/android/omninotes/ListActivity.java
@@ -265,7 +265,7 @@
 			while (it.hasNext()) {
 				Map.Entry mapEntry = (Map.Entry) it.next();
 				int i = (Integer) mapEntry.getKey();
-				if (mAdapter.getItem(i) != null) {
+				if (mAdapter.getCount() > i && mAdapter.getItem(i) != null) {
 					mAdapter.restoreDrawable(mAdapter.getItem(i), listView.getChildAt(i).findViewById(R.id.card_layout));
 				}
 			}
