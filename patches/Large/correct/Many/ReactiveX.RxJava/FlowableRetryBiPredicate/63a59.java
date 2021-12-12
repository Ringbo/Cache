diff --git a/src/main/java/io/reactivex/internal/operators/flowable/FlowableRetryBiPredicate.java b/src/main/java/io/reactivex/internal/operators/flowable/FlowableRetryBiPredicate.java
index 1da6d9f..043d950 100644
--- a/src/main/java/io/reactivex/internal/operators/flowable/FlowableRetryBiPredicate.java
+++ b/src/main/java/io/reactivex/internal/operators/flowable/FlowableRetryBiPredicate.java
@@ -74,7 +74,7 @@
                 b = predicate.test(++retries, t);
             } catch (Throwable e) {
                 Exceptions.throwIfFatal(e);
-                actual.onError(new CompositeException(e, t));
+                actual.onError(new CompositeException(t, e));
                 return;
             }
             if (!b) {
