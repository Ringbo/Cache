diff --git a/app/src/androidTest/java/de/test/antennapod/ui/MainActivityTest.java b/app/src/androidTest/java/de/test/antennapod/ui/MainActivityTest.java
index f0cdbbd..470866c 100644
--- a/app/src/androidTest/java/de/test/antennapod/ui/MainActivityTest.java
+++ b/app/src/androidTest/java/de/test/antennapod/ui/MainActivityTest.java
@@ -144,7 +144,7 @@
 
     public void testGoToPreferences() {
         openNavDrawer();
-        solo.clickOnMenuItem(solo.getString(R.string.settings_label));
+        solo.clickOnText(solo.getString(R.string.settings_label));
         solo.waitForActivity(PreferenceController.getPreferenceActivity());
     }
 
