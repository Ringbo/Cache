diff --git a/src/org/parosproxy/paros/model/Session.java b/src/org/parosproxy/paros/model/Session.java
index 39e8214..a687572 100644
--- a/src/org/parosproxy/paros/model/Session.java
+++ b/src/org/parosproxy/paros/model/Session.java
@@ -51,6 +51,7 @@
 // ZAP: 2015/02/09 Issue 1525: Introduce a database interface layer to allow for alternative implementations
 // ZAP: 2015/04/02 Issue 321: Support multiple databases and Issue 1582: Low memory option
 // ZAP: 2015/08/19 Change to use ZapXmlConfiguration instead of extending FileXML
+// ZAP: 2015/08/19 Issue 1789: Forced Browse/AJAX Spider messages not restored to Sites tab
 
 package org.parosproxy.paros.model;
 
@@ -334,7 +335,8 @@
 		}
 		
 		// update siteTree reference
-		list = model.getDb().getTableHistory().getHistoryIdsOfHistType(getSessionId(), HistoryReference.TYPE_SPIDER);
+		list = model.getDb().getTableHistory().getHistoryIdsOfHistType(getSessionId(), HistoryReference.TYPE_SPIDER,
+				HistoryReference.TYPE_BRUTE_FORCE, HistoryReference.TYPE_SPIDER_AJAX);
 		
 		for (int i=0; i<list.size(); i++) {
 			// ZAP: Removed unnecessary cast.
