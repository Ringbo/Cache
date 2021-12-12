diff --git a/logback-classic/src/main/java/ch/qos/logback/classic/pattern/EnsureExceptionHandling.java b/logback-classic/src/main/java/ch/qos/logback/classic/pattern/EnsureExceptionHandling.java
index 14c768f..08c0c53 100644
--- a/logback-classic/src/main/java/ch/qos/logback/classic/pattern/EnsureExceptionHandling.java
+++ b/logback-classic/src/main/java/ch/qos/logback/classic/pattern/EnsureExceptionHandling.java
@@ -43,7 +43,7 @@
     }
     if (!chainHandlesThrowable(head)) {
       Converter<ILoggingEvent> tail = ConverterUtil.findTail(head);
-      Converter<ILoggingEvent> exConverter = new ExtendedThrowableProxyConverter();
+      Converter<ILoggingEvent> exConverter = new ThrowableProxyConverter();
       tail.setNext(exConverter);
     }
   }
