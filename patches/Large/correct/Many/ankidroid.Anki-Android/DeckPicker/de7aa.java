diff --git a/src/com/ichi2/anki/DeckPicker.java b/src/com/ichi2/anki/DeckPicker.java
index 7091fb5..8244003 100644
--- a/src/com/ichi2/anki/DeckPicker.java
+++ b/src/com/ichi2/anki/DeckPicker.java
@@ -913,7 +913,7 @@
 				dialog = null;
 				break;
 			}
-			String[] entries = new String[10];
+			String[] entries = new String[9];
 			entries[CONTEXT_MENU_OPTIMIZE] = res.getString(R.string.contextmenu_deckpicker_optimize_deck);
 			entries[CONTEXT_MENU_CUSTOM_DICTIONARY] = res.getString(R.string.contextmenu_deckpicker_set_custom_dictionary);
 			entries[CONTEXT_MENU_DOWNLOAD_MEDIA] = res.getString(R.string.contextmenu_deckpicker_download_missing_media);
