diff --git a/viewflow/src/org/taptwo/android/widget/CircleFlowIndicator.java b/viewflow/src/org/taptwo/android/widget/CircleFlowIndicator.java
index 7152800..adf0482 100644
--- a/viewflow/src/org/taptwo/android/widget/CircleFlowIndicator.java
+++ b/viewflow/src/org/taptwo/android/widget/CircleFlowIndicator.java
@@ -226,7 +226,7 @@
 	public void setViewFlow(ViewFlow view) {
 		resetTimer();
 		viewFlow = view;
-		flowWidth = viewFlow.getWidth();
+		flowWidth = viewFlow.getChildWidth();
 		invalidate();
 	}
 
@@ -241,7 +241,7 @@
 		setVisibility(View.VISIBLE);
 		resetTimer();
 		currentScroll = h;
-		flowWidth = viewFlow.getWidth();
+		flowWidth = viewFlow.getChildWidth();
 		invalidate();
 	}
 
