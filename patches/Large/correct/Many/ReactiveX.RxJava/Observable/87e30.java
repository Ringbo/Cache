diff --git a/rxjava-core/src/main/java/rx/Observable.java b/rxjava-core/src/main/java/rx/Observable.java
index fecc5c4..f643192 100644
--- a/rxjava-core/src/main/java/rx/Observable.java
+++ b/rxjava-core/src/main/java/rx/Observable.java
@@ -4895,7 +4895,7 @@
                         @Override
                         public void run() {
                             try {
-                                observer.onError(new RuntimeException("failure"));
+                                observer.onError(new Error("failure"));
                             } catch (Throwable e) {
                                 // without an onError handler it has to just throw on whatever thread invokes it
                                 exception.set(e);
