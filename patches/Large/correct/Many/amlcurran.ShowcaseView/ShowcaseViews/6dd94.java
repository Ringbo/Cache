diff --git a/library/src/com/github/espiandev/showcaseview/ShowcaseViews.java b/library/src/com/github/espiandev/showcaseview/ShowcaseViews.java
index e684835..f1e9519 100644
--- a/library/src/com/github/espiandev/showcaseview/ShowcaseViews.java
+++ b/library/src/com/github/espiandev/showcaseview/ShowcaseViews.java
@@ -50,7 +50,7 @@
     }
 
     private boolean showcaseActionBar(ItemViewProperties properties) {
-        return properties.itemType >= ItemViewProperties.ID_NOT_IN_ACTIONBAR;
+        return properties.itemType > ItemViewProperties.ID_NOT_IN_ACTIONBAR;
     }
 
     private View.OnClickListener createShowcaseViewDismissListener(final ShowcaseView showcaseView) {
