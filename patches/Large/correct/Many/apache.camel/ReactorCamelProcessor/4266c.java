diff --git a/components/camel-reactor/src/main/java/org/apache/camel/component/reactor/engine/ReactorCamelProcessor.java b/components/camel-reactor/src/main/java/org/apache/camel/component/reactor/engine/ReactorCamelProcessor.java
index 548cace..d3c270f 100644
--- a/components/camel-reactor/src/main/java/org/apache/camel/component/reactor/engine/ReactorCamelProcessor.java
+++ b/components/camel-reactor/src/main/java/org/apache/camel/component/reactor/engine/ReactorCamelProcessor.java
@@ -49,12 +49,11 @@
         this.camelProducer = null;
         this.camelSink = new AtomicReference<>();
 
-
-        // TODO: A emitter processor with buffer-size 0 would be perfect
-        // The effect of having a prefetch of 1 element is that the chain buffers at least 2 elements instead of only one
-        // (one in the FluxSink and one in the EmitterProcessor) when using the "latest" or "oldest" strategy.
-        // This affects slightly the behavior of the backpressure strategy "latest" (but it doesn't change the semantics).
-        this.publisher = EmitterProcessor.create(1);
+        // TODO: The perfect emitter processor would have no buffer (0 sized)
+        // The chain caches one more item than expected.
+        // This implementation has (almost) full control over backpressure, but it's too chatty.
+        // There's a ticket to improve chattiness of the reactive-streams internal impl.
+        this.publisher = EmitterProcessor.create(1, false);
     }
 
     @Override
@@ -76,7 +75,7 @@
             detach();
 
             ReactiveStreamsBackpressureStrategy strategy = producer.getEndpoint().getBackpressureStrategy();
-            Flux<Exchange> flux = Flux.create(camelSink::set);
+            Flux<Exchange> flux = Flux.create(camelSink::set, FluxSink.OverflowStrategy.IGNORE);
 
             if (ObjectHelper.equal(strategy, ReactiveStreamsBackpressureStrategy.OLDEST)) {
                 // signal item emitted for non-dropped items only
