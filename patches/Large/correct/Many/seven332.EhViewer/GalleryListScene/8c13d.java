diff --git a/app/src/main/java/com/hippo/ehviewer/ui/scene/GalleryListScene.java b/app/src/main/java/com/hippo/ehviewer/ui/scene/GalleryListScene.java
index e1e4eeb..445bcac 100644
--- a/app/src/main/java/com/hippo/ehviewer/ui/scene/GalleryListScene.java
+++ b/app/src/main/java/com/hippo/ehviewer/ui/scene/GalleryListScene.java
@@ -211,7 +211,7 @@
             default:
             case MODE_HOMEPAGE:
                 mActivity.setDrawerListActivatedPosition(ContentActivity.DRAWER_LIST_HOMEPAGE);
-                mListUrlBuilder.setMode(ListUrlBuilder.MODE_NORMAL);
+                mListUrlBuilder.reset();
                 break;
             case MODE_POPULAR:
                 mActivity.setDrawerListActivatedPosition(ContentActivity.DRAWER_LIST_WHATS_HOT);
