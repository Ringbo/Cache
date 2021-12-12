diff --git a/src/org/zaproxy/zap/extension/httpsessions/ExtensionHttpSessions.java b/src/org/zaproxy/zap/extension/httpsessions/ExtensionHttpSessions.java
index 8e48590..23bbec1 100644
--- a/src/org/zaproxy/zap/extension/httpsessions/ExtensionHttpSessions.java
+++ b/src/org/zaproxy/zap/extension/httpsessions/ExtensionHttpSessions.java
@@ -573,7 +573,7 @@
 
 	@Override
 	public void onHttpRequestSend(HttpMessage msg, int initiator, HttpSender sender) {
-		if (initiator == HttpSender.CHECK_FOR_UPDATES_INITIATOR) {
+		if (initiator == HttpSender.CHECK_FOR_UPDATES_INITIATOR || initiator == HttpSender.AUTHENTICATION_INITIATOR) {
 			return;
 		}
 
@@ -608,7 +608,8 @@
 	@Override
 	public void onHttpResponseReceive(HttpMessage msg, int initiator, HttpSender sender) {
 		if (initiator == HttpSender.ACTIVE_SCANNER_INITIATOR || initiator == HttpSender.SPIDER_INITIATOR
-				|| initiator == HttpSender.CHECK_FOR_UPDATES_INITIATOR || initiator == HttpSender.FUZZER_INITIATOR) {
+				|| initiator == HttpSender.CHECK_FOR_UPDATES_INITIATOR || initiator == HttpSender.FUZZER_INITIATOR
+				|| initiator == HttpSender.AUTHENTICATION_INITIATOR) {
 			// Not a session we care about
 			return;
 		}
