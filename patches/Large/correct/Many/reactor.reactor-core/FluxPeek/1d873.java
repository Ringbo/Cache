diff --git a/src/main/java/reactor/core/publisher/FluxPeek.java b/src/main/java/reactor/core/publisher/FluxPeek.java
index 017703c..f5772fe 100644
--- a/src/main/java/reactor/core/publisher/FluxPeek.java
+++ b/src/main/java/reactor/core/publisher/FluxPeek.java
@@ -44,7 +44,7 @@
 /**
  * @see <a href="https://github.com/reactor/reactive-streams-commons">Reactive-Streams-Commons</a>
  */
-final class FluxPeek<T> extends FluxSource<T, T> implements FluxPeekHelper<T> {
+final class FluxPeek<T> extends FluxSource<T, T> implements PublisherPeek<T> {
 
 	final Consumer<? super Subscription> onSubscribeCall;
 
@@ -96,13 +96,13 @@
 
 		final Subscriber<? super T> actual;
 
-		final FluxPeekHelper<T> parent;
+		final PublisherPeek<T> parent;
 
 		Subscription s;
 
 		boolean done;
 
-		public PeekSubscriber(Subscriber<? super T> actual, FluxPeekHelper<T> parent) {
+		public PeekSubscriber(Subscriber<? super T> actual, PublisherPeek<T> parent) {
 			this.actual = actual;
 			this.parent = parent;
 		}
