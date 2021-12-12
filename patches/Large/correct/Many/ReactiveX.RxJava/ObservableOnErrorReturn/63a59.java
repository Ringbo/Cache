diff --git a/src/main/java/io/reactivex/internal/operators/observable/ObservableOnErrorReturn.java b/src/main/java/io/reactivex/internal/operators/observable/ObservableOnErrorReturn.java
index 9f5cc8b..6599f71 100644
--- a/src/main/java/io/reactivex/internal/operators/observable/ObservableOnErrorReturn.java
+++ b/src/main/java/io/reactivex/internal/operators/observable/ObservableOnErrorReturn.java
@@ -73,7 +73,7 @@
                 v = valueSupplier.apply(t);
             } catch (Throwable e) {
                 Exceptions.throwIfFatal(e);
-                actual.onError(new CompositeException(e, t));
+                actual.onError(new CompositeException(t, e));
                 return;
             }
 
