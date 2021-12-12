diff --git a/portal-impl/src/com/liferay/portal/deploy/hot/HookHotDeployListener.java b/portal-impl/src/com/liferay/portal/deploy/hot/HookHotDeployListener.java
index 453c169..3843af0 100644
--- a/portal-impl/src/com/liferay/portal/deploy/hot/HookHotDeployListener.java
+++ b/portal-impl/src/com/liferay/portal/deploy/hot/HookHotDeployListener.java
@@ -1345,7 +1345,8 @@
 				new DeprecatedFormNavigatorEntry(
 					formNavigatorSection, formNavigatorSection, categoryKey,
 					formNavigatorId,
-					"/html/portlet/" + jspPath + "/" + categoryKey + ".jsp");
+					"/html/portlet/" + jspPath + "/" + formNavigatorSection +
+						".jsp");
 
 			registerService(
 				servletContextName,
