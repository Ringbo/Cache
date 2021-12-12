diff --git a/rxjava-core/src/main/java/rx/Observable.java b/rxjava-core/src/main/java/rx/Observable.java
index 302990a..a71d6db 100644
--- a/rxjava-core/src/main/java/rx/Observable.java
+++ b/rxjava-core/src/main/java/rx/Observable.java
@@ -4053,7 +4053,7 @@
      * @see <a href="https://github.com/Netflix/RxJava/wiki/Transforming-Observables#wiki-groupby-and-groupbyuntil">RxJava Wiki: groupBy</a>
      */
     public final <K> Observable<GroupedObservable<K, T>> groupBy(final Func1<? super T, ? extends K> keySelector) {
-        return lift(new OnSubscribeGroupBy<K, T>(keySelector));
+        return lift(new OperatorGroupBy<K, T>(keySelector));
     }
 
     /**
@@ -4106,7 +4106,7 @@
      * @see <a href="http://msdn.microsoft.com/en-us/library/hh229433.aspx">MSDN: Observable.GroupByUntil</a>
      */
     public final <TKey, TValue, TDuration> Observable<GroupedObservable<TKey, TValue>> groupByUntil(Func1<? super T, ? extends TKey> keySelector, Func1<? super T, ? extends TValue> valueSelector, Func1<? super GroupedObservable<TKey, TValue>, ? extends Observable<? extends TDuration>> durationSelector) {
-        return lift(new OnSubscribeGroupByUntil<T, TKey, TValue, TDuration>(keySelector, valueSelector, durationSelector));
+        return lift(new OperatorGroupByUntil<T, TKey, TValue, TDuration>(keySelector, valueSelector, durationSelector));
     }
 
     /**
