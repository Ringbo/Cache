diff --git a/AnkiDroid/src/main/java/com/ichi2/anki/dialogs/CustomStudyDialog.java b/AnkiDroid/src/main/java/com/ichi2/anki/dialogs/CustomStudyDialog.java
index 7bf6551..a8d2ebc 100644
--- a/AnkiDroid/src/main/java/com/ichi2/anki/dialogs/CustomStudyDialog.java
+++ b/AnkiDroid/src/main/java/com/ichi2/anki/dialogs/CustomStudyDialog.java
@@ -328,12 +328,12 @@
             case CONTEXT_MENU_LIMITS:
                 // Special custom study options to show when the daily study limit has been reached
                 if (col.getSched().newDue() && col.getSched().revDue()) {
-                    return new int[] {CUSTOM_STUDY_NEW, CUSTOM_STUDY_REV, DECK_OPTIONS, CONTEXT_MENU_STANDARD};
+                    return new int[] {CUSTOM_STUDY_NEW, CUSTOM_STUDY_REV, DECK_OPTIONS, MORE_OPTIONS};
                 } else {
                     if (col.getSched().newDue()) {
-                        return new int[]{CUSTOM_STUDY_NEW, DECK_OPTIONS, CONTEXT_MENU_STANDARD};
+                        return new int[]{CUSTOM_STUDY_NEW, DECK_OPTIONS, MORE_OPTIONS};
                     } else {
-                        return new int[]{CUSTOM_STUDY_REV, DECK_OPTIONS, CONTEXT_MENU_STANDARD};
+                        return new int[]{CUSTOM_STUDY_REV, DECK_OPTIONS, MORE_OPTIONS};
                     }
                 }
             case CONTEXT_MENU_EMPTY_SCHEDULE:
