diff --git a/src/java/org/apache/solr/update/DirectUpdateHandler2.java b/src/java/org/apache/solr/update/DirectUpdateHandler2.java
index 4fcea89..3b4e0e0 100644
--- a/src/java/org/apache/solr/update/DirectUpdateHandler2.java
+++ b/src/java/org/apache/solr/update/DirectUpdateHandler2.java
@@ -640,7 +640,7 @@
 
       // check if docs have been submitted since the commit started
       if( lastAddedTime > started ) {
-        if( docsSinceCommit > docsUpperBound ) {
+        if( docsUpperBound > 0 && docsSinceCommit > docsUpperBound ) {
           pending = scheduler.schedule( this, 100, TimeUnit.MILLISECONDS );
         }
         else if( timeUpperBound > 0 ) {
