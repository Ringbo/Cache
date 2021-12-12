diff --git a/javamelody-core/src/test/java/net/bull/javamelody/TestMonitoringSpringInterceptor.java b/javamelody-core/src/test/java/net/bull/javamelody/TestMonitoringSpringInterceptor.java
index 6f047ac..5d46490 100644
--- a/javamelody-core/src/test/java/net/bull/javamelody/TestMonitoringSpringInterceptor.java
+++ b/javamelody-core/src/test/java/net/bull/javamelody/TestMonitoringSpringInterceptor.java
@@ -330,7 +330,8 @@
 		assertNotNull("methodMatcher", pointcut.getMethodMatcher());
 		assertFalse("methodMatcher.isRuntime", pointcut.getMethodMatcher().isRuntime());
 		try {
-			assertFalse("methodMatcher.matches", pointcut.getMethodMatcher().matches(null, null));
+			assertFalse("methodMatcher.matches",
+					pointcut.getMethodMatcher().matches(null, null, (Object[]) null));
 		} catch (final UnsupportedOperationException e) {
 			assertNotNull("ok", e);
 		}
