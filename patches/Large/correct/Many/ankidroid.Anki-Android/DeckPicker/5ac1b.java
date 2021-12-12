diff --git a/src/com/ichi2/anki/DeckPicker.java b/src/com/ichi2/anki/DeckPicker.java
index 6be8008..daed654 100644
--- a/src/com/ichi2/anki/DeckPicker.java
+++ b/src/com/ichi2/anki/DeckPicker.java
@@ -2476,7 +2476,7 @@
 
 
     private void integrityCheck() {
-    	if (AnkiDroidApp.colIsOpen()) {
+    	if (!AnkiDroidApp.colIsOpen()) {
     		loadCollection();
     		return;
     	}
