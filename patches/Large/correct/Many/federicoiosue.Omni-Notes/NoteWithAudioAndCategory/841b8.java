diff --git a/omniNotes/src/androidTest/java/it/feio/android/omninotes/test/NoteWithAudioAndCategory.java b/omniNotes/src/androidTest/java/it/feio/android/omninotes/test/NoteWithAudioAndCategory.java
index 4462295..d5edd83 100644
--- a/omniNotes/src/androidTest/java/it/feio/android/omninotes/test/NoteWithAudioAndCategory.java
+++ b/omniNotes/src/androidTest/java/it/feio/android/omninotes/test/NoteWithAudioAndCategory.java
@@ -39,7 +39,7 @@
         //Click on (1028.1432, 1752.0874)
 		solo.clickOnScreen(1028.1432F, 1752.0874F);
         //Click on ImageView
-		solo.clickOnView(solo.getView(it.feio.android.omninotes.R.id.fab_expand_menu_button));
+		solo.clickLongOnView(solo.getView(it.feio.android.omninotes.R.id.fab_expand_menu_button));
         //Click on Empty Text View
 		solo.clickOnView(solo.getView(it.feio.android.omninotes.R.id.menu_attachment));
         //Click on Record
