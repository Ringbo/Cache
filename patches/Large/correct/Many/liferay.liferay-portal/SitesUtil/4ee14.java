diff --git a/portal-impl/src/com/liferay/portlet/sites/util/SitesUtil.java b/portal-impl/src/com/liferay/portlet/sites/util/SitesUtil.java
index 9cb5f51..4764bd5 100644
--- a/portal-impl/src/com/liferay/portlet/sites/util/SitesUtil.java
+++ b/portal-impl/src/com/liferay/portlet/sites/util/SitesUtil.java
@@ -1168,7 +1168,7 @@
 
 		File file = null;
 
-		StringBundler sb = new StringBundler(importData ? 4 : 4);
+		StringBundler sb = new StringBundler(importData ? 4 : 3);
 
 		sb.append(_TEMP_DIR);
 		sb.append(layoutSetPrototype.getUuid());
