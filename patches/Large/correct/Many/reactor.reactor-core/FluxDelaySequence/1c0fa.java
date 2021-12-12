diff --git a/reactor-core/src/main/java/reactor/core/publisher/FluxDelaySequence.java b/reactor-core/src/main/java/reactor/core/publisher/FluxDelaySequence.java
index 8062723..aa1407f 100644
--- a/reactor-core/src/main/java/reactor/core/publisher/FluxDelaySequence.java
+++ b/reactor-core/src/main/java/reactor/core/publisher/FluxDelaySequence.java
@@ -28,12 +28,12 @@
  * @author Simon Baslé
  */
 //adapted from RxJava2 FlowableDelay: https://github.com/ReactiveX/RxJava/blob/2.x/src/main/java/io/reactivex/internal/operators/flowable/FlowableDelay.java
-public final class FluxDelaySequence<T> extends FluxOperator<T, T> {
+final class FluxDelaySequence<T> extends FluxOperator<T, T> {
 
 	final Duration  delay;
 	final Scheduler scheduler;
 
-	public FluxDelaySequence(Flux<T> source, Duration delay, Scheduler scheduler) {
+	FluxDelaySequence(Flux<T> source, Duration delay, Scheduler scheduler) {
 		super(source);
 		this.delay = delay;
 		this.scheduler = scheduler;
