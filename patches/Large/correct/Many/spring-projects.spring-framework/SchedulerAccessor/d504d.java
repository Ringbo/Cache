diff --git a/spring-context-support/src/main/java/org/springframework/scheduling/quartz/SchedulerAccessor.java b/spring-context-support/src/main/java/org/springframework/scheduling/quartz/SchedulerAccessor.java
index 4766167..b2705d2 100644
--- a/spring-context-support/src/main/java/org/springframework/scheduling/quartz/SchedulerAccessor.java
+++ b/spring-context-support/src/main/java/org/springframework/scheduling/quartz/SchedulerAccessor.java
@@ -52,7 +52,7 @@
  * <p>For concrete usage, check out the {@link SchedulerFactoryBean} and
  * {@link SchedulerAccessorBean} classes.
  *
- * <p>Compatible with Quartz 1.8 as well as Quartz 2.0/2.1, as of Spring 4.0.
+ * <p>Compatible with Quartz 1.8 as well as Quartz 2.0-2.2, as of Spring 4.0.
  *
  * @author Juergen Hoeller
  * @since 2.5.6
@@ -383,7 +383,7 @@
 		else {
 			try {
 				Map jobDataMap = (Map) ReflectionUtils.invokeMethod(Trigger.class.getMethod("getJobDataMap"), trigger);
-				return (JobDetail) jobDataMap.get(JobDetailAwareTrigger.JOB_DETAIL_KEY);
+				return (JobDetail) jobDataMap.remove(JobDetailAwareTrigger.JOB_DETAIL_KEY);
 			}
 			catch (NoSuchMethodException ex) {
 				throw new IllegalStateException("Inconsistent Quartz API: " + ex);
