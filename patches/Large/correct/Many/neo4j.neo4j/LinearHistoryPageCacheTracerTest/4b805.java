diff --git a/community/io/src/test/java/org/neo4j/test/LinearHistoryPageCacheTracerTest.java b/community/io/src/test/java/org/neo4j/test/LinearHistoryPageCacheTracerTest.java
index 2632ac2..343190e 100644
--- a/community/io/src/test/java/org/neo4j/test/LinearHistoryPageCacheTracerTest.java
+++ b/community/io/src/test/java/org/neo4j/test/LinearHistoryPageCacheTracerTest.java
@@ -91,11 +91,11 @@
                     }
                     if ( rng.nextDouble() < 0.1 )
                     {
-                        file.flush();
+                        file.flushAndForce();
                     }
                     else if ( rng.nextBoolean() )
                     {
-                        cache.flush();
+                        cache.flushAndForce();
                     }
                 }
                 catch ( Throwable ignore )
