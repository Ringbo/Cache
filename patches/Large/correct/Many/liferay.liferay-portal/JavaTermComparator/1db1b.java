diff --git a/portal-impl/src/com/liferay/portal/tools/comparator/JavaTermComparator.java b/portal-impl/src/com/liferay/portal/tools/comparator/JavaTermComparator.java
index 76dd979..e6424f5 100644
--- a/portal-impl/src/com/liferay/portal/tools/comparator/JavaTermComparator.java
+++ b/portal-impl/src/com/liferay/portal/tools/comparator/JavaTermComparator.java
@@ -73,7 +73,7 @@
 		List<String> parameterTypes1 = javaTerm1.getParameterTypes();
 
 		if (parameterTypes1.isEmpty()) {
-			return 1;
+			return -1;
 		}
 
 		for (int i = 0; i < parameterTypes1.size(); i++) {
