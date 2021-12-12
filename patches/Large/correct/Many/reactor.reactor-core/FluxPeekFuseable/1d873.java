diff --git a/src/main/java/reactor/core/publisher/FluxPeekFuseable.java b/src/main/java/reactor/core/publisher/FluxPeekFuseable.java
index bd3973b..b6ac29c 100644
--- a/src/main/java/reactor/core/publisher/FluxPeekFuseable.java
+++ b/src/main/java/reactor/core/publisher/FluxPeekFuseable.java
@@ -41,7 +41,8 @@
 /**
  * @see <a href="https://github.com/reactor/reactive-streams-commons">Reactive-Streams-Commons</a>
  */
-final class FluxPeekFuseable<T> extends FluxSource<T, T> implements Fuseable, FluxPeekHelper<T> {
+final class FluxPeekFuseable<T> extends FluxSource<T, T> implements Fuseable,
+                                                                    PublisherPeek<T> {
 
 	final Consumer<? super Subscription> onSubscribeCall;
 
@@ -90,7 +91,7 @@
 
 		final Subscriber<? super T> actual;
 
-		final FluxPeekHelper<T> parent;
+		final PublisherPeek<T> parent;
 
 		QueueSubscription<T> s;
 
@@ -98,7 +99,7 @@
 
 		boolean done;
 
-		public PeekFuseableSubscriber(Subscriber<? super T> actual, FluxPeekHelper<T> parent) {
+		public PeekFuseableSubscriber(Subscriber<? super T> actual, PublisherPeek<T> parent) {
 			this.actual = actual;
 			this.parent = parent;
 		}
@@ -298,7 +299,7 @@
 
 		final ConditionalSubscriber<? super T> actual;
 
-		final FluxPeekHelper<T> parent;
+		final PublisherPeek<T> parent;
 
 		QueueSubscription<T> s;
 
@@ -306,7 +307,7 @@
 
 		boolean done;
 
-		public PeekFuseableConditionalSubscriber(ConditionalSubscriber<? super T> actual, FluxPeekHelper<T> parent) {
+		public PeekFuseableConditionalSubscriber(ConditionalSubscriber<? super T> actual, PublisherPeek<T> parent) {
 			this.actual = actual;
 			this.parent = parent;
 		}
@@ -557,13 +558,13 @@
 
 		final ConditionalSubscriber<? super T> actual;
 
-		final FluxPeekHelper<T> parent;
+		final PublisherPeek<T> parent;
 
 		Subscription s;
 
 		boolean done;
 
-		public PeekConditionalSubscriber(ConditionalSubscriber<? super T> actual, FluxPeekHelper<T> parent) {
+		public PeekConditionalSubscriber(ConditionalSubscriber<? super T> actual, PublisherPeek<T> parent) {
 			this.actual = actual;
 			this.parent = parent;
 		}
