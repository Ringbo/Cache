diff --git a/omniNotes/src/main/java/it/feio/android/omninotes/async/CategoryMenuTask.java b/omniNotes/src/main/java/it/feio/android/omninotes/async/CategoryMenuTask.java
index 2b26b1f..75a1cd4 100644
--- a/omniNotes/src/main/java/it/feio/android/omninotes/async/CategoryMenuTask.java
+++ b/omniNotes/src/main/java/it/feio/android/omninotes/async/CategoryMenuTask.java
@@ -114,7 +114,7 @@
                 if (settingsViewCat != null)
                     settingsViewCat.setVisibility(View.GONE);
                 settingsView.setVisibility(View.VISIBLE);
-            } else if (categories.size() > 0) {
+            } else if (categories.size() > 0 && settingsViewCat != null) {
                 settingsViewCat.setVisibility(View.VISIBLE);
                 if (settingsViewCat != null)
                     settingsView.setVisibility(View.GONE);
