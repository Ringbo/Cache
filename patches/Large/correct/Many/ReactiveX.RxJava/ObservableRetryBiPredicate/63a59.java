diff --git a/src/main/java/io/reactivex/internal/operators/observable/ObservableRetryBiPredicate.java b/src/main/java/io/reactivex/internal/operators/observable/ObservableRetryBiPredicate.java
index 18ab3e5..14fae28 100644
--- a/src/main/java/io/reactivex/internal/operators/observable/ObservableRetryBiPredicate.java
+++ b/src/main/java/io/reactivex/internal/operators/observable/ObservableRetryBiPredicate.java
@@ -72,7 +72,7 @@
                 b = predicate.test(++retries, t);
             } catch (Throwable e) {
                 Exceptions.throwIfFatal(e);
-                actual.onError(new CompositeException(e, t));
+                actual.onError(new CompositeException(t, e));
                 return;
             }
             if (!b) {
