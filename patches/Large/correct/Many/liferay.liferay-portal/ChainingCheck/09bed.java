diff --git a/modules/util/source-formatter/src/main/java/com/liferay/source/formatter/checkstyle/checks/ChainingCheck.java b/modules/util/source-formatter/src/main/java/com/liferay/source/formatter/checkstyle/checks/ChainingCheck.java
index 43f7864..b2f73a6 100644
--- a/modules/util/source-formatter/src/main/java/com/liferay/source/formatter/checkstyle/checks/ChainingCheck.java
+++ b/modules/util/source-formatter/src/main/java/com/liferay/source/formatter/checkstyle/checks/ChainingCheck.java
@@ -126,7 +126,7 @@
 
 				if (variableType != null) {
 					for (String allowedClassName : _allowedClassNames) {
-						if (classOrVariableName.matches(allowedClassName)) {
+						if (variableType.matches(allowedClassName)) {
 							continue outerLoop;
 						}
 					}
