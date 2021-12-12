diff --git a/openapi/src/com/intellij/ui/SimpleTextAttributes.java b/openapi/src/com/intellij/ui/SimpleTextAttributes.java
index 4d927fe..48393a9 100644
--- a/openapi/src/com/intellij/ui/SimpleTextAttributes.java
+++ b/openapi/src/com/intellij/ui/SimpleTextAttributes.java
@@ -127,7 +127,7 @@
       effectColor = myWaveColor;
       effectType = EffectType.WAVE_UNDERSCORE;
     } else if (isStrikeout()) {
-      effectColor = myFgColor;
+      effectColor = myWaveColor;
       effectType = EffectType.STRIKEOUT;
     } else{
       effectColor = null;
