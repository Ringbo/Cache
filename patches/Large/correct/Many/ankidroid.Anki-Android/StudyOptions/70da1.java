diff --git a/src/com/ichi2/anki/StudyOptions.java b/src/com/ichi2/anki/StudyOptions.java
index 6a629ce..1fa0032 100644
--- a/src/com/ichi2/anki/StudyOptions.java
+++ b/src/com/ichi2/anki/StudyOptions.java
@@ -1226,7 +1226,7 @@
             mEditSessionTime.setText(String.valueOf(timeLimit));
         }
         if (repLimit != 0) {
-            mEditSessionTime.setText(String.valueOf(repLimit));
+            mEditSessionQuestions.setText(String.valueOf(repLimit));
         }
 
         updateLimitTagText(LIMIT_NEW_ACTIVE, deck.getVar("newActive"));
