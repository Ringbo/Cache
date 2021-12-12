diff --git a/core/java/android/webkit/AccessibilityInjector.java b/core/java/android/webkit/AccessibilityInjector.java
index c32359f..c3654bd 100644
--- a/core/java/android/webkit/AccessibilityInjector.java
+++ b/core/java/android/webkit/AccessibilityInjector.java
@@ -351,7 +351,7 @@
             return;
         }
         mTextToSpeech = new TextToSpeechWrapper(mContext);
-        mWebViewClassic.addJavascriptInterface(mTextToSpeech, ALIAS_TTS_JS_INTERFACE, false);
+        mWebViewClassic.addJavascriptInterface(mTextToSpeech, ALIAS_TTS_JS_INTERFACE, true);
     }
 
     /**
@@ -375,7 +375,7 @@
         }
 
         mCallback = new CallbackHandler(ALIAS_TRAVERSAL_JS_INTERFACE);
-        mWebViewClassic.addJavascriptInterface(mCallback, ALIAS_TRAVERSAL_JS_INTERFACE, false);
+        mWebViewClassic.addJavascriptInterface(mCallback, ALIAS_TRAVERSAL_JS_INTERFACE, true);
     }
 
     private void removeCallbackApis() {
