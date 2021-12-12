diff --git a/src/main/java/io/github/robwin/retry/internal/RetryContext.java b/src/main/java/io/github/robwin/retry/internal/RetryContext.java
index 6709e28..01bf481 100644
--- a/src/main/java/io/github/robwin/retry/internal/RetryContext.java
+++ b/src/main/java/io/github/robwin/retry/internal/RetryContext.java
@@ -77,7 +77,7 @@
 
     private void throwOrSleepAfterException() throws Exception {
         int currentNumOfAttempts = numOfAttempts.incrementAndGet();
-        if(currentNumOfAttempts == maxAttempts){
+        if(currentNumOfAttempts >= maxAttempts){
             Exception throwable = lastException.get();
             publishRetryEvent(() -> new RetryOnErrorEvent(getId(), currentNumOfAttempts, throwable));
             throw throwable;
@@ -88,7 +88,7 @@
 
     public void throwOrSleepAfterRuntimeException(){
         int currentNumOfAttempts = numOfAttempts.incrementAndGet();
-        if(currentNumOfAttempts == maxAttempts){
+        if(currentNumOfAttempts >= maxAttempts){
             RuntimeException throwable = lastRuntimeException.get();
             publishRetryEvent(() -> new RetryOnErrorEvent(getId(), currentNumOfAttempts, throwable));
             throw throwable;
