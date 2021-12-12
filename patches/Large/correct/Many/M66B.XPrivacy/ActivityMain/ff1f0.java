diff --git a/src/biz/bokhorst/xprivacy/ActivityMain.java b/src/biz/bokhorst/xprivacy/ActivityMain.java
index 01025d6..ead72d5 100644
--- a/src/biz/bokhorst/xprivacy/ActivityMain.java
+++ b/src/biz/bokhorst/xprivacy/ActivityMain.java
@@ -903,7 +903,7 @@
 		cbFRestrictionNot.setEnabled(fRestriction);
 
 		cbFOnDemand.setEnabled(ondemand);
-		cbFOnDemandNot.setEnabled(fRestriction && ondemand);
+		cbFOnDemandNot.setEnabled(fOnDemand && ondemand);
 
 		// Manage user/system filter exclusivity
 		OnCheckedChangeListener checkListener = new OnCheckedChangeListener() {
