diff --git a/presto-hive/src/main/java/com/facebook/presto/hive/RetryDriver.java b/presto-hive/src/main/java/com/facebook/presto/hive/RetryDriver.java
index a44b945..ff70f99 100644
--- a/presto-hive/src/main/java/com/facebook/presto/hive/RetryDriver.java
+++ b/presto-hive/src/main/java/com/facebook/presto/hive/RetryDriver.java
@@ -32,7 +32,7 @@
     private static final Duration DEFAULT_MAX_RETRY_TIME = Duration.valueOf("30s");
     private static final double DEFAULT_SCALE_FACTOR = 2.0;
 
-    private final int maxRetryAttempts;
+    private final int maxAttempts;
     private final Duration minSleepTime;
     private final Duration maxSleepTime;
     private final double scaleFactor;
@@ -40,14 +40,14 @@
     private final List<Class<? extends Exception>> exceptionWhiteList;
 
     private RetryDriver(
-            int maxRetryAttempts,
+            int maxAttempts,
             Duration minSleepTime,
             Duration maxSleepTime,
             double scaleFactor,
             Duration maxRetryTime,
             List<Class<? extends Exception>> exceptionWhiteList)
     {
-        this.maxRetryAttempts = maxRetryAttempts;
+        this.maxAttempts = maxAttempts;
         this.minSleepTime = minSleepTime;
         this.maxSleepTime = maxSleepTime;
         this.scaleFactor = scaleFactor;
@@ -77,7 +77,7 @@
 
     public final RetryDriver exponentialBackoff(Duration minSleepTime, Duration maxSleepTime, Duration maxRetryTime, double scaleFactor)
     {
-        return new RetryDriver(maxRetryAttempts, minSleepTime, maxSleepTime, scaleFactor, maxRetryTime, exceptionWhiteList);
+        return new RetryDriver(maxAttempts, minSleepTime, maxSleepTime, scaleFactor, maxRetryTime, exceptionWhiteList);
     }
 
     @SafeVarargs
@@ -89,7 +89,7 @@
                 .addAll(Arrays.asList(classes))
                 .build();
 
-        return new RetryDriver(maxRetryAttempts, minSleepTime, maxSleepTime, scaleFactor, maxRetryTime, exceptions);
+        return new RetryDriver(maxAttempts, minSleepTime, maxSleepTime, scaleFactor, maxRetryTime, exceptions);
     }
 
     public RetryDriver stopOnIllegalExceptions()
@@ -116,7 +116,7 @@
                         throw e;
                     }
                 }
-                if (attempt >= maxRetryAttempts || Duration.nanosSince(startTime).compareTo(maxRetryTime) >= 0) {
+                if (attempt >= maxAttempts || Duration.nanosSince(startTime).compareTo(maxRetryTime) >= 0) {
                     throw e;
                 }
                 log.debug("Failed on executing %s with attempt %d, will retry. Exception: %s", callableName, attempt, e.getMessage());
