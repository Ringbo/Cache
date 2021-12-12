diff --git a/src/test/org/apache/solr/ConvertedLegacyTest.java b/src/test/org/apache/solr/ConvertedLegacyTest.java
index 367adc6..75015f9 100644
--- a/src/test/org/apache/solr/ConvertedLegacyTest.java
+++ b/src/test/org/apache/solr/ConvertedLegacyTest.java
@@ -787,7 +787,7 @@
         req( "id_i:1000; nullfirst" ), 400 );
 
     assertQEx( "unknown sort field",
-        req( "id_i:1000; abcde12345 asc" ), 1 ); 
+        req( "id_i:1000; abcde12345 asc" ), 400 ); 
 
     assertQEx( "unknown sort order",
         req( "id_i:1000; nullfirst aaa" ), 400 ); 
