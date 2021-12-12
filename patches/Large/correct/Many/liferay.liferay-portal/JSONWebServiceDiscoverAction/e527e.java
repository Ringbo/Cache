diff --git a/portal-impl/src/com/liferay/portal/jsonwebservice/action/JSONWebServiceDiscoverAction.java b/portal-impl/src/com/liferay/portal/jsonwebservice/action/JSONWebServiceDiscoverAction.java
index 79de52f5..b59f943 100644
--- a/portal-impl/src/com/liferay/portal/jsonwebservice/action/JSONWebServiceDiscoverAction.java
+++ b/portal-impl/src/com/liferay/portal/jsonwebservice/action/JSONWebServiceDiscoverAction.java
@@ -347,7 +347,7 @@
 		else if (type.equals(Object.class) || type.equals(Serializable.class)) {
 			return "map";
 		}
-		else if (ReflectUtil.isSubclass(type, Number.class)) {
+		else if (ReflectUtil.isTypeOf(type, Number.class)) {
 			String typeName = null;
 
 			if (type == Character.class) {
@@ -365,13 +365,12 @@
 
 		String typeName = type.getName();
 
-		if ((type == Collection.class) || (type == List.class) ||
-			ReflectUtil.isSubclass(type, List.class)) {
+		if ((type == Collection.class) ||
+			ReflectUtil.isTypeOf(type, List.class)) {
 
 			typeName = "list";
 		}
-		else if ((type == Map.class) ||
-				 ReflectUtil.isSubclass(type, Map.class)) {
+		else if (ReflectUtil.isTypeOf(type, Map.class)) {
 
 			typeName = "map";
 		}
