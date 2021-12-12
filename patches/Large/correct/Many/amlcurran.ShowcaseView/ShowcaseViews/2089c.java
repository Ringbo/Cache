diff --git a/library/src/com/github/espiandev/showcaseview/ShowcaseViews.java b/library/src/com/github/espiandev/showcaseview/ShowcaseViews.java
index d5c3f52..db05606 100644
--- a/library/src/com/github/espiandev/showcaseview/ShowcaseViews.java
+++ b/library/src/com/github/espiandev/showcaseview/ShowcaseViews.java
@@ -23,7 +23,7 @@
     }
 
     public void addView(ItemViewProperties properties) {
-        ShowcaseView showcaseView = new ShowcaseViewBuilder(activity).setShowcaseItem(properties.itemType, properties.id, activity)
+        ShowcaseView showcaseView = new ShowcaseViewBuilder(activity, showcaseTemplateId).setShowcaseItem(properties.itemType, properties.id, activity)
                 .setText(properties.titleResId, properties.messageResId)
                 .setShowcaseIndicatorScale(properties.scale)
                 .build();
