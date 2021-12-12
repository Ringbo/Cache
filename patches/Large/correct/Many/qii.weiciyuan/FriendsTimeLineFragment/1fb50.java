diff --git a/src/org/qii/weiciyuan/ui/maintimeline/FriendsTimeLineFragment.java b/src/org/qii/weiciyuan/ui/maintimeline/FriendsTimeLineFragment.java
index d9df09c..2840bb4 100644
--- a/src/org/qii/weiciyuan/ui/maintimeline/FriendsTimeLineFragment.java
+++ b/src/org/qii/weiciyuan/ui/maintimeline/FriendsTimeLineFragment.java
@@ -431,7 +431,7 @@
         @Override
         protected void onPreExecute() {
             super.onPreExecute();
-            if (isListViewFling())
+            if (isListViewFling() || !isVisible())
                 cancel(true);
         }
 
