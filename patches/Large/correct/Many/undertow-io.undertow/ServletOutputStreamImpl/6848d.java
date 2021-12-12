diff --git a/servlet/src/main/java/io/undertow/servlet/spec/ServletOutputStreamImpl.java b/servlet/src/main/java/io/undertow/servlet/spec/ServletOutputStreamImpl.java
index a8a4c14..375563f 100644
--- a/servlet/src/main/java/io/undertow/servlet/spec/ServletOutputStreamImpl.java
+++ b/servlet/src/main/java/io/undertow/servlet/spec/ServletOutputStreamImpl.java
@@ -745,7 +745,7 @@
         if (listener != null) {
             throw UndertowServletMessages.MESSAGES.listenerAlreadySet();
         }
-        final ServletRequest servletRequest = servletRequestContext.getServletRequest();
+        final ServletRequest servletRequest = servletRequestContext.getOriginalRequest();
         if (!servletRequest.isAsyncStarted()) {
             throw UndertowServletMessages.MESSAGES.asyncNotStarted();
         }
