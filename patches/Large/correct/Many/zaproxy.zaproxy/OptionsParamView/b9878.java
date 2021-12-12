diff --git a/src/org/parosproxy/paros/extension/option/OptionsParamView.java b/src/org/parosproxy/paros/extension/option/OptionsParamView.java
index 5191b88..539c0ba 100644
--- a/src/org/parosproxy/paros/extension/option/OptionsParamView.java
+++ b/src/org/parosproxy/paros/extension/option/OptionsParamView.java
@@ -70,7 +70,7 @@
 	    showMainToolbar = getConfig().getInt(SHOW_MAIN_TOOLBAR_OPTION, 1);
 	    advancedViewEnabled = getConfig().getInt(ADVANCEDUI_OPTION, 0);
 	    wmUiHandlingEnabled = getConfig().getInt(WMUIHANDLING_OPTION, 0);
-	    askOnExitEnabled = getConfig().getInt(ADVANCEDUI_OPTION, 1);
+	    askOnExitEnabled = getConfig().getInt(ASKONEXIT_OPTION, 1);
     }
 
 	/**
