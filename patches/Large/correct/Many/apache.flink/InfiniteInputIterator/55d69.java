diff --git a/pact/pact-runtime/src/test/java/eu/stratosphere/pact/runtime/test/util/InfiniteInputIterator.java b/pact/pact-runtime/src/test/java/eu/stratosphere/pact/runtime/test/util/InfiniteInputIterator.java
index ec46c3d..4d05afb 100644
--- a/pact/pact-runtime/src/test/java/eu/stratosphere/pact/runtime/test/util/InfiniteInputIterator.java
+++ b/pact/pact-runtime/src/test/java/eu/stratosphere/pact/runtime/test/util/InfiniteInputIterator.java
@@ -30,7 +30,7 @@
 	@Override
 	public boolean next(PactRecord target) {
 		target.setField(0, val1);
-		target.setField(0, val2);
+		target.setField(1, val2);
 		return true;
 	}
 }
