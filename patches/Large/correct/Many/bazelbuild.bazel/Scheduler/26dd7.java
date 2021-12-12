diff --git a/src/main/java/com/google/devtools/build/skyframe/Scheduler.java b/src/main/java/com/google/devtools/build/skyframe/Scheduler.java
index f05860f..a3da7c8 100644
--- a/src/main/java/com/google/devtools/build/skyframe/Scheduler.java
+++ b/src/main/java/com/google/devtools/build/skyframe/Scheduler.java
@@ -42,7 +42,7 @@
     private final SkyKey failedValue;
     private final ErrorInfo errorInfo;
 
-    private SchedulerException(@Nullable Throwable cause, @Nullable ErrorInfo errorInfo,
+    private SchedulerException(@Nullable Exception cause, @Nullable ErrorInfo errorInfo,
         SkyKey failedValue) {
       super(errorInfo != null ? errorInfo.getException() : cause);
       this.errorInfo = errorInfo;
