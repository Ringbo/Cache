diff --git a/src/biz/bokhorst/xprivacy/XBatchEdit.java b/src/biz/bokhorst/xprivacy/XBatchEdit.java
index 128f3e3..6a20dca 100644
--- a/src/biz/bokhorst/xprivacy/XBatchEdit.java
+++ b/src/biz/bokhorst/xprivacy/XBatchEdit.java
@@ -94,7 +94,7 @@
 			SparseArray<XApplicationInfo> mapApp = new SparseArray<XApplicationInfo>();
 			List<XApplicationInfo> listApp = new ArrayList<XApplicationInfo>();
 			for (ApplicationInfo appInfo : getPackageManager().getInstalledApplications(PackageManager.GET_META_DATA))
-				if ((appInfo.uid == XRestriction.cUidAndroid ? expert : false)
+				if ((appInfo.uid == XRestriction.cUidAndroid ? expert : true)
 						&& !appInfo.packageName.equals(XBatchEdit.class.getPackage().getName())) {
 					XApplicationInfo xAppInfo = mapApp.get(appInfo.uid);
 					if (xAppInfo == null) {
