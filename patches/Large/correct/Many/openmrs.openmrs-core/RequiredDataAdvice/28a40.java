diff --git a/src/api/org/openmrs/aop/RequiredDataAdvice.java b/src/api/org/openmrs/aop/RequiredDataAdvice.java
index d89f00a..dd5a715 100644
--- a/src/api/org/openmrs/aop/RequiredDataAdvice.java
+++ b/src/api/org/openmrs/aop/RequiredDataAdvice.java
@@ -98,7 +98,9 @@
 	public void before(Method method, Object[] args, Object target) throws Throwable {
 		String methodName = method.getName();
 		
-		if (methodName.startsWith("save")) {
+		// the "create" and "update" are in to cover old deprecated methods since AOP doesn't occur
+		// on method calls within a class, only on calls to methods from external classes to methods
+		if (methodName.startsWith("save") || methodName.startsWith("create") || methodName.startsWith("update")) {
 			Object mainArgument = args[0];
 			
 			// fail early on a null parameter
