diff --git a/app/src/main/java/com/hippo/ehviewer/ui/scene/GalleryListScene.java b/app/src/main/java/com/hippo/ehviewer/ui/scene/GalleryListScene.java
index 41e188a..8de70e2 100644
--- a/app/src/main/java/com/hippo/ehviewer/ui/scene/GalleryListScene.java
+++ b/app/src/main/java/com/hippo/ehviewer/ui/scene/GalleryListScene.java
@@ -920,7 +920,7 @@
             fab.setScaleY(0.0f);
             mSearchFab.setVisibility(View.VISIBLE);
             mSearchFab.setScaleX(1.0f);
-            mSearchFab.setScaleX(1.0f);
+            mSearchFab.setScaleY(1.0f);
         }
     }
 
@@ -955,7 +955,7 @@
             fab.setScaleY(1.0f);
             mSearchFab.setVisibility(View.INVISIBLE);
             mSearchFab.setScaleX(0.0f);
-            mSearchFab.setScaleX(0.0f);
+            mSearchFab.setScaleY(0.0f);
         }
     }
 
