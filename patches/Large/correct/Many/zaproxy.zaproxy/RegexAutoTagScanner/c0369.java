diff --git a/src/org/zaproxy/zap/extension/pscan/scanner/RegexAutoTagScanner.java b/src/org/zaproxy/zap/extension/pscan/scanner/RegexAutoTagScanner.java
index 3d02cfc..6f088c3 100644
--- a/src/org/zaproxy/zap/extension/pscan/scanner/RegexAutoTagScanner.java
+++ b/src/org/zaproxy/zap/extension/pscan/scanner/RegexAutoTagScanner.java
@@ -311,7 +311,7 @@
     }
     
 	private void matched(HttpMessage msg, int id) {
-		if (tagHistoryType(msg.getHistoryRef().getHistoryId())) {
+		if (tagHistoryType(msg.getHistoryRef().getHistoryType())) {
 			parent.addTag(id, this.getConf());
 		}
 		
