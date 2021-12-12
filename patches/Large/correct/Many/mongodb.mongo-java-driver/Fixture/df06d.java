diff --git a/driver-rx/src/test/functional/com/mongodb/async/rx/client/Fixture.java b/driver-rx/src/test/functional/com/mongodb/async/rx/client/Fixture.java
index 710e03f..581f118 100644
--- a/driver-rx/src/test/functional/com/mongodb/async/rx/client/Fixture.java
+++ b/driver-rx/src/test/functional/com/mongodb/async/rx/client/Fixture.java
@@ -64,10 +64,10 @@
     }
 
     public static <T> T get(final Observable<T> observable, final long waitTime, final TimeUnit timeUnit) {
-        return observable.timeout(waitTime, timeUnit).toBlockingObservable().last();
+        return observable.timeout(waitTime, timeUnit).toBlocking().last();
     }
 
     public static <T> List<T> getAsList(final Observable<T> observable) {
-        return observable.timeout(5, SECONDS).toList().toBlockingObservable().last();
+        return observable.timeout(5, SECONDS).toList().toBlocking().last();
     }
 }
