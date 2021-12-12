diff --git a/src/com/ichi2/anki/StudyOptions.java b/src/com/ichi2/anki/StudyOptions.java
index 4486420..7cf57f0 100644
--- a/src/com/ichi2/anki/StudyOptions.java
+++ b/src/com/ichi2/anki/StudyOptions.java
@@ -1227,7 +1227,7 @@
             mEditSessionTime.setText(String.valueOf(timeLimit));
         }
         if (repLimit != 0) {
-            mEditSessionTime.setText(String.valueOf(repLimit));
+            mEditSessionQuestions.setText(String.valueOf(repLimit));
         }
 
         updateLimitTagText(LIMIT_NEW_ACTIVE, deck.getVar("newActive"));
