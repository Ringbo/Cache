diff --git a/cas-server-webapp-throttle/src/main/java/org/jasig/cas/web/support/AbstractInMemoryThrottledSubmissionHandlerInterceptorAdapter.java b/cas-server-webapp-throttle/src/main/java/org/jasig/cas/web/support/AbstractInMemoryThrottledSubmissionHandlerInterceptorAdapter.java
index 202dbf6..679435b 100644
--- a/cas-server-webapp-throttle/src/main/java/org/jasig/cas/web/support/AbstractInMemoryThrottledSubmissionHandlerInterceptorAdapter.java
+++ b/cas-server-webapp-throttle/src/main/java/org/jasig/cas/web/support/AbstractInMemoryThrottledSubmissionHandlerInterceptorAdapter.java
@@ -129,7 +129,7 @@
                     .withIdentity(this.getClass().getSimpleName().concat(UUID.randomUUID().toString()))
                     .startAt(DateTimeUtils.dateOf(ZonedDateTime.now(ZoneOffset.UTC).plus(this.startDelay, ChronoUnit.MILLIS)))
                     .withSchedule(SimpleScheduleBuilder.simpleSchedule()
-                        .withIntervalInMinutes(this.refreshInterval)
+                        .withIntervalInMilliseconds(this.refreshInterval)
                         .repeatForever()).build();
 
                 logger.debug("Scheduling {} job", this.getClass().getName());
