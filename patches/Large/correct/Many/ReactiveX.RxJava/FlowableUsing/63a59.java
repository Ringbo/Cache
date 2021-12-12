diff --git a/src/main/java/io/reactivex/internal/operators/flowable/FlowableUsing.java b/src/main/java/io/reactivex/internal/operators/flowable/FlowableUsing.java
index b8bfa6d..4532085 100644
--- a/src/main/java/io/reactivex/internal/operators/flowable/FlowableUsing.java
+++ b/src/main/java/io/reactivex/internal/operators/flowable/FlowableUsing.java
@@ -61,7 +61,7 @@
                 disposer.accept(resource);
             } catch (Throwable ex) {
                 Exceptions.throwIfFatal(ex);
-                EmptySubscription.error(new CompositeException(ex, e), s);
+                EmptySubscription.error(new CompositeException(e, ex), s);
                 return;
             }
             EmptySubscription.error(e, s);
@@ -119,7 +119,7 @@
 
                 s.cancel();
                 if (innerError != null) {
-                    actual.onError(new CompositeException(innerError, t));
+                    actual.onError(new CompositeException(t, innerError));
                 } else {
                     actual.onError(t);
                 }
