diff --git a/src/main/java/io/reactivex/internal/operators/observable/ObservableOnErrorNext.java b/src/main/java/io/reactivex/internal/operators/observable/ObservableOnErrorNext.java
index 37ec7bd..de7a133 100644
--- a/src/main/java/io/reactivex/internal/operators/observable/ObservableOnErrorNext.java
+++ b/src/main/java/io/reactivex/internal/operators/observable/ObservableOnErrorNext.java
@@ -91,7 +91,7 @@
                 p = nextSupplier.apply(t);
             } catch (Throwable e) {
                 Exceptions.throwIfFatal(e);
-                actual.onError(new CompositeException(e, t));
+                actual.onError(new CompositeException(t, e));
                 return;
             }
 
