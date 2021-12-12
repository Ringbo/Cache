diff --git a/OsmAnd/src/net/osmand/plus/voice/TTSCommandPlayerImpl.java b/OsmAnd/src/net/osmand/plus/voice/TTSCommandPlayerImpl.java
index 205f647..c5a62f3 100644
--- a/OsmAnd/src/net/osmand/plus/voice/TTSCommandPlayerImpl.java
+++ b/OsmAnd/src/net/osmand/plus/voice/TTSCommandPlayerImpl.java
@@ -204,7 +204,7 @@
 									builder.show();
 								}
 								ttsVoiceStatus = newLocale.getDisplayName() + ": LANG_MISSING_DATA";
-								ttsVoiceUsed = getTtsVoiceUsed();
+								ttsVoiceUsed = getVoiceUsed();
 								break;
 							case TextToSpeech.LANG_AVAILABLE:
 								ttsVoiceStatus = newLocale.getDisplayName() + ": LANG_AVAILABLE";
@@ -221,7 +221,7 @@
 									mTts.setSpeechRate(speechRate);
 								}
 								ttsVoiceStatus = "".equals(ttsVoiceStatus) ? newLocale.getDisplayName() + ": LANG_COUNTRY_VAR_AVAILABLE" : ttsVoiceStatus;
-								ttsVoiceUsed = getTtsVoiceUsed();
+								ttsVoiceUsed = getVoiceUsed();
 								break;
 							case TextToSpeech.LANG_NOT_SUPPORTED:
 								//maybe weird, but I didn't want to introduce parameter in around 5 methods just to do this if condition
@@ -237,7 +237,7 @@
 									builder.show();
 								}
 								ttsVoiceStatus = newLocale.getDisplayName() + ": LANG_NOT_SUPPORTED";
-								ttsVoiceUsed = getTtsVoiceUsed();
+								ttsVoiceUsed = getVoiceUsed();
 								break;
 						}
 					}
@@ -251,15 +251,15 @@
 					try {
 						if (android.os.Build.VERSION.SDK_INT >= 21) {
 							if (mTts.getVoice() != null) {
-								return mTts.getVoice().toString();
+								return mTts.getVoice().toString() + " (API " + android.os.Build.VERSION.SDK_INT.toString() + ")";
 							}
 						} else {
-							return mTts.getLanguage() + " (Voice details not reported in API<21)";
+							return mTts.getLanguage() + " (API " + android.os.Build.VERSION.SDK_INT.toString() + " only reports language)";
 						}
 					} catch (RuntimeException e) {
 						// mTts.getVoice() might throw NPE
 					}
-					return "";
+					return "-";
 				}
 			});
 			mTts.setOnUtteranceCompletedListener(new OnUtteranceCompletedListener() {
