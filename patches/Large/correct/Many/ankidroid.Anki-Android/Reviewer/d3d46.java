diff --git a/src/com/ichi2/anki/Reviewer.java b/src/com/ichi2/anki/Reviewer.java
index 39124d2..8e4aea7 100644
--- a/src/com/ichi2/anki/Reviewer.java
+++ b/src/com/ichi2/anki/Reviewer.java
@@ -2680,13 +2680,15 @@
                 // We need to play the sounds from the proper side of the card
                 if (!mSpeakText) {
                     // when showing answer, repeat question audio if so configured
-                    if (sDisplayAnswer && getConfigForCurrentCard().getBoolean("replayq")) {
+                    if (sDisplayAnswer && 
+                    		(!getConfigForCurrentCard().has("replayq") || getConfigForCurrentCard().getBoolean("replayq"))) {
                         Sound.playSounds(MetaDB.LANGUAGES_QA_QUESTION);
                     }
                     Sound.playSounds(sDisplayAnswer ? MetaDB.LANGUAGES_QA_ANSWER : MetaDB.LANGUAGES_QA_QUESTION);
                 } else {
                     // If the question is displayed or if the question should be replayed, read the question
-                    if (!sDisplayAnswer || getConfigForCurrentCard().getBoolean("replayq")) {
+                    if (!sDisplayAnswer || !getConfigForCurrentCard().has("replayq")
+                    		|| getConfigForCurrentCard().getBoolean("replayq")) {
                         readCardText(mCurrentCard, MetaDB.LANGUAGES_QA_QUESTION);
                     }
                     if (sDisplayAnswer) {
