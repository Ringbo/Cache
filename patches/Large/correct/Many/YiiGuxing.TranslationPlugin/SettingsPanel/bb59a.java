diff --git a/src/cn/yiiguxing/plugin/translate/ui/SettingsPanel.java b/src/cn/yiiguxing/plugin/translate/ui/SettingsPanel.java
index dd1a267..fb37609 100644
--- a/src/cn/yiiguxing/plugin/translate/ui/SettingsPanel.java
+++ b/src/cn/yiiguxing/plugin/translate/ui/SettingsPanel.java
@@ -85,7 +85,7 @@
 
         mPrimaryFontComboBox = new FontComboBox();
         if (IdeaCompat.BUILD_NUMBER >= IdeaCompat.Version.IDEA2017_1) {
-            mPhoneticFontComboBox = new FontComboBox(false, true);
+            mPhoneticFontComboBox = new FontComboBox(false);
         } else {
             mPhoneticFontComboBox = new FontComboBox();
         }
