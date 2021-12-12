diff --git a/src/biz/bokhorst/xprivacy/XNetworkInterface.java b/src/biz/bokhorst/xprivacy/XNetworkInterface.java
index 1c08e17..b0ef1cb 100644
--- a/src/biz/bokhorst/xprivacy/XNetworkInterface.java
+++ b/src/biz/bokhorst/xprivacy/XNetworkInterface.java
@@ -68,7 +68,7 @@
 	protected void after(XParam param) throws Throwable {
 		if (getRestrictionName().equals(PrivacyManager.cInternet)) {
 			// Internet: fake offline state
-			if (mMethod == Methods.getByIndex && mMethod == Methods.getByInetAddress || mMethod == Methods.getByName
+			if (mMethod == Methods.getByIndex || mMethod == Methods.getByInetAddress || mMethod == Methods.getByName
 					|| mMethod == Methods.getNetworkInterfaces) {
 				if (param.getResult() != null && isRestricted(param))
 					param.setResult(null);
