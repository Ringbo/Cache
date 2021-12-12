diff --git a/core/java/android/speech/tts/TtsEngines.java b/core/java/android/speech/tts/TtsEngines.java
index 2706bc7..5fbd22e 100644
--- a/core/java/android/speech/tts/TtsEngines.java
+++ b/core/java/android/speech/tts/TtsEngines.java
@@ -355,7 +355,18 @@
         return v1Locale;
     }
 
-    private String getDefaultLocale() {
+    /**
+     * Return the default device locale in form of 3 letter codes delimited by
+     * {@link #LOCALE_DELIMITER}:
+     * <ul>
+     *   <li> "ISO 639-2/T language code" if locale have no country entry</li>
+     *   <li> "ISO 639-2/T language code{@link #LOCALE_DELIMITER}ISO 3166 country code "
+     *     if locale have no variant entry</li>
+     *   <li> "ISO 639-2/T language code{@link #LOCALE_DELIMITER}ISO 3166 country code
+     *     {@link #LOCALE_DELIMITER} variant" if locale have variant entry</li>
+     * </ul>
+     */
+    public String getDefaultLocale() {
         final Locale locale = Locale.getDefault();
 
         // Note that the default locale might have an empty variant
