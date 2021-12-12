diff --git a/omniNotes/src/androidTest/java/it/feio/android/omninotes/test/NoteWithTitleAndContent.java b/omniNotes/src/androidTest/java/it/feio/android/omninotes/test/NoteWithTitleAndContent.java
index 3a40a97..dac77ff 100644
--- a/omniNotes/src/androidTest/java/it/feio/android/omninotes/test/NoteWithTitleAndContent.java
+++ b/omniNotes/src/androidTest/java/it/feio/android/omninotes/test/NoteWithTitleAndContent.java
@@ -64,7 +64,7 @@
         //Set default small timeout to 30522 milliseconds
         Timeout.setSmallTimeout(30522);
         //Click on ImageView
-        solo.clickOnView(solo.getView(it.feio.android.omninotes.R.id.fab_expand_menu_button));
+        solo.clickLongOnView(solo.getView(it.feio.android.omninotes.R.id.fab_expand_menu_button));
         //Click on Empty Text View
         EditText titleEditText = (EditText) solo.getView(it.feio.android.omninotes.R.id.detail_title);
         solo.clickOnView(titleEditText);
