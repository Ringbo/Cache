diff --git a/flink-runtime/src/main/java/org/apache/flink/runtime/query/QueryableStateClient.java b/flink-runtime/src/main/java/org/apache/flink/runtime/query/QueryableStateClient.java
index 7ba3199..5d9db19 100644
--- a/flink-runtime/src/main/java/org/apache/flink/runtime/query/QueryableStateClient.java
+++ b/flink-runtime/src/main/java/org/apache/flink/runtime/query/QueryableStateClient.java
@@ -92,7 +92,7 @@
 	private final ConcurrentMap<Tuple2<JobID, String>, Future<KvStateLocation>> lookupCache =
 			new ConcurrentHashMap<>();
 
-	/** This is != null, iff we started the actor system. */
+	/** This is != null, if we started the actor system. */
 	private final ActorSystem actorSystem;
 
 	/**
@@ -210,7 +210,7 @@
 			try {
 				actorSystem.shutdown();
 			} catch (Throwable t) {
-				LOG.error("Failed to shut down ActorSystem");
+				LOG.error("Failed to shut down ActorSystem", t);
 			}
 		}
 	}
