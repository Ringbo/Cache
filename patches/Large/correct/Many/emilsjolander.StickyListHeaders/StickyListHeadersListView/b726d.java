diff --git a/library/src/com/emilsjolander/components/stickylistheaders/StickyListHeadersListView.java b/library/src/com/emilsjolander/components/stickylistheaders/StickyListHeadersListView.java
index f7f9304..8ff0adc 100644
--- a/library/src/com/emilsjolander/components/stickylistheaders/StickyListHeadersListView.java
+++ b/library/src/com/emilsjolander/components/stickylistheaders/StickyListHeadersListView.java
@@ -136,7 +136,7 @@
 				}
 				mList.setCacheColorHint(a.getColor(R.styleable.StickyListHeadersListView_android_cacheColorHint,
 						mList.getCacheColorHint()));
-                if (Build.VERSION.SDK_INT > Build.VERSION_CODES.HONEYCOMB) {
+                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
                     mList.setChoiceMode(a.getInt(R.styleable.StickyListHeadersListView_android_choiceMode,
                             mList.getChoiceMode()));
                 }
