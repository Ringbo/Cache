diff --git a/app/src/test/java/nodomain/freeyourgadget/gadgetbridge/test/LanguageUtilsTest.java b/app/src/test/java/nodomain/freeyourgadget/gadgetbridge/test/LanguageUtilsTest.java
index e6cb7a1..c226045 100644
--- a/app/src/test/java/nodomain/freeyourgadget/gadgetbridge/test/LanguageUtilsTest.java
+++ b/app/src/test/java/nodomain/freeyourgadget/gadgetbridge/test/LanguageUtilsTest.java
@@ -25,7 +25,7 @@
     }
     
     @Test
-    public void testStringTransliterateCyrillic() throws Exception {
+    public void testStringTransliterateHebrew() throws Exception {
         //input with cyrillic and diacritic letters
         String input = "בדיקה עברית";
         String output = LanguageUtils.transliterate(input);
@@ -41,7 +41,7 @@
         SharedPreferences settings = GBApplication.getPrefs().getPreferences();
         SharedPreferences.Editor editor = settings.edit();
         editor.putBoolean("transliteration", true);
-        editor.commit();
+        editor.apply();
 
         assertTrue("Transliteration option fail! Expected 'On', but result is 'Off'", LanguageUtils.transliterate());
     }
