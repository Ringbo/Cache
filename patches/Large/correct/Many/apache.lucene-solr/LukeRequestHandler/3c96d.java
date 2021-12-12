diff --git a/src/java/org/apache/solr/handler/admin/LukeRequestHandler.java b/src/java/org/apache/solr/handler/admin/LukeRequestHandler.java
index 7248785..6e627a2 100644
--- a/src/java/org/apache/solr/handler/admin/LukeRequestHandler.java
+++ b/src/java/org/apache/solr/handler/admin/LukeRequestHandler.java
@@ -531,7 +531,7 @@
     public NamedList<Integer> toNamedList()
     {
       NamedList<Integer> nl = new NamedList<Integer>();
-      for( int bucket = 2; bucket <= maxBucket; bucket *= 2 ) {
+      for( int bucket = 1; bucket <= maxBucket; bucket *= 2 ) {
         Integer val = hist.get( bucket );
         if( val == null ) {
           val = 0;
