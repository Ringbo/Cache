diff --git a/api/cas-server-core-api-throttle/src/main/java/org/apereo/cas/web/support/ThrottledSubmissionHandlerInterceptor.java b/api/cas-server-core-api-throttle/src/main/java/org/apereo/cas/web/support/ThrottledSubmissionHandlerInterceptor.java
index 39cdca1..bba70d5 100644
--- a/api/cas-server-core-api-throttle/src/main/java/org/apereo/cas/web/support/ThrottledSubmissionHandlerInterceptor.java
+++ b/api/cas-server-core-api-throttle/src/main/java/org/apereo/cas/web/support/ThrottledSubmissionHandlerInterceptor.java
@@ -63,13 +63,13 @@
 
     @Override
     default void afterConcurrentHandlingStarted(final HttpServletRequest httpServletRequest,
-                                                final HttpServletResponse httpServletResponse, final Object o) {
+                                                final HttpServletResponse httpServletResponse, final Object o) throws Exception {
     }
 
     @Override
     default void afterCompletion(final HttpServletRequest httpServletRequest,
                                  final HttpServletResponse httpServletResponse,
                                  final Object o,
-                                 final Exception e) {
+                                 final Exception e) throws Exception {
     }
 }
