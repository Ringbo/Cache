diff --git a/spring-batch-infrastructure/src/main/java/org/springframework/batch/support/MethodInvokerUtils.java b/spring-batch-infrastructure/src/main/java/org/springframework/batch/support/MethodInvokerUtils.java
index 55811f8..063a7a3 100644
--- a/spring-batch-infrastructure/src/main/java/org/springframework/batch/support/MethodInvokerUtils.java
+++ b/spring-batch-infrastructure/src/main/java/org/springframework/batch/support/MethodInvokerUtils.java
@@ -70,7 +70,7 @@
 	 * @return String
 	 */
 	public static String getParamTypesString(Class<?>... paramTypes) {
-		StringBuffer paramTypesList = new StringBuffer("(");
+		StringBuilder paramTypesList = new StringBuilder("(");
 		for (int i = 0; i < paramTypes.length; i++) {
 			paramTypesList.append(paramTypes[i].getSimpleName());
 			if (i + 1 < paramTypes.length) {
