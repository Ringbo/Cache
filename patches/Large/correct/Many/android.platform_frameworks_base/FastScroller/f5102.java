diff --git a/core/java/android/widget/FastScroller.java b/core/java/android/widget/FastScroller.java
index 2d42fa1..92160ee 100644
--- a/core/java/android/widget/FastScroller.java
+++ b/core/java/android/widget/FastScroller.java
@@ -174,7 +174,7 @@
     /** Whether the preview image is visible. */
     private boolean mShowingPreview;
 
-    private BaseAdapter mListAdapter;
+    private Adapter mListAdapter;
     private SectionIndexer mSectionIndexer;
 
     /** Whether decorations should be laid out from right to left. */
@@ -892,15 +892,15 @@
                     .getAdapter();
             if (expAdapter instanceof SectionIndexer) {
                 mSectionIndexer = (SectionIndexer) expAdapter;
-                mListAdapter = (BaseAdapter) adapter;
+                mListAdapter = adapter;
                 mSections = mSectionIndexer.getSections();
             }
         } else if (adapter instanceof SectionIndexer) {
-            mListAdapter = (BaseAdapter) adapter;
+            mListAdapter = adapter;
             mSectionIndexer = (SectionIndexer) adapter;
             mSections = mSectionIndexer.getSections();
         } else {
-            mListAdapter = (BaseAdapter) adapter;
+            mListAdapter = adapter;
             mSections = null;
         }
     }
