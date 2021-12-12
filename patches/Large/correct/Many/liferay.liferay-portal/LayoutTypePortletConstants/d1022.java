diff --git a/portal-kernel/src/com/liferay/layouts/admin/kernel/model/LayoutTypePortletConstants.java b/portal-kernel/src/com/liferay/layouts/admin/kernel/model/LayoutTypePortletConstants.java
index 7f83521..3b27bdc 100644
--- a/portal-kernel/src/com/liferay/layouts/admin/kernel/model/LayoutTypePortletConstants.java
+++ b/portal-kernel/src/com/liferay/layouts/admin/kernel/model/LayoutTypePortletConstants.java
@@ -110,7 +110,7 @@
 			return true;
 		}
 
-		return true;
+		return false;
 	}
 
 	private static final Set<String> _typeSettingsIds = SetUtil.fromArray(
