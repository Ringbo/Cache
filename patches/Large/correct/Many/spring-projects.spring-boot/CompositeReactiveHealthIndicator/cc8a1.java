diff --git a/spring-boot-actuator/src/main/java/org/springframework/boot/actuate/health/CompositeReactiveHealthIndicator.java b/spring-boot-actuator/src/main/java/org/springframework/boot/actuate/health/CompositeReactiveHealthIndicator.java
index 0036dd3..e6c472a 100644
--- a/spring-boot-actuator/src/main/java/org/springframework/boot/actuate/health/CompositeReactiveHealthIndicator.java
+++ b/spring-boot-actuator/src/main/java/org/springframework/boot/actuate/health/CompositeReactiveHealthIndicator.java
@@ -94,7 +94,7 @@
 	public Mono<Health> health() {
 		return Flux.fromIterable(this.indicators.entrySet())
 				.flatMap((entry) -> Mono.just(entry.getKey())
-						.and(entry.getValue().health().compose(this.timeoutCompose)))
+						.zipWith(entry.getValue().health().compose(this.timeoutCompose)))
 				.collectMap(Tuple2::getT1, Tuple2::getT2)
 				.map(this.healthAggregator::aggregate);
 	}
