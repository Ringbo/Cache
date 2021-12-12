diff --git a/app/src/main/java/app/philm/in/AndroidDisplay.java b/app/src/main/java/app/philm/in/AndroidDisplay.java
index 9f1a1d5..b4c200b 100644
--- a/app/src/main/java/app/philm/in/AndroidDisplay.java
+++ b/app/src/main/java/app/philm/in/AndroidDisplay.java
@@ -112,7 +112,7 @@
 
     @Override
     public boolean hasMainFragment() {
-        return mActivity.getFragmentManager().findFragmentById(R.id.fragment_main) != null;
+        return mActivity.getSupportFragmentManager().findFragmentById(R.id.fragment_main) != null;
     }
 
     @Override
