diff --git a/java/org/apache/catalina/core/AsyncContextImpl.java b/java/org/apache/catalina/core/AsyncContextImpl.java
index 16cb8f2..722b752 100644
--- a/java/org/apache/catalina/core/AsyncContextImpl.java
+++ b/java/org/apache/catalina/core/AsyncContextImpl.java
@@ -395,7 +395,7 @@
                 try {
                     listener.fireOnError(errorEvent);
                 } catch (Throwable t2) {
-                    ExceptionUtils.handleThrowable(t);
+                    ExceptionUtils.handleThrowable(t2);
                     log.warn("onError() failed for listener of type [" +
                             listener.getClass().getName() + "]", t2);
                 }
