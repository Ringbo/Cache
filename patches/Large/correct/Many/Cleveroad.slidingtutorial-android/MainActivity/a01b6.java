diff --git a/sample/src/main/java/com/cleveroad/slidingtutorial/sample/MainActivity.java b/sample/src/main/java/com/cleveroad/slidingtutorial/sample/MainActivity.java
index 77ad292..bf44904 100644
--- a/sample/src/main/java/com/cleveroad/slidingtutorial/sample/MainActivity.java
+++ b/sample/src/main/java/com/cleveroad/slidingtutorial/sample/MainActivity.java
@@ -86,7 +86,7 @@
                 case 0: {
                     pageLayoutResId = R.layout.fragment_page_first;
                     tutorialItems = new TransformItem[]{
-                            TransformItem.create(R.id.ivFirstImage, Direction.LEFT_TO_RIGHT, 0.50f),
+                            TransformItem.create(R.id.ivFirstImage, Direction.LEFT_TO_RIGHT, 0.20f),
                             TransformItem.create(R.id.ivSecondImage, Direction.RIGHT_TO_LEFT, 0.06f),
                             TransformItem.create(R.id.ivThirdImage, Direction.LEFT_TO_RIGHT, 0.08f),
                             TransformItem.create(R.id.ivFourthImage, Direction.RIGHT_TO_LEFT, 0.1f),
@@ -100,7 +100,7 @@
                 case 1: {
                     pageLayoutResId = R.layout.fragment_page_third;
                     tutorialItems = new TransformItem[]{
-                            TransformItem.create(R.id.ivFirstImage, Direction.RIGHT_TO_LEFT, 0.50f),
+                            TransformItem.create(R.id.ivFirstImage, Direction.RIGHT_TO_LEFT, 0.20f),
                             TransformItem.create(R.id.ivSecondImage, Direction.LEFT_TO_RIGHT, 0.06f),
                             TransformItem.create(R.id.ivThirdImage, Direction.RIGHT_TO_LEFT, 0.08f),
                             TransformItem.create(R.id.ivFourthImage, Direction.LEFT_TO_RIGHT, 0.1f),
@@ -113,7 +113,7 @@
                 case 2: {
                     pageLayoutResId = R.layout.fragment_page_second;
                     tutorialItems = new TransformItem[]{
-                            TransformItem.create(R.id.ivFirstImage, Direction.RIGHT_TO_LEFT, 0.7f),
+                            TransformItem.create(R.id.ivFirstImage, Direction.RIGHT_TO_LEFT, 0.2f),
                             TransformItem.create(R.id.ivSecondImage, Direction.LEFT_TO_RIGHT, 0.06f),
                             TransformItem.create(R.id.ivThirdImage, Direction.RIGHT_TO_LEFT, 0.08f),
                             TransformItem.create(R.id.ivFourthImage, Direction.LEFT_TO_RIGHT, 0.1f),
