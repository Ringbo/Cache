diff --git a/shared/portal-settings-shared/test/unit/com/liferay/portal/settings/FallbackKeySettingsTest.java b/shared/portal-settings-shared/test/unit/com/liferay/portal/settings/FallbackKeySettingsTest.java
index 167f722..0427d3d 100644
--- a/shared/portal-settings-shared/test/unit/com/liferay/portal/settings/FallbackKeySettingsTest.java
+++ b/shared/portal-settings-shared/test/unit/com/liferay/portal/settings/FallbackKeySettingsTest.java
@@ -35,7 +35,7 @@
 		_fallbackPaths.addPath("key2", "key7");
 		_fallbackPaths.addPath("key3", "key5");
 
-		_fallbackKeySettings = new FallbackKeySettings(
+		_fallbackKeySettings = new FallbackPathSettings(
 			_settings, _fallbackPaths);
 	}
 
@@ -112,7 +112,7 @@
 		inOrder.verifyNoMoreInteractions();
 	}
 
-	private FallbackKeySettings _fallbackKeySettings;
+	private FallbackPathSettings _fallbackKeySettings;
 	private FallbackPaths _fallbackPaths;
 	private Settings _settings;
 
