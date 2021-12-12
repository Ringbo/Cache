diff --git a/community/io/src/test/java/org/neo4j/io/pagecache/PageCacheTest.java b/community/io/src/test/java/org/neo4j/io/pagecache/PageCacheTest.java
index 22507cf..4058f33 100644
--- a/community/io/src/test/java/org/neo4j/io/pagecache/PageCacheTest.java
+++ b/community/io/src/test/java/org/neo4j/io/pagecache/PageCacheTest.java
@@ -544,7 +544,7 @@
 
             pagedFile.flushAndForce();
 
-            assertThat( writeCounter.get(), is( 2 ) );
+            assertThat( writeCounter.get(), greaterThanOrEqualTo( 2 ) ); // we might race with background flushing
             assertThat( forceCounter.get(), is( 1 ) );
         }
     }
@@ -576,7 +576,7 @@
 
             pageCache.flushAndForce();
 
-            assertThat( writeCounter.get(), is( 3 ) );
+            assertThat( writeCounter.get(), greaterThanOrEqualTo( 3 ) ); // we might race with background flushing
             assertThat( forceCounter.get(), is( 2 ) );
         }
     }
