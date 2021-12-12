diff --git a/src/main/java/io/reactivex/internal/operators/observable/ObservableUsing.java b/src/main/java/io/reactivex/internal/operators/observable/ObservableUsing.java
index 62724f2..9e38818 100644
--- a/src/main/java/io/reactivex/internal/operators/observable/ObservableUsing.java
+++ b/src/main/java/io/reactivex/internal/operators/observable/ObservableUsing.java
@@ -60,7 +60,7 @@
                 disposer.accept(resource);
             } catch (Throwable ex) {
                 Exceptions.throwIfFatal(ex);
-                EmptyDisposable.error(new CompositeException(ex, e), s);
+                EmptyDisposable.error(new CompositeException(e, ex), s);
                 return;
             }
             EmptyDisposable.error(e, s);
@@ -111,7 +111,7 @@
                         disposer.accept(resource);
                     } catch (Throwable e) {
                         Exceptions.throwIfFatal(e);
-                        t = new CompositeException(e, t);
+                        t = new CompositeException(t, e);
                     }
                 }
 
