diff --git a/src/main/java/io/reactivex/internal/operators/flowable/FlowableOnErrorReturn.java b/src/main/java/io/reactivex/internal/operators/flowable/FlowableOnErrorReturn.java
index 02e24f0..dc7cb90 100644
--- a/src/main/java/io/reactivex/internal/operators/flowable/FlowableOnErrorReturn.java
+++ b/src/main/java/io/reactivex/internal/operators/flowable/FlowableOnErrorReturn.java
@@ -85,7 +85,7 @@
             } catch (Throwable e) {
                 Exceptions.throwIfFatal(e);
                 state.lazySet(HAS_REQUEST_HAS_VALUE);
-                actual.onError(new CompositeException(e, t));
+                actual.onError(new CompositeException(t, e));
                 return;
             }
 
