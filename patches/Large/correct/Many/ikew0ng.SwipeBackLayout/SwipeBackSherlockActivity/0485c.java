diff --git a/sample_sherlock/src/main/java/me/imid/swipebacklayout/demo/sherlock/SwipeBackSherlockActivity.java b/sample_sherlock/src/main/java/me/imid/swipebacklayout/demo/sherlock/SwipeBackSherlockActivity.java
index d52cfac..d035f86 100644
--- a/sample_sherlock/src/main/java/me/imid/swipebacklayout/demo/sherlock/SwipeBackSherlockActivity.java
+++ b/sample_sherlock/src/main/java/me/imid/swipebacklayout/demo/sherlock/SwipeBackSherlockActivity.java
@@ -18,7 +18,7 @@
     protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
         mHelper = new SwipeBackActivityHelper(this);
-        mHelper.onActivtyCreate();
+        mHelper.onActivityCreate();
     }
 
     @Override
