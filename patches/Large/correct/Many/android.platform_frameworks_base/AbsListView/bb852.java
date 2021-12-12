diff --git a/core/java/android/widget/AbsListView.java b/core/java/android/widget/AbsListView.java
index 0439168..4aebaae 100644
--- a/core/java/android/widget/AbsListView.java
+++ b/core/java/android/widget/AbsListView.java
@@ -4653,7 +4653,7 @@
         if (mPositionScroller == null) {
             mPositionScroller = createPositionScroller();
         }
-        mPositionScroller.startWithOffset(position, offset, offset);
+        mPositionScroller.startWithOffset(position, offset);
     }
 
     /**
