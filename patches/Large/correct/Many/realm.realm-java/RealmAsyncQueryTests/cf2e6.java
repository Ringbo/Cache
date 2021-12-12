diff --git a/realm/realm-library/src/androidTest/java/io/realm/RealmAsyncQueryTests.java b/realm/realm-library/src/androidTest/java/io/realm/RealmAsyncQueryTests.java
index 1c6b78e..e61a93c 100644
--- a/realm/realm-library/src/androidTest/java/io/realm/RealmAsyncQueryTests.java
+++ b/realm/realm-library/src/androidTest/java/io/realm/RealmAsyncQueryTests.java
@@ -1125,7 +1125,7 @@
             public boolean onInterceptInMessage(int what) {
                 switch (what) {
                     case HandlerControllerConstants.COMPLETED_ASYNC_REALM_RESULTS: {
-                        if (numberOfIntercept.incrementAndGet() == 1) {
+                        if (numberOfIntercept.incrementAndGet() == 2 /* 2 queries are both completed */) {
                             // 6. The first time the async queries complete we start an update from
                             // another background thread. This will cause queries to rerun when the
                             // background thread notifies this thread.
