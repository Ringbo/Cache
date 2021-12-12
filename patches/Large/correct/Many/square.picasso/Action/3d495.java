diff --git a/picasso/src/main/java/com/squareup/picasso/Action.java b/picasso/src/main/java/com/squareup/picasso/Action.java
index 9974a64..f08f7c6 100644
--- a/picasso/src/main/java/com/squareup/picasso/Action.java
+++ b/picasso/src/main/java/com/squareup/picasso/Action.java
@@ -22,10 +22,10 @@
 import java.lang.ref.WeakReference;
 
 abstract class Action<T> {
-  static class RequestWeakReference<T> extends WeakReference<T> {
+  static class RequestWeakReference<M> extends WeakReference<M> {
     final Action action;
 
-    public RequestWeakReference(Action action, T referent, ReferenceQueue<? super T> q) {
+    public RequestWeakReference(Action action, M referent, ReferenceQueue<? super M> q) {
       super(referent, q);
       this.action = action;
     }
