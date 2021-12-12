diff --git a/src/org/zaproxy/zap/extension/api/OptionsParamApi.java b/src/org/zaproxy/zap/extension/api/OptionsParamApi.java
index fe4df3f..97df573 100644
--- a/src/org/zaproxy/zap/extension/api/OptionsParamApi.java
+++ b/src/org/zaproxy/zap/extension/api/OptionsParamApi.java
@@ -34,7 +34,7 @@
     @Override
     protected void parse() {
         
-	    enabled = getConfig().getBoolean(ENABLED, false);
+	    enabled = getConfig().getBoolean(ENABLED, true);
 	    //postActions = getConfig().getBoolean(POST_ACTIONS, false);
     }
 
