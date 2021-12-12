diff --git a/src/it/feio/android/omninotes/models/NoteAdapter.java b/src/it/feio/android/omninotes/models/NoteAdapter.java
index b40c695..662e0a2 100644
--- a/src/it/feio/android/omninotes/models/NoteAdapter.java
+++ b/src/it/feio/android/omninotes/models/NoteAdapter.java
@@ -42,10 +42,10 @@
 		
 		// Get text for title and content views
 		title.setText(values.get(position).getTitle());
-		int maxContentTextLength = 15;
+		int maxContentTextLength = 40;
 		String noteContent = values.get(position).getContent().split(System.getProperty("line.separator"))[0];
 		String suffix = values.get(position).getContent().length() > maxContentTextLength ? " ..." : "";
-		String contentText = noteContent + suffix;
+		String contentText = suffix.length() > 0 ? noteContent.substring(0, maxContentTextLength) + suffix : noteContent;
 							
 		content.setText(contentText);
 		
