diff --git a/src/protocol/http/org/apache/jmeter/protocol/http/sampler/HTTPSampler.java b/src/protocol/http/org/apache/jmeter/protocol/http/sampler/HTTPSampler.java
index ba35b78..5fe3681 100644
--- a/src/protocol/http/org/apache/jmeter/protocol/http/sampler/HTTPSampler.java
+++ b/src/protocol/http/org/apache/jmeter/protocol/http/sampler/HTTPSampler.java
@@ -432,7 +432,8 @@
 			// Sampling proper - establish the connection and read the response:
 			// Repeatedly try to connect:
 			int retry;
-			for (retry = 1; retry <= MAX_CONN_RETRIES; retry++) {
+			// Start with 0 so tries at least once, and retries at most MAX_CONN_RETRIES times
+			for (retry = 0; retry <= MAX_CONN_RETRIES; retry++) {
 				try {
 					conn = setupConnection(url, method, res);
 					// Attempt the connection:
