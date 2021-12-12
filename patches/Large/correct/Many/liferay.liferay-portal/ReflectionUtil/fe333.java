diff --git a/portal-service/src/com/liferay/portal/kernel/util/ReflectionUtil.java b/portal-service/src/com/liferay/portal/kernel/util/ReflectionUtil.java
index fa8ffcd..5c1b9a0 100644
--- a/portal-service/src/com/liferay/portal/kernel/util/ReflectionUtil.java
+++ b/portal-service/src/com/liferay/portal/kernel/util/ReflectionUtil.java
@@ -58,7 +58,7 @@
 		bridge:
 		for (Method currentMethod : clazz.getMethods()) {
 			if (!currentMethod.isBridge() ||
-				name.equals(currentMethod.getName())) {
+				!name.equals(currentMethod.getName())) {
 
 				continue;
 			}
