diff --git a/AnkiDroid/src/main/java/com/ichi2/anki/ModelBrowser.java b/AnkiDroid/src/main/java/com/ichi2/anki/ModelBrowser.java
index 78658ef..996bafa 100644
--- a/AnkiDroid/src/main/java/com/ichi2/anki/ModelBrowser.java
+++ b/AnkiDroid/src/main/java/com/ichi2/anki/ModelBrowser.java
@@ -507,7 +507,7 @@
                                         JSONObject model = mModels.get(mModelListPosition);
                                         String deckName = mModelNameInput.getText().toString()
                                                 .replaceAll("[\'\"\\n\\r\\[\\]\\(\\)]", "");
-                                        getCol().getDecks().id(deckName, true);
+                                        getCol().getDecks().id(deckName, false);
                                         if (deckName.length() > 0) {
                                             try {
                                                 model.put("name", deckName);
