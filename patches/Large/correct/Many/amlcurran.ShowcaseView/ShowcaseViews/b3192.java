diff --git a/library/src/com/github/espiandev/showcaseview/ShowcaseViews.java b/library/src/com/github/espiandev/showcaseview/ShowcaseViews.java
index 830b8ac..fae62ef 100644
--- a/library/src/com/github/espiandev/showcaseview/ShowcaseViews.java
+++ b/library/src/com/github/espiandev/showcaseview/ShowcaseViews.java
@@ -34,7 +34,7 @@
     }
 
     public void addView(ItemViewProperties properties) {
-        ShowcaseViewBuilder builder = new ShowcaseViewBuilder(activity, showcaseTemplateId)
+        ShowcaseViewBuilder builder = new ShowcaseViewBuilder(activity)
                 .setText(properties.titleResId, properties.messageResId)
                 .setShowcaseIndicatorScale(properties.scale);
 
