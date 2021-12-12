diff --git a/hystrix-core/src/main/java/com/netflix/hystrix/HystrixCommand.java b/hystrix-core/src/main/java/com/netflix/hystrix/HystrixCommand.java
index 83a50ed..e3bd99d 100755
--- a/hystrix-core/src/main/java/com/netflix/hystrix/HystrixCommand.java
+++ b/hystrix-core/src/main/java/com/netflix/hystrix/HystrixCommand.java
@@ -834,10 +834,10 @@
         }
 
         // error handling
-        o = o.onErrorResumeNext(new Func1<Exception, Observable<R>>() {
+        o = o.onErrorResumeNext(new Func1<Throwable, Observable<R>>() {
 
             @Override
-            public Observable<R> call(Exception e) {
+            public Observable<R> call(Throwable e) {
                 // count that we are throwing an exception and re-throw it
                 metrics.markExceptionThrown();
                 return Observable.error(e);
