diff --git a/modules/apps/static/portal-osgi-web/portal-osgi-web-servlet-context-helper/src/main/java/com/liferay/portal/osgi/web/servlet/context/helper/internal/definition/WebXMLDefinitionLoader.java b/modules/apps/static/portal-osgi-web/portal-osgi-web-servlet-context-helper/src/main/java/com/liferay/portal/osgi/web/servlet/context/helper/internal/definition/WebXMLDefinitionLoader.java
index d351ff4..18ea2a4 100644
--- a/modules/apps/static/portal-osgi-web/portal-osgi-web-servlet-context-helper/src/main/java/com/liferay/portal/osgi/web/servlet/context/helper/internal/definition/WebXMLDefinitionLoader.java
+++ b/modules/apps/static/portal-osgi-web/portal-osgi-web-servlet-context-helper/src/main/java/com/liferay/portal/osgi/web/servlet/context/helper/internal/definition/WebXMLDefinitionLoader.java
@@ -734,7 +734,7 @@
 			String servletName = entry.getKey();
 
 			if (!assembledServletDefinitions.containsKey(servletName)) {
-				fragmentServletDefinitions.put(servletName, entry.getValue());
+				assembledServletDefinitions.put(servletName, entry.getValue());
 
 				continue;
 			}
