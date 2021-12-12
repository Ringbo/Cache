diff --git a/src/org/zaproxy/zap/extension/pscan/OptionsPassiveScan.java b/src/org/zaproxy/zap/extension/pscan/OptionsPassiveScan.java
index cafe7ec..bcd1d93 100644
--- a/src/org/zaproxy/zap/extension/pscan/OptionsPassiveScan.java
+++ b/src/org/zaproxy/zap/extension/pscan/OptionsPassiveScan.java
@@ -337,7 +337,7 @@
 	        				RegexAutoTagScanner rats = (RegexAutoTagScanner) defn;
 	        				editName.setText(rats.getName());
 	        				editType.setText(rats.getType().name());
-	        				editConfig.setText(rats.getConfig());
+	        				editConfig.setText(rats.getConf());
 	        		    	editRequestUrlRegex.setText(rats.getRequestUrlRegex());
 	        		    	editRequestHeaderRegex.setText(rats.getRequestHeaderRegex());
 	        		    	editResponseHeaderRegex.setText(rats.getResponseHeaderRegex());
@@ -379,8 +379,8 @@
 					editName.getText(), RegexAutoTagScanner.TYPE.TAG, editConfig.getText());
 			isNew = true;
 		}
-		// TODO validate params, eg config is mandatory
-		rats.setConfig(editConfig.getText());
+		// TODO validate params, eg conf is mandatory
+		rats.setConf(editConfig.getText());
 		rats.setRequestHeaderRegex(editRequestHeaderRegex.getText());
 		rats.setRequestUrlRegex(editRequestUrlRegex.getText());
 		rats.setResponseHeaderRegex(editResponseHeaderRegex.getText());
