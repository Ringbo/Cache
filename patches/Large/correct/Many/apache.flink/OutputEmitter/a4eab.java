diff --git a/pact/pact-runtime/src/main/java/eu/stratosphere/pact/runtime/task/util/OutputEmitter.java b/pact/pact-runtime/src/main/java/eu/stratosphere/pact/runtime/task/util/OutputEmitter.java
index 664f316..da045ea 100644
--- a/pact/pact-runtime/src/main/java/eu/stratosphere/pact/runtime/task/util/OutputEmitter.java
+++ b/pact/pact-runtime/src/main/java/eu/stratosphere/pact/runtime/task/util/OutputEmitter.java
@@ -85,7 +85,7 @@
 	 */
 	public OutputEmitter(ShipStrategy strategy, byte[] salt) {
 		if (strategy != ShipStrategy.BROADCAST && strategy != ShipStrategy.PARTITION_HASH
-				&& strategy != ShipStrategy.NONE)
+				&& strategy != ShipStrategy.FORWARD)
 		{
 			throw new UnsupportedOperationException("Unsupported distribution strategy: " + strategy.name());
 		}
@@ -108,7 +108,7 @@
 			return broadcast(numberOfChannels);
 		case PARTITION_HASH:
 			return partition(pair, numberOfChannels);
-		case NONE:
+		case FORWARD:
 			return robin(numberOfChannels);
 		default:
 			throw new UnsupportedOperationException();
