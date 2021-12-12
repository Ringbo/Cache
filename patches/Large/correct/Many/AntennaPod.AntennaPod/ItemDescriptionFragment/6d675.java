diff --git a/app/src/main/java/de/danoeh/antennapod/fragment/ItemDescriptionFragment.java b/app/src/main/java/de/danoeh/antennapod/fragment/ItemDescriptionFragment.java
index 55d28ca..94d61e0 100644
--- a/app/src/main/java/de/danoeh/antennapod/fragment/ItemDescriptionFragment.java
+++ b/app/src/main/java/de/danoeh/antennapod/fragment/ItemDescriptionFragment.java
@@ -348,7 +348,7 @@
     }
 
     private boolean restoreFromPreference() {
-        if (!saveState) {
+        if (saveState) {
             Log.d(TAG, "Restoring from preferences");
             Activity activity = getActivity();
             if (activity != null) {
