diff --git a/core/java/android/transition/Scene.java b/core/java/android/transition/Scene.java
index 5800bd5..e1f1896 100644
--- a/core/java/android/transition/Scene.java
+++ b/core/java/android/transition/Scene.java
@@ -57,7 +57,7 @@
                 com.android.internal.R.id.scene_layoutid_cache);
         if (scenes == null) {
             scenes = new SparseArray<Scene>();
-            sceneRoot.setTag(com.android.internal.R.id.scene_layoutid_cache, scenes);
+            sceneRoot.setTagInternal(com.android.internal.R.id.scene_layoutid_cache, scenes);
         }
         Scene scene = scenes.get(layoutId);
         if (scene != null) {
