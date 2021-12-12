diff --git a/src/main/java/io/reactivex/internal/operators/flowable/FlowableRetryPredicate.java b/src/main/java/io/reactivex/internal/operators/flowable/FlowableRetryPredicate.java
index 2c65e0c..100e110 100644
--- a/src/main/java/io/reactivex/internal/operators/flowable/FlowableRetryPredicate.java
+++ b/src/main/java/io/reactivex/internal/operators/flowable/FlowableRetryPredicate.java
@@ -84,7 +84,7 @@
                     b = predicate.test(t);
                 } catch (Throwable e) {
                     Exceptions.throwIfFatal(e);
-                    actual.onError(new CompositeException(e, t));
+                    actual.onError(new CompositeException(t, e));
                     return;
                 }
                 if (!b) {
