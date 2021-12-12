diff --git a/modules/util/portal-tools-db-upgrade-client/src/main/java/com/liferay/portal/tools/db/upgrade/client/AppServer.java b/modules/util/portal-tools-db-upgrade-client/src/main/java/com/liferay/portal/tools/db/upgrade/client/AppServer.java
index 733871c..7157857 100644
--- a/modules/util/portal-tools-db-upgrade-client/src/main/java/com/liferay/portal/tools/db/upgrade/client/AppServer.java
+++ b/modules/util/portal-tools-db-upgrade-client/src/main/java/com/liferay/portal/tools/db/upgrade/client/AppServer.java
@@ -160,7 +160,7 @@
 	public void setExtraLibDirNames(String extraLibDirNames) {
 		if (extraLibDirNames != null) {
 			for (String extraLibDirName : extraLibDirNames.split(",")) {
-				_extraLibDirs.add(new File(extraLibDirNames, extraLibDirName));
+				_extraLibDirs.add(new File(_dir, extraLibDirName));
 			}
 		}
 	}
