diff --git a/src/main/java/io/reactivex/internal/operators/observable/ObservableDistinct.java b/src/main/java/io/reactivex/internal/operators/observable/ObservableDistinct.java
index dde1d3c..d1317f1 100644
--- a/src/main/java/io/reactivex/internal/operators/observable/ObservableDistinct.java
+++ b/src/main/java/io/reactivex/internal/operators/observable/ObservableDistinct.java
@@ -194,7 +194,7 @@
                 predicate.test(null); // special case: poison pill
             } catch (Throwable e) {
                 Exceptions.throwIfFatal(e);
-                actual.onError(new CompositeException(e, t));
+                actual.onError(new CompositeException(t, e));
                 return;
             }
             actual.onError(t);
