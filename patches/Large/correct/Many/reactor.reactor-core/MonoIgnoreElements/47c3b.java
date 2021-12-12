diff --git a/src/main/java/reactor/core/publisher/MonoIgnoreElements.java b/src/main/java/reactor/core/publisher/MonoIgnoreElements.java
index 776c4fe..7a4b898 100644
--- a/src/main/java/reactor/core/publisher/MonoIgnoreElements.java
+++ b/src/main/java/reactor/core/publisher/MonoIgnoreElements.java
@@ -28,7 +28,7 @@
  * @author Stephane Maldini
  * @since 2.5
  */
-public final class MonoIgnoreElements<IN> extends Mono<Void> implements ReactiveState.Upstream {
+public final class MonoIgnoreElements<IN> extends Mono<IN> implements ReactiveState.Upstream {
 
 	private final Publisher<IN> source;
 
@@ -42,13 +42,13 @@
 	}
 
 	@Override
-	public void subscribe(Subscriber<? super Void> subscriber) {
+	public void subscribe(Subscriber<? super IN> subscriber) {
 		source.subscribe(new CompletableBarrier<>(subscriber));
 	}
 
-	private static class CompletableBarrier<IN> extends SubscriberBarrier<IN, Void> {
+	private static class CompletableBarrier<IN> extends SubscriberBarrier<IN, IN> {
 
-		public CompletableBarrier(Subscriber<? super Void> subscriber) {
+		public CompletableBarrier(Subscriber<? super IN> subscriber) {
 			super(subscriber);
 		}
 
