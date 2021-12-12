diff --git a/community/io/src/test/java/org/neo4j/io/pagecache/tracing/DefaultPageCacheTracerTest.java b/community/io/src/test/java/org/neo4j/io/pagecache/tracing/DefaultPageCacheTracerTest.java
index a3daabb..d3363f9 100644
--- a/community/io/src/test/java/org/neo4j/io/pagecache/tracing/DefaultPageCacheTracerTest.java
+++ b/community/io/src/test/java/org/neo4j/io/pagecache/tracing/DefaultPageCacheTracerTest.java
@@ -32,13 +32,14 @@
 import static org.hamcrest.Matchers.closeTo;
 import static org.hamcrest.Matchers.is;
 
-class DefaultPageCacheTracerTest
+@SuppressWarnings( "WeakerAccess" ) // This test is accessed in neo4j-jfr.
+public class DefaultPageCacheTracerTest
 {
     private PageCacheTracer tracer;
     private PageSwapper swapper;
 
     @BeforeEach
-    void setUp()
+    public void setUp()
     {
         tracer = new DefaultPageCacheTracer();
         swapper = new DummyPageSwapper( "filename", (int) ByteUnit.kibiBytes( 8 ) );
