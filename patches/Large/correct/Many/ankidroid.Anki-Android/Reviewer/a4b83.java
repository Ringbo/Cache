diff --git a/src/com/ichi2/anki/Reviewer.java b/src/com/ichi2/anki/Reviewer.java
index 8111cf7..b0aa7de 100644
--- a/src/com/ichi2/anki/Reviewer.java
+++ b/src/com/ichi2/anki/Reviewer.java
@@ -1370,7 +1370,7 @@
         Log.i(AnkiDroidApp.TAG, "base url = " + baseUrl );
         mCard.loadDataWithBaseURL(baseUrl, card, "text/html", "utf-8", null);
       
-        if (!mSpeakText && Integer.valueOf(android.os.Build.VERSION.SDK) > 3) {
+        if (mSpeakText && Integer.valueOf(android.os.Build.VERSION.SDK) > 3) {
             ReadText.setLanguageInformation(Model.getModel(AnkiDroidApp.deck(), mCurrentCard.getCardModelId(), false).getId(), mCurrentCard.getCardModelId());       	
         }
         
