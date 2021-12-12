diff --git a/WordPress/src/main/java/org/wordpress/android/ui/main/SitePickerAdapter.java b/WordPress/src/main/java/org/wordpress/android/ui/main/SitePickerAdapter.java
index 4ec9a7e..ae70010 100644
--- a/WordPress/src/main/java/org/wordpress/android/ui/main/SitePickerAdapter.java
+++ b/WordPress/src/main/java/org/wordpress/android/ui/main/SitePickerAdapter.java
@@ -293,7 +293,7 @@
         }
 
         if (mIsSingleItemSelectionEnabled) {
-            if (getSitesCount() == 1) {
+            if (getSitesCount() <= 1) {
                 holder.selectedRadioButton.setVisibility(View.GONE);
             } else {
                 holder.selectedRadioButton.setVisibility(View.VISIBLE);
