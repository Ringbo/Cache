diff --git a/acra-limiter/src/main/java/org/acra/config/LimiterData.java b/acra-limiter/src/main/java/org/acra/config/LimiterData.java
index ce87635..6aad622 100644
--- a/acra-limiter/src/main/java/org/acra/config/LimiterData.java
+++ b/acra-limiter/src/main/java/org/acra/config/LimiterData.java
@@ -80,7 +80,7 @@
             put(KEY_STACK_TRACE, stacktrace);
             final int index = stacktrace.indexOf('\n');
             final String firstLine = index == -1 ? stacktrace : stacktrace.substring(0, index);
-            final int index2 = stacktrace.indexOf(':');
+            final int index2 = firstLine.indexOf(':');
             final String className = index2 == -1 ? firstLine : firstLine.substring(0, index2);
             try {
                 Class.forName(className);
