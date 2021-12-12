diff --git a/src/main/java/io/reactivex/internal/operators/observable/ObservableRetryPredicate.java b/src/main/java/io/reactivex/internal/operators/observable/ObservableRetryPredicate.java
index db9870e..c4fc1a7 100644
--- a/src/main/java/io/reactivex/internal/operators/observable/ObservableRetryPredicate.java
+++ b/src/main/java/io/reactivex/internal/operators/observable/ObservableRetryPredicate.java
@@ -82,7 +82,7 @@
                     b = predicate.test(t);
                 } catch (Throwable e) {
                     Exceptions.throwIfFatal(e);
-                    actual.onError(new CompositeException(e, t));
+                    actual.onError(new CompositeException(t, e));
                     return;
                 }
                 if (!b) {
