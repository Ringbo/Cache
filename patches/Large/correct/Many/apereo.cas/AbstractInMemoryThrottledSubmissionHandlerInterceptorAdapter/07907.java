diff --git a/cas-server-webapp-throttle/src/main/java/org/jasig/cas/web/support/AbstractInMemoryThrottledSubmissionHandlerInterceptorAdapter.java b/cas-server-webapp-throttle/src/main/java/org/jasig/cas/web/support/AbstractInMemoryThrottledSubmissionHandlerInterceptorAdapter.java
index ceeecb7..5ea50d3 100644
--- a/cas-server-webapp-throttle/src/main/java/org/jasig/cas/web/support/AbstractInMemoryThrottledSubmissionHandlerInterceptorAdapter.java
+++ b/cas-server-webapp-throttle/src/main/java/org/jasig/cas/web/support/AbstractInMemoryThrottledSubmissionHandlerInterceptorAdapter.java
@@ -105,7 +105,7 @@
      *
      * @return  Instantaneous submission rate in submissions/sec, e.g. {@code a - b}.
      */
-    private double submissionRate(final Date a, final Date b) {
+    private static double submissionRate(final Date a, final Date b) {
         return SUBMISSION_RATE_DIVIDEND / (a.getTime() - b.getTime());
     }
 
