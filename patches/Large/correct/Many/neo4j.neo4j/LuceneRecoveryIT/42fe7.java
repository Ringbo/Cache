diff --git a/community/lucene-index/src/test/java/org/neo4j/index/impl/lucene/legacy/LuceneRecoveryIT.java b/community/lucene-index/src/test/java/org/neo4j/index/impl/lucene/legacy/LuceneRecoveryIT.java
index 945e7c7..4d58b36 100644
--- a/community/lucene-index/src/test/java/org/neo4j/index/impl/lucene/legacy/LuceneRecoveryIT.java
+++ b/community/lucene-index/src/test/java/org/neo4j/index/impl/lucene/legacy/LuceneRecoveryIT.java
@@ -87,7 +87,7 @@
                 }
             }
         }
-        catch ( Exception e )
+        catch ( Throwable e )
         {
             if ( Exceptions.contains( e, CorruptIndexException.class ) ||
                     exceptionContainsStackTraceElementFromPackage( e, "org.apache.lucene" ) )
@@ -128,7 +128,7 @@
         db.shutdown();
     }
 
-    private boolean exceptionContainsStackTraceElementFromPackage( Exception e, String packageName )
+    private boolean exceptionContainsStackTraceElementFromPackage( Throwable e, String packageName )
     {
         for ( StackTraceElement element : e.getStackTrace() )
         {
