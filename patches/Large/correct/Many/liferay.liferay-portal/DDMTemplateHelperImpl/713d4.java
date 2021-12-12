diff --git a/portal-impl/src/com/liferay/portlet/dynamicdatamapping/util/DDMTemplateHelperImpl.java b/portal-impl/src/com/liferay/portlet/dynamicdatamapping/util/DDMTemplateHelperImpl.java
index 83f930c..bdaba82 100644
--- a/portal-impl/src/com/liferay/portlet/dynamicdatamapping/util/DDMTemplateHelperImpl.java
+++ b/portal-impl/src/com/liferay/portlet/dynamicdatamapping/util/DDMTemplateHelperImpl.java
@@ -88,7 +88,7 @@
 				Class<?>[] parameterTypes = method.getParameterTypes();
 
 				StringBundler sb = new StringBundler(
-					4 + (parameterTypes.length * 2));
+					3 + ((parameterTypes.length * 2) - 1));
 
 				sb.append(method.getName());
 				sb.append(StringPool.OPEN_PARENTHESIS);
