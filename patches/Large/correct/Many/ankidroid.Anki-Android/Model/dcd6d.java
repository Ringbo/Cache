diff --git a/src/com/ichi2/anki/Model.java b/src/com/ichi2/anki/Model.java
index 2138268..e30bd2d 100644
--- a/src/com/ichi2/anki/Model.java
+++ b/src/com/ichi2/anki/Model.java
@@ -389,10 +389,10 @@
         sb.append(calculateDisplay(percentage, myCardModel.getQuestionFontFamily(), myCardModel.getQuestionFontSize(),
                 myCardModel.getQuestionFontColour(), myCardModel.getQuestionAlign(), false, invertedColors));
         sb.append("}\n");
-        // answer
+        // answer (alignment is stored in question as alignment is shared in question and answer)
         sb.append(".").append(Reviewer.ANSWER_CLASS).append(" {\n");
         sb.append(calculateDisplay(percentage, myCardModel.getAnswerFontFamily(), myCardModel.getAnswerFontSize(),
-                myCardModel.getAnswerFontColour(), myCardModel.getAnswerAlign(), false, invertedColors));
+                myCardModel.getAnswerFontColour(), myCardModel.getQuestionAlign(), false, invertedColors));
         sb.append("}\n");
         // css for fields. Gets css for all fields no matter whether they actually are used in a given card model
         FieldModel myFieldModel = null;
