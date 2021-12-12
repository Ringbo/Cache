diff --git a/src/org/parosproxy/paros/core/scanner/Alert.java b/src/org/parosproxy/paros/core/scanner/Alert.java
index 056a7cc..320aec4 100644
--- a/src/org/parosproxy/paros/core/scanner/Alert.java
+++ b/src/org/parosproxy/paros/core/scanner/Alert.java
@@ -36,6 +36,7 @@
 // ZAP: 2014/04/10 Issue 1042: Having significant issues opening a previous session
 // ZAP: 2014/05/23 Issue 1209: Reliability becomes Confidence and add levels
 // ZAP: 2015/01/04 Issue 1419: Include alert's evidence in HTML report
+// ZAP: 2014/01/04 Issue 1475: Alerts with different name from same scanner might not be shown in report
 
 package org.parosproxy.paros.core.scanner;
 
@@ -322,14 +323,14 @@
 
 
 	/**
-	Override equals.  Alerts are equal if the alert, uri and param is the same.
+	Override equals.  Alerts are equal if the plugin id, alert, other info, uri and param is the same.
 	*/
 	@Override
 	public boolean equals(Object obj) {
 		Alert item = null;
 		if (obj instanceof Alert) {
 			item = (Alert) obj;
-			if ((pluginId == item.pluginId) && uri.equalsIgnoreCase(item.uri)
+			if ((pluginId == item.pluginId) && alert.equals(item.alert) && uri.equalsIgnoreCase(item.uri)
 				&& param.equalsIgnoreCase(item.param) && otherInfo.equalsIgnoreCase(item.otherInfo)) {
 				return true;
 			}
