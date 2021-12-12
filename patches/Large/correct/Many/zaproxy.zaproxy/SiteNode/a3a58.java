diff --git a/src/org/parosproxy/paros/model/SiteNode.java b/src/org/parosproxy/paros/model/SiteNode.java
index 00a12f5..e01436c 100644
--- a/src/org/parosproxy/paros/model/SiteNode.java
+++ b/src/org/parosproxy/paros/model/SiteNode.java
@@ -175,11 +175,11 @@
 //                getPastHistoryReference().add(getHistoryReference());
 //            }
             
-        	if (this.justSpidered && this.clearIfManual && historyReference.getHistoryType() == HistoryReference.TYPE_MANUAL) {
+        	if (this.justSpidered && historyReference.getHistoryType() == HistoryReference.TYPE_MANUAL) {
         		this.justSpidered = false;
         		this.nodeChanged();
         	}
-        	if (this.specificIcon && historyReference.getHistoryType() == HistoryReference.TYPE_MANUAL) {
+        	if (this.specificIcon && this.clearIfManual && historyReference.getHistoryType() == HistoryReference.TYPE_MANUAL) {
     			this.specificIcon = false;
     			this.nodeChanged();
     		}
