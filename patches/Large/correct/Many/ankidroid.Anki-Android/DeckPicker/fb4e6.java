diff --git a/src/com/ichi2/anki/DeckPicker.java b/src/com/ichi2/anki/DeckPicker.java
index 24f67d8..63df045 100644
--- a/src/com/ichi2/anki/DeckPicker.java
+++ b/src/com/ichi2/anki/DeckPicker.java
@@ -1383,7 +1383,7 @@
                                     if (Utils.isIntentAvailable(DeckPicker.this, "android.intent.action.VIEW")) {
                                         Intent intent = new Intent("android.intent.action.VIEW", Uri
                                                 .parse(getResources().getString(
-                                                        arg1 == 0 ? R.string.link_help : R.string.link_faq)));
+                                                        arg1 == 1 ? R.string.link_help : R.string.link_faq)));
                                         startActivity(intent);
                                     } else {
                                         startActivity(new Intent(DeckPicker.this, Info.class));
