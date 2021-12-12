diff --git a/portal-impl/src/com/liferay/portal/jsonwebservice/action/JSONWebServiceListAction.java b/portal-impl/src/com/liferay/portal/jsonwebservice/action/JSONWebServiceListAction.java
index 09bbd1c..290c651 100644
--- a/portal-impl/src/com/liferay/portal/jsonwebservice/action/JSONWebServiceListAction.java
+++ b/portal-impl/src/com/liferay/portal/jsonwebservice/action/JSONWebServiceListAction.java
@@ -191,7 +191,7 @@
 			return "object<" + typeName + ">";
 		}
 
-		StringBundler sb = new StringBundler(genericTypes.length * 2 + 2);
+		StringBundler sb = new StringBundler(genericTypes.length * 2 + 1);
 
 		sb.append(StringPool.LESS_THAN);
 
