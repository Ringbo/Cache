diff --git a/omniNotes/src/androidTest/java/it/feio/android/omninotes/test/NoteWithReminderAndSketch.java b/omniNotes/src/androidTest/java/it/feio/android/omninotes/test/NoteWithReminderAndSketch.java
index d113ac6..0665f57 100644
--- a/omniNotes/src/androidTest/java/it/feio/android/omninotes/test/NoteWithReminderAndSketch.java
+++ b/omniNotes/src/androidTest/java/it/feio/android/omninotes/test/NoteWithReminderAndSketch.java
@@ -37,7 +37,7 @@
         //Set default small timeout to 30522 milliseconds
         Timeout.setSmallTimeout(30522);
         //Click on ImageView
-        solo.clickOnView(solo.getView(it.feio.android.omninotes.R.id.fab_expand_menu_button));
+        solo.clickLongOnView(solo.getView(it.feio.android.omninotes.R.id.fab_expand_menu_button));
         //Click on LinearLayout
         solo.clickOnView(solo.getView(it.feio.android.omninotes.R.id.reminder_layout));
         // Check that no reminder is set
