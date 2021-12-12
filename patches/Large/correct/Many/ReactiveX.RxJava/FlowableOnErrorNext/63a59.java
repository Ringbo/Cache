diff --git a/src/main/java/io/reactivex/internal/operators/flowable/FlowableOnErrorNext.java b/src/main/java/io/reactivex/internal/operators/flowable/FlowableOnErrorNext.java
index 7f896a8..e8d3b2b 100644
--- a/src/main/java/io/reactivex/internal/operators/flowable/FlowableOnErrorNext.java
+++ b/src/main/java/io/reactivex/internal/operators/flowable/FlowableOnErrorNext.java
@@ -94,7 +94,7 @@
                 p = nextSupplier.apply(t);
             } catch (Throwable e) {
                 Exceptions.throwIfFatal(e);
-                actual.onError(new CompositeException(e, t));
+                actual.onError(new CompositeException(t, e));
                 return;
             }
 
