diff --git a/omniNotes/src/androidTest/java/it/feio/android/omninotes/test/NoteWithAudio.java b/omniNotes/src/androidTest/java/it/feio/android/omninotes/test/NoteWithAudio.java
index 7ef7142..8e0dc67 100644
--- a/omniNotes/src/androidTest/java/it/feio/android/omninotes/test/NoteWithAudio.java
+++ b/omniNotes/src/androidTest/java/it/feio/android/omninotes/test/NoteWithAudio.java
@@ -32,7 +32,7 @@
         //Click on (1028.1432, 1752.0874)
 		solo.clickOnScreen(1028.1432F, 1752.0874F);
         //Click on ImageView
-		solo.clickOnView(solo.getView(it.feio.android.omninotes.R.id.fab_expand_menu_button));
+		solo.clickLongOnView(solo.getView(it.feio.android.omninotes.R.id.fab_expand_menu_button));
         //Click on Empty Text View
 		solo.clickOnView(solo.getView(it.feio.android.omninotes.R.id.menu_attachment));
         //Click on Record
