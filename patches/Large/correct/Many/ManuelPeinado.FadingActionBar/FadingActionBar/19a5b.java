diff --git a/library/src/com/manuelpeinado/fadingactionbar/FadingActionBar.java b/library/src/com/manuelpeinado/fadingactionbar/FadingActionBar.java
index 99a8738..bd28f5e 100644
--- a/library/src/com/manuelpeinado/fadingactionbar/FadingActionBar.java
+++ b/library/src/com/manuelpeinado/fadingactionbar/FadingActionBar.java
@@ -89,7 +89,7 @@
             //
             // See if we are in a ListView or ScrollView scenario
 
-            ListView listView = (ListView) activity.findViewById(android.R.id.list);
+            ListView listView = (ListView) mContentView.findViewById(android.R.id.list);
             if (listView != null) {
                 applyListView(activity, listView);
             } else {
