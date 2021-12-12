diff --git a/viewflow/src/org/taptwo/android/widget/ViewFlow.java b/viewflow/src/org/taptwo/android/widget/ViewFlow.java
index 0a8565e..5b0fa06 100644
--- a/viewflow/src/org/taptwo/android/widget/ViewFlow.java
+++ b/viewflow/src/org/taptwo/android/widget/ViewFlow.java
@@ -474,7 +474,7 @@
 			mAdapter.registerDataSetObserver(mDataSetObserver);
 
 		}
-		if (mAdapter.getCount() == 0)
+		if (mAdapter == null || mAdapter.getCount() == 0)
 			return;
 
 		for (int i = 0; i < Math.min(mAdapter.getCount(), mSideBuffer + 1); i++) {
