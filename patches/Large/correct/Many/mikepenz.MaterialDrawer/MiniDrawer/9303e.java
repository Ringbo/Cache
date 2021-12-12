diff --git a/library/src/main/java/com/mikepenz/materialdrawer/MiniDrawer.java b/library/src/main/java/com/mikepenz/materialdrawer/MiniDrawer.java
index 11913fd..534d256 100644
--- a/library/src/main/java/com/mikepenz/materialdrawer/MiniDrawer.java
+++ b/library/src/main/java/com/mikepenz/materialdrawer/MiniDrawer.java
@@ -402,7 +402,7 @@
         mAdapter.clear();
 
         int profileOffset = 0;
-        if (mAccountHeader != null) {
+        if (mAccountHeader != null && mAccountHeader.getAccountHeaderBuilder().mProfileImagesVisible) {
             IProfile profile = mAccountHeader.getActiveProfile();
             if (profile instanceof IDrawerItem) {
                 mAdapter.add(generateMiniDrawerItem((IDrawerItem) profile));
