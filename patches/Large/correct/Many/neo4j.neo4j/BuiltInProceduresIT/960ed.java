diff --git a/community/community-it/kernel-it/src/test/java/org/neo4j/kernel/impl/api/integrationtest/BuiltInProceduresIT.java b/community/community-it/kernel-it/src/test/java/org/neo4j/kernel/impl/api/integrationtest/BuiltInProceduresIT.java
index 11c20b5..db77f26 100644
--- a/community/community-it/kernel-it/src/test/java/org/neo4j/kernel/impl/api/integrationtest/BuiltInProceduresIT.java
+++ b/community/community-it/kernel-it/src/test/java/org/neo4j/kernel/impl/api/integrationtest/BuiltInProceduresIT.java
@@ -244,9 +244,17 @@
                         "score :: FLOAT?)", "Query the given fulltext index. Returns the matching relationships and their lucene query score, ordered by " +
                         "score.", "READ" ),
                 proc( "db.stats.retrieve", "(section :: STRING?) :: (section :: STRING?, data :: MAP?)",
-                      "Retrieve statistical data about the current database.", "READ" ),
+                      "Retrieve statistical data about the current database. Valid sections are 'GRAPH COUNTS', 'TOKENS', 'QUERIES'", "READ" ),
                 proc( "db.stats.retrieveAllAnonymized", "(graphToken :: STRING?) :: (section :: STRING?, data :: MAP?)",
-                      "Retrieve all available statistical data about the current database, in an anonymized form.", "READ" )
+                      "Retrieve all available statistical data about the current database, in an anonymized form.", "READ" ),
+                proc( "db.stats.status", "() :: (section :: STRING?, status :: STRING?, data :: MAP?)",
+                      "Retrieve the status of all available collector daemons, for this database.", "READ" ),
+                proc( "db.stats.collect", "(section :: STRING?) :: (section :: STRING?, success :: BOOLEAN?, message :: STRING?)",
+                      "Start data collection of a given data section. Valid sections are 'QUERIES'", "READ" ),
+                proc( "db.stats.stop", "(section :: STRING?) :: (section :: STRING?, success :: BOOLEAN?, message :: STRING?)",
+                      "Stop data collection of a given data section. Valid sections are 'QUERIES'", "READ" ),
+                proc( "db.stats.clear", "(section :: STRING?) :: (section :: STRING?, success :: BOOLEAN?, message :: STRING?)",
+                      "Clear collected data of a given data section. Valid sections are 'QUERIES'", "READ" )
         ) );
         commit();
     }
