diff --git a/portal-service/src/com/liferay/portal/kernel/process/ProcessUtil.java b/portal-service/src/com/liferay/portal/kernel/process/ProcessUtil.java
index bea13be..3403d8d 100644
--- a/portal-service/src/com/liferay/portal/kernel/process/ProcessUtil.java
+++ b/portal-service/src/com/liferay/portal/kernel/process/ProcessUtil.java
@@ -124,7 +124,7 @@
 					0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, true,
 					Integer.MAX_VALUE, new AbortPolicy(),
 					new NamedThreadFactory(
-						ProcessExecutor.class.getName(), Thread.MIN_PRIORITY,
+						ProcessUtil.class.getName(), Thread.MIN_PRIORITY,
 						PortalClassLoaderUtil.getClassLoader()),
 					new ThreadPoolHandlerAdapter());
 			}
