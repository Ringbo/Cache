diff --git a/library/src/com/github/espiandev/showcaseview/ShowcaseView.java b/library/src/com/github/espiandev/showcaseview/ShowcaseView.java
index 01e5776..1865b51 100644
--- a/library/src/com/github/espiandev/showcaseview/ShowcaseView.java
+++ b/library/src/com/github/espiandev/showcaseview/ShowcaseView.java
@@ -109,7 +109,7 @@
 		}
 		showcase = getContext().getResources().getDrawable(R.drawable.cling);
 		mButton = findViewById(R.id.showcase_button);
-		if (mButton != null) {
+		if (mButton != null && !hasCustomClickListener) {
 			mButton.setOnClickListener(this);
 		}
 		showcaseRadius = metricScale * 94;
