diff --git a/portal-impl/src/com/liferay/portlet/portletconfiguration/action/EditArchivedSetupsAction.java b/portal-impl/src/com/liferay/portlet/portletconfiguration/action/EditArchivedSetupsAction.java
index b1d0259..0d401e7 100644
--- a/portal-impl/src/com/liferay/portlet/portletconfiguration/action/EditArchivedSetupsAction.java
+++ b/portal-impl/src/com/liferay/portlet/portletconfiguration/action/EditArchivedSetupsAction.java
@@ -149,7 +149,7 @@
 				req, portlet.getPortletId());
 
 		PortletPreferencesServiceUtil.restoreArchivedPreferences(
-			layout.getGroupId(), name, portlet.getPortletId(), setup);
+			layout.getGroupId(), name, portlet.getRootPortletId(), setup);
 	}
 
 	protected void updateSetup(ActionRequest req, Portlet portlet)
@@ -166,7 +166,7 @@
 
 		PortletPreferencesServiceUtil.updateArchivePreferences(
 			themeDisplay.getUserId(), themeDisplay.getLayout().getGroupId(),
-			name, portlet.getPortletId(), setup);
+			name, portlet.getRootPortletId(), setup);
 	}
 
 }
\ No newline at end of file
