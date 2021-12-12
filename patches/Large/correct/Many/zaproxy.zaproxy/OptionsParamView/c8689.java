diff --git a/src/org/parosproxy/paros/extension/option/OptionsParamView.java b/src/org/parosproxy/paros/extension/option/OptionsParamView.java
index e4ab7e9..fddc384 100644
--- a/src/org/parosproxy/paros/extension/option/OptionsParamView.java
+++ b/src/org/parosproxy/paros/extension/option/OptionsParamView.java
@@ -104,7 +104,7 @@
 	private int showMainToolbar = 1;
 	private String configLocale = "";
 	private String locale = "";
-	private int displayOption = 0;
+	private int displayOption = 1;
 	private String responsePanelPosition;
 	private int brkPanelViewOption = 0;
 	private int askOnExitEnabled = 1;
@@ -156,7 +156,7 @@
 	    configLocale = getString(LOCALE, null);	// No default
 	    locale = getString(LOCALE, DEFAULT_LOCALE);
 	    useSystemsLocaleForFormat = getBoolean(USE_SYSTEMS_LOCALE_FOR_FORMAT_KEY, true);
-	    displayOption = getInt(DISPLAY_OPTION, 0);
+	    displayOption = getInt(DISPLAY_OPTION, 1);
         responsePanelPosition = getString(RESPONSE_PANEL_POS_KEY, WorkbenchPanel.ResponsePanelPosition.TABS_SIDE_BY_SIDE.name());
 	    brkPanelViewOption = getInt(BRK_PANEL_VIEW_OPTION, 0);
 	    showMainToolbar = getInt(SHOW_MAIN_TOOLBAR_OPTION, 1);
