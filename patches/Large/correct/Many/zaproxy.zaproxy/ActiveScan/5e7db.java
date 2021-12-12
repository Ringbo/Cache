diff --git a/src/org/zaproxy/zap/extension/ascan/ActiveScan.java b/src/org/zaproxy/zap/extension/ascan/ActiveScan.java
index 08fa32b..5d5ff7c 100644
--- a/src/org/zaproxy/zap/extension/ascan/ActiveScan.java
+++ b/src/org/zaproxy/zap/extension/ascan/ActiveScan.java
@@ -316,6 +316,6 @@
 
 	@Override
 	public int getScanId() {
-		return this.getScanId();
+		return this.getId();
 	}
 }
