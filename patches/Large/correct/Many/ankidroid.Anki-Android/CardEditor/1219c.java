diff --git a/src/com/ichi2/anki/CardEditor.java b/src/com/ichi2/anki/CardEditor.java
index 21b1ee1..8d88ae1 100644
--- a/src/com/ichi2/anki/CardEditor.java
+++ b/src/com/ichi2/anki/CardEditor.java
@@ -690,7 +690,7 @@
 			frame.addView(mNewTagEditText);
 			frame.addView(mAddTextButton);
 
-			builder.setView(frame, true);
+			builder.setView(frame, false, true);
 			dialog = builder.create();
 			mTagsDialog = dialog;
 			break;
