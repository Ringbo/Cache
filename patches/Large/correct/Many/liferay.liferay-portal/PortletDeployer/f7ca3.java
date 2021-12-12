diff --git a/portal-impl/src/com/liferay/portal/tools/deploy/PortletDeployer.java b/portal-impl/src/com/liferay/portal/tools/deploy/PortletDeployer.java
index 466e5ed..f350c9d 100644
--- a/portal-impl/src/com/liferay/portal/tools/deploy/PortletDeployer.java
+++ b/portal-impl/src/com/liferay/portal/tools/deploy/PortletDeployer.java
@@ -193,7 +193,8 @@
 			String portletName = PortalUtil.getJsSafePortletId(
 				portlet.elementText("portlet-name"));
 			String portletClass = portlet.elementText("portlet-class");
-			String servletName = portletName + "servlet";
+
+			String servletName = portletName + " Servlet";
 
 			sb.append("<servlet>");
 			sb.append("<servlet-name>");
@@ -216,7 +217,7 @@
 			sb.append(servletName);
 			sb.append("</servlet-name>");
 			sb.append("<url-pattern>/");
-			sb.append(servletName);
+			sb.append(portletName);
 			sb.append("/*</url-pattern>");
 			sb.append("</servlet-mapping>");
 		}
