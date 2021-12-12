diff --git a/community/cypher/cypher/src/test/java/org/neo4j/cypher/internal/javacompat/NotificationAcceptanceTest.java b/community/cypher/cypher/src/test/java/org/neo4j/cypher/internal/javacompat/NotificationAcceptanceTest.java
index ddc0e75..745105c 100644
--- a/community/cypher/cypher/src/test/java/org/neo4j/cypher/internal/javacompat/NotificationAcceptanceTest.java
+++ b/community/cypher/cypher/src/test/java/org/neo4j/cypher/internal/javacompat/NotificationAcceptanceTest.java
@@ -133,7 +133,7 @@
     @Test
     public void shouldWarnWhenRequestingCompiledRuntimeOnUnsupportedQuery() throws Exception
     {
-        Stream.of( "CYPHER 3.1", "CYPHER 3.2", "CYPHER 3.3", "CYPHER 3.4" ).forEach(
+        Stream.of( "CYPHER 3.1", "CYPHER 3.4" ).forEach(
                 version -> shouldNotifyInStream( version, "EXPLAIN CYPHER runtime=compiled MATCH (a)-->(b), (c)-->(d) RETURN count(*)", InputPosition.empty,
                         RUNTIME_UNSUPPORTED ) );
     }
@@ -141,7 +141,7 @@
     @Test
     public void shouldWarnWhenRequestingSlottedRuntimeOnUnsupportedQuery() throws Exception
     {
-        Stream.of( "CYPHER 3.3" ).forEach(
+        Stream.of( "CYPHER 3.4" ).forEach(
                 version -> shouldNotifyInStream( version, "explain cypher runtime=slotted merge (a)-[:X]->(b)", InputPosition.empty, RUNTIME_UNSUPPORTED ) );
     }
 
@@ -199,7 +199,7 @@
     @Test
     public void shouldWarnWhenUsingLengthOnNonPath() throws Exception
     {
-        Stream.of( "CYPHER 3.1", "CYPHER 3.2", "CYPHER 3.3", "CYPHER 3.4" ).forEach( version ->
+        Stream.of( "CYPHER 3.1", "CYPHER 3.4" ).forEach( version ->
         {
             // pattern
             shouldNotifyInStream( version, "explain match (a) where a.name='Alice' return length((a)-->()-->())", new InputPosition( 63, 1, 64 ),
@@ -216,35 +216,35 @@
     @Test
     public void shouldNotNotifyWhenUsingLengthOnPath() throws Exception
     {
-        Stream.of( "CYPHER 2.3", "CYPHER 3.1", "CYPHER 3.2", "CYPHER 3.3", "CYPHER 3.4" ).forEach(
+        Stream.of( "CYPHER 2.3", "CYPHER 3.1", "CYPHER 3.4" ).forEach(
                 version -> shouldNotNotifyInStream( version, " explain match p=(a)-[*]->(b) return length(p)" ) );
     }
 
     @Test
     public void shouldNotNotifyWhenUsingSizeOnCollection() throws Exception
     {
-        Stream.of( "CYPHER 2.3", "CYPHER 3.1", "CYPHER 3.2", "CYPHER 3.3", "CYPHER 3.4" ).forEach(
+        Stream.of( "CYPHER 2.3", "CYPHER 3.1", "CYPHER 3.4" ).forEach(
                 version -> shouldNotNotifyInStream( version, "explain return size([1, 2, 3])" ) );
     }
 
     @Test
     public void shouldNotNotifyWhenUsingSizeOnString() throws Exception
     {
-        Stream.of( "CYPHER 2.3", "CYPHER 3.1", "CYPHER 3.2", "CYPHER 3.3", "CYPHER 3.4" ).forEach(
+        Stream.of( "CYPHER 2.3", "CYPHER 3.1", "CYPHER 3.4" ).forEach(
                 version -> shouldNotNotifyInStream( version, " explain return size('a string')" ) );
     }
 
     @Test
     public void shouldNotNotifyForCostUnsupportedUpdateQueryIfPlannerNotExplicitlyRequested() throws Exception
     {
-        Stream.of( "CYPHER 2.3", "CYPHER 3.1", "CYPHER 3.2", "CYPHER 3.3", "CYPHER 3.4" ).forEach(
+        Stream.of( "CYPHER 2.3", "CYPHER 3.1", "CYPHER 3.4" ).forEach(
                 version -> shouldNotNotifyInStream( version, " EXPLAIN MATCH (n:Movie) SET n.title = 'The Movie'" ) );
     }
 
     @Test
     public void shouldNotNotifyForCostSupportedUpdateQuery() throws Exception
     {
-        Stream.of( "CYPHER 3.1", "CYPHER 3.2", "CYPHER 3.3", "CYPHER 3.4" ).forEach( version ->
+        Stream.of( "CYPHER 3.1", "CYPHER 3.4" ).forEach( version ->
         {
             shouldNotNotifyInStream( version, "EXPLAIN CYPHER planner=cost MATCH (n:Movie) SET n:Seen" );
             shouldNotNotifyInStream( version, "EXPLAIN CYPHER planner=idp MATCH (n:Movie) SET n:Seen" );
@@ -258,7 +258,7 @@
         List<String> queries = Arrays.asList( "CYPHER planner=cost EXPLAIN MATCH (a)-->(b) USING JOIN ON b RETURN a, b",
                 "CYPHER planner=cost EXPLAIN MATCH (a)-->(x)<--(b) USING JOIN ON x RETURN a, b" );
 
-        Stream.of( "CYPHER 2.3", "CYPHER 3.1", "CYPHER 3.2", "CYPHER 3.3", "CYPHER 3.4" ).forEach( version ->
+        Stream.of( "CYPHER 2.3", "CYPHER 3.1", "CYPHER 3.4" ).forEach( version ->
         {
             for ( String query : queries )
             {
@@ -270,7 +270,7 @@
     @Test
     public void shouldWarnOnPotentiallyCachedQueries() throws Exception
     {
-        Stream.of( "CYPHER 2.3", "CYPHER 3.1", "CYPHER 3.2", "CYPHER 3.3", "CYPHER 3.4" ).forEach( version ->
+        Stream.of( "CYPHER 2.3", "CYPHER 3.1", "CYPHER 3.4" ).forEach( version ->
         {
             assertNotifications( version + "explain match (a)-->(b), (c)-->(d) return *", containsItem( cartesianProductWarning ) );
 
@@ -282,7 +282,7 @@
     @Test
     public void shouldWarnOnceWhenSingleIndexHintCannotBeFulfilled() throws Exception
     {
-        Stream.of( "CYPHER 2.3", "CYPHER 3.1", "CYPHER 3.2", "CYPHER 3.3", "CYPHER 3.4" ).forEach(
+        Stream.of( "CYPHER 2.3", "CYPHER 3.1", "CYPHER 3.4" ).forEach(
                 version -> shouldNotifyInStreamWithDetail( version, " EXPLAIN MATCH (n:Person) USING INDEX n:Person(name) WHERE n.name = 'John' RETURN n",
                         InputPosition.empty, INDEX_HINT_UNFULFILLABLE, index( "Person", "name" ) ) );
     }
@@ -293,7 +293,7 @@
         String query = " EXPLAIN MATCH (n:Person), (m:Party), (k:Animal) " + "USING INDEX n:Person(name) " + "USING INDEX m:Party(city) " +
                 "USING INDEX k:Animal(species) " + "WHERE n.name = 'John' AND m.city = 'Reykjavik' AND k.species = 'Sloth' " + "RETURN n";
 
-        Stream.of( "CYPHER 2.3", "CYPHER 3.1", "CYPHER 3.2", "CYPHER 3.3", "CYPHER 3.4" ).forEach( version ->
+        Stream.of( "CYPHER 2.3", "CYPHER 3.1", "CYPHER 3.4" ).forEach( version ->
         {
             shouldNotifyInStreamWithDetail( version, query, InputPosition.empty, INDEX_HINT_UNFULFILLABLE, index( "Person", "name" ) );
             shouldNotifyInStreamWithDetail( version, query, InputPosition.empty, INDEX_HINT_UNFULFILLABLE, index( "Party", "city" ) );
@@ -304,14 +304,14 @@
     @Test
     public void shouldNotNotifyOnLiteralMaps() throws Exception
     {
-        Stream.of( "CYPHER 3.1", "CYPHER 3.2", "CYPHER 3.3", "CYPHER 3.4" ).forEach(
+        Stream.of( "CYPHER 3.1", "CYPHER 3.4" ).forEach(
                 version -> shouldNotNotifyInStream( version, " explain return { id: 42 } " ) );
     }
 
     @Test
     public void shouldNotNotifyOnNonExistingLabelUsingLoadCSV() throws Exception
     {
-        Stream.of( "CYPHER 3.1", "CYPHER 3.2", "CYPHER 3.3", "CYPHER 3.4" ).forEach( version ->
+        Stream.of( "CYPHER 3.1", "CYPHER 3.4" ).forEach( version ->
         {
             // create node
             shouldNotNotifyInStream( version, " EXPLAIN LOAD CSV WITH HEADERS FROM 'file:///fake.csv' AS row CREATE (n:Category)" );
@@ -327,7 +327,7 @@
     @Test
     public void shouldNotNotifyOnNonExistingRelTypeUsingLoadCSV() throws Exception
     {
-        Stream.of( "CYPHER 3.1", "CYPHER 3.2", "CYPHER 3.3", "CYPHER 3.4" ).forEach( version ->
+        Stream.of( "CYPHER 3.1", "CYPHER 3.4" ).forEach( version ->
         {
             // create rel
             shouldNotNotifyInStream( version, " EXPLAIN LOAD CSV WITH HEADERS FROM 'file:///fake.csv' AS row CREATE ()-[:T]->()" );
@@ -340,7 +340,7 @@
     @Test
     public void shouldNotNotifyOnNonExistingPropKeyIdUsingLoadCSV() throws Exception
     {
-        Stream.of( "CYPHER 3.1", "CYPHER 3.2", "CYPHER 3.3", "CYPHER 3.4" ).forEach( version ->
+        Stream.of( "CYPHER 3.1", "CYPHER 3.4" ).forEach( version ->
         {
             // create node
             shouldNotNotifyInStream( version, " EXPLAIN LOAD CSV WITH HEADERS FROM 'file:///fake.csv' AS row CREATE (n) SET n.p = 'a'" );
@@ -353,14 +353,14 @@
     @Test
     public void shouldNotNotifyOnEagerBeforeLoadCSVDelete() throws Exception
     {
-        Stream.of( "CYPHER 3.1", "CYPHER 3.2", "CYPHER 3.3", "CYPHER 3.4" ).forEach( version -> shouldNotNotifyInStream( version,
+        Stream.of( "CYPHER 3.1", "CYPHER 3.4" ).forEach( version -> shouldNotNotifyInStream( version,
                 "EXPLAIN MATCH (n) DELETE n WITH * LOAD CSV FROM 'file:///ignore/ignore.csv' AS line MERGE () RETURN line" ) );
     }
 
     @Test
     public void shouldNotNotifyOnEagerBeforeLoadCSVCreate() throws Exception
     {
-        Stream.of( "CYPHER 3.1", "CYPHER 3.2", "CYPHER 3.3", "CYPHER 3.4" ).forEach( version ->
+        Stream.of( "CYPHER 3.1", "CYPHER 3.4" ).forEach( version ->
                 assertNotifications( version + "EXPLAIN MATCH (a), (b) CREATE (c) WITH c LOAD CSV FROM 'file:///ignore/ignore.csv' AS line RETURN *",
                         containsNoItem( eagerOperatorWarning ) ) );
     }
@@ -368,7 +368,7 @@
     @Test
     public void shouldWarnOnEagerAfterLoadCSV() throws Exception
     {
-        Stream.of( "CYPHER 3.1", "CYPHER 3.2", "CYPHER 3.3", "CYPHER 3.4" ).forEach( version -> shouldNotifyInStream( version,
+        Stream.of( "CYPHER 3.1", "CYPHER 3.4" ).forEach( version -> shouldNotifyInStream( version,
                 "EXPLAIN MATCH (n) LOAD CSV FROM 'file:///ignore/ignore.csv' AS line WITH * DELETE n MERGE () RETURN line", InputPosition.empty,
                 EAGER_LOAD_CSV ) );
     }
@@ -376,14 +376,14 @@
     @Test
     public void shouldNotNotifyOnLoadCSVWithoutEager() throws Exception
     {
-        Stream.of( "CYPHER 3.1", "CYPHER 3.2", "CYPHER 3.3", "CYPHER 3.4" ).forEach(
+        Stream.of( "CYPHER 3.1", "CYPHER 3.4" ).forEach(
                 version -> shouldNotNotifyInStream( version, "EXPLAIN LOAD CSV FROM 'file:///ignore/ignore.csv' AS line MATCH (:A) CREATE (:B) RETURN line" ) );
     }
 
     @Test
     public void shouldNotNotifyOnEagerWithoutLoadCSV() throws Exception
     {
-        Stream.of( "CYPHER 3.1", "CYPHER 3.2", "CYPHER 3.3", "CYPHER 3.4" ).forEach(
+        Stream.of( "CYPHER 3.1", "CYPHER 3.4" ).forEach(
                 version -> assertNotifications( version + "EXPLAIN MATCH (a), (b) CREATE (c) RETURN *", containsNoItem( eagerOperatorWarning ) ) );
     }
 
@@ -398,7 +398,7 @@
                 tx.success();
             }
         }
-        Stream.of( "CYPHER 3.1", "CYPHER 3.2", "CYPHER 3.3", "CYPHER 3.4" ).forEach(
+        Stream.of( "CYPHER 3.1", "CYPHER 3.4" ).forEach(
                 version -> assertNotifications( version + "EXPLAIN LOAD CSV FROM 'file:///ignore/ignore.csv' AS line MATCH (a:A) RETURN *",
                         containsNoItem( largeLabelCSVWarning ) ) );
     }
@@ -414,7 +414,7 @@
                 tx.success();
             }
         }
-        Stream.of( "CYPHER 3.1", "CYPHER 3.2", "CYPHER 3.3", "CYPHER 3.4" ).forEach(
+        Stream.of( "CYPHER 3.1", "CYPHER 3.4" ).forEach(
                 version -> assertNotifications( version + "EXPLAIN LOAD CSV FROM 'file:///ignore/ignore.csv' AS line MERGE (a:A) RETURN *",
                         containsNoItem( largeLabelCSVWarning ) ) );
     }
@@ -427,7 +427,7 @@
             db().createNode().addLabel( label( "A" ) );
             tx.success();
         }
-        Stream.of( "CYPHER 3.1", "CYPHER 3.2", "CYPHER 3.3", "CYPHER 3.4" ).forEach( version ->
+        Stream.of( "CYPHER 3.1", "CYPHER 3.4" ).forEach( version ->
         {
             shouldNotNotifyInStream( version, "EXPLAIN LOAD CSV FROM 'file:///ignore/ignore.csv' AS line MATCH (a:A) RETURN *" );
             shouldNotNotifyInStream( version, "EXPLAIN LOAD CSV FROM 'file:///ignore/ignore.csv' AS line MERGE (a:A) RETURN *" );
@@ -437,28 +437,28 @@
     @Test
     public void shouldWarnOnDeprecatedToInt() throws Exception
     {
-        Stream.of( "CYPHER 3.1", "CYPHER 3.2", "CYPHER 3.3", "CYPHER 3.4" ).forEach( version ->
+        Stream.of( "CYPHER 3.1", "CYPHER 3.4" ).forEach( version ->
                 assertNotifications( version + " EXPLAIN RETURN toInt('1') AS one", containsItem( deprecatedFeatureWarning ) ) );
     }
 
     @Test
     public void shouldWarnOnDeprecatedUpper() throws Exception
     {
-        Stream.of( "CYPHER 3.1", "CYPHER 3.2", "CYPHER 3.3", "CYPHER 3.4" ).forEach( version ->
+        Stream.of( "CYPHER 3.1", "CYPHER 3.4" ).forEach( version ->
                 assertNotifications( version + " EXPLAIN RETURN upper('foo') AS one", containsItem( deprecatedFeatureWarning ) ) );
     }
 
     @Test
     public void shouldWarnOnDeprecatedLower() throws Exception
     {
-        Stream.of( "CYPHER 3.1", "CYPHER 3.2", "CYPHER 3.3", "CYPHER 3.4" ).forEach( version ->
+        Stream.of( "CYPHER 3.1", "CYPHER 3.4" ).forEach( version ->
                 assertNotifications( version + " EXPLAIN RETURN lower('BAR') AS one", containsItem( deprecatedFeatureWarning ) ) );
     }
 
     @Test
     public void shouldWarnOnDeprecatedRels() throws Exception
     {
-        Stream.of( "CYPHER 3.1", "CYPHER 3.2", "CYPHER 3.3", "CYPHER 3.4" ).forEach( version ->
+        Stream.of( "CYPHER 3.1", "CYPHER 3.4" ).forEach( version ->
                 assertNotifications( version + " EXPLAIN MATCH p = ()-->() RETURN rels(p) AS r", containsItem( deprecatedFeatureWarning ) ) );
     }
 
@@ -466,7 +466,7 @@
     public void shouldWarnOnDeprecatedProcedureCalls() throws Exception
     {
         db().getDependencyResolver().provideDependency( Procedures.class ).get().registerProcedure( TestProcedures.class );
-        Stream.of( "CYPHER 3.1", "CYPHER 3.2", "CYPHER 3.3", "CYPHER 3.4" ).forEach( version ->
+        Stream.of( "CYPHER 3.1", "CYPHER 3.4" ).forEach( version ->
         {
             assertNotifications( version + "explain CALL oldProc()", containsItem( deprecatedProcedureWarning ) );
             assertNotifications( version + "explain CALL oldProc() RETURN 1", containsItem( deprecatedProcedureWarning ) );
@@ -477,7 +477,7 @@
     public void shouldWarnOnDeprecatedProcedureResultField() throws Exception
     {
         db().getDependencyResolver().provideDependency( Procedures.class ).get().registerProcedure( TestProcedures.class );
-        Stream.of( "CYPHER 3.2", "CYPHER 3.3", "CYPHER 3.4" ).forEach(
+        Stream.of( "CYPHER 3.4" ).forEach(
                 version -> assertNotifications(
                         version + "explain CALL changedProc() YIELD oldField RETURN oldField",
                         containsItem( deprecatedProcedureReturnFieldWarning )
@@ -487,7 +487,7 @@
     @Test
     public void shouldWarnOnUnboundedShortestPath() throws Exception
     {
-        Stream.of( "CYPHER 2.3", "CYPHER 3.1", "CYPHER 3.2", "CYPHER 3.3", "CYPHER 3.4" ).forEach(
+        Stream.of( "CYPHER 2.3", "CYPHER 3.1", "CYPHER 3.4" ).forEach(
                 version -> shouldNotifyInStream( version, "EXPLAIN MATCH p = shortestPath((n)-[*]->(m)) RETURN m", new InputPosition( 44, 1, 45 ),
                         UNBOUNDED_SHORTEST_PATH ) );
     }
@@ -495,7 +495,7 @@
     @Test
     public void shouldNotNotifyOnDynamicPropertyLookupWithNoLabels() throws Exception
     {
-        Stream.of( "CYPHER 2.3", "CYPHER 3.1", "CYPHER 3.2", "CYPHER 3.3", "CYPHER 3.4" ).forEach( version ->
+        Stream.of( "CYPHER 2.3", "CYPHER 3.1", "CYPHER 3.4" ).forEach( version ->
         {
             db().execute( "CREATE INDEX ON :Person(name)" );
             db().execute( "Call db.awaitIndexes()" );
@@ -506,7 +506,7 @@
     @Test
     public void shouldWarnOnDynamicPropertyLookupWithBothStaticAndDynamicProperties() throws Exception
     {
-        Stream.of( "CYPHER 2.3", "CYPHER 3.1", "CYPHER 3.2", "CYPHER 3.3", "CYPHER 3.4" ).forEach( version ->
+        Stream.of( "CYPHER 2.3", "CYPHER 3.1", "CYPHER 3.4" ).forEach( version ->
         {
             db().execute( "CREATE INDEX ON :Person(name)" );
             db().execute( "Call db.awaitIndexes()" );
@@ -518,7 +518,7 @@
     @Test
     public void shouldNotNotifyOnDynamicPropertyLookupWithLabelHavingNoIndex() throws Exception
     {
-        Stream.of( "CYPHER 2.3", "CYPHER 3.1", "CYPHER 3.2", "CYPHER 3.3", "CYPHER 3.4" ).forEach( version ->
+        Stream.of( "CYPHER 2.3", "CYPHER 3.1", "CYPHER 3.4" ).forEach( version ->
         {
             db().execute( "CREATE INDEX ON :Person(name)" );
             db().execute( "Call db.awaitIndexes()" );
@@ -561,7 +561,7 @@
         // dynamic property lookup with a single label and IN
         queries.add( "EXPLAIN MATCH (n:Person) WHERE n['key-' + n.name] IN ['Foo', 'Bar'] RETURN n" );
 
-        Stream.of( "CYPHER 2.3", "CYPHER 3.1", "CYPHER 3.2", "CYPHER 3.3", "CYPHER 3.4" ).forEach( version ->
+        Stream.of( "CYPHER 2.3", "CYPHER 3.1", "CYPHER 3.4" ).forEach( version ->
         {
             for ( String query : queries )
             {
@@ -575,7 +575,7 @@
     @Test
     public void shouldNotNotifyOnDynamicPropertyLookupWithSingleLabelAndNegativePredicate() throws Exception
     {
-        Stream.of( "CYPHER 2.3", "CYPHER 3.1", "CYPHER 3.2", "CYPHER 3.3", "CYPHER 3.4" ).forEach( version ->
+        Stream.of( "CYPHER 2.3", "CYPHER 3.1", "CYPHER 3.4" ).forEach( version ->
         {
             db().execute( "CREATE INDEX ON :Person(name)" );
             db().execute( "Call db.awaitIndexes()" );
@@ -586,7 +586,7 @@
     @Test
     public void shouldWarnOnUnfulfillableIndexSeekUsingDynamicPropertyAndMultipleLabels() throws Exception
     {
-        Stream.of( "CYPHER 3.2", "CYPHER 3.3", "CYPHER 3.4" ).forEach( version ->
+        Stream.of( "CYPHER 3.4" ).forEach( version ->
         {
             db().execute( "CREATE INDEX ON :Person(name)" );
             db().execute( "Call db.awaitIndexes()" );
@@ -599,7 +599,7 @@
     @Test
     public void shouldWarnOnUnfulfillableIndexSeekUsingDynamicPropertyAndMultipleIndexedLabels() throws Exception
     {
-        Stream.of( "CYPHER 2.3", "CYPHER 3.1", "CYPHER 3.2", "CYPHER 3.3", "CYPHER 3.4" ).forEach( version ->
+        Stream.of( "CYPHER 2.3", "CYPHER 3.1", "CYPHER 3.4" ).forEach( version ->
         {
 
             db().execute( "CREATE INDEX ON :Person(name)" );
@@ -635,16 +635,18 @@
     @Test
     public void shouldWarnOnBindingVariableLengthRelationship() throws Exception
     {
-        assertNotifications( "CYPHER 3.3 explain MATCH ()-[rs*]-() RETURN rs", containsItem( depracatedBindingWarning ) );
+        assertNotifications( "CYPHER 3.4 explain MATCH ()-[rs*]-() RETURN rs", containsItem( depracatedBindingWarning
+        ) );
 
-        assertNotifications( "CYPHER 3.3 explain MATCH p = ()-[*]-() RETURN relationships(p) AS rs", containsNoItem( depracatedBindingWarning ) );
+        assertNotifications( "CYPHER 3.4 explain MATCH p = ()-[*]-() RETURN relationships(p) AS rs", containsNoItem(
+                depracatedBindingWarning ) );
     }
 
     @Test
     public void shouldWarnOnCartesianProduct() throws Exception
     {
 
-        Stream.of( "CYPHER 3.1", "CYPHER 3.2", "CYPHER 3.3", "CYPHER 3.4" ).forEach( version ->
+        Stream.of( "CYPHER 3.1", "CYPHER 3.4" ).forEach( version ->
         {
             assertNotifications( version + "explain match (a)-->(b), (c)-->(d) return *", containsItem( cartesianProductWarning ) );
 
@@ -657,7 +659,7 @@
     @Test
     public void shouldNotNotifyOnCartesianProductWithoutExplain() throws Exception
     {
-        Stream.of( "CYPHER 2.3", "CYPHER 3.1", "CYPHER 3.2", "CYPHER 3.3", "CYPHER 3.4" ).forEach(
+        Stream.of( "CYPHER 2.3", "CYPHER 3.1", "CYPHER 3.4" ).forEach(
                 version -> shouldNotNotifyInStream( version, " match (a)-->(b), (c)-->(d) return *" ) );
     }
 
@@ -676,7 +678,7 @@
             tx.success();
         }
 
-        Stream.of( "CYPHER 2.3", "CYPHER 3.1", "CYPHER 3.2", "CYPHER 3.3", "CYPHER 3.4" ).forEach( version ->
+        Stream.of( "CYPHER 2.3", "CYPHER 3.1", "CYPHER 3.4" ).forEach( version ->
         {
             assertNotifications(version + "EXPLAIN MATCH (n:Preson) RETURN *", containsItem( unknownLabelWarning ) );
             shouldNotNotifyInStream( version, "EXPLAIN MATCH (n:Person) RETURN *" );
@@ -718,7 +720,7 @@
     @Test
     public void shouldNotNotifyForMissingLabelOnUpdate() throws Exception
     {
-        Stream.of( "CYPHER 2.3", "CYPHER 3.1", "CYPHER 3.2", "CYPHER 3.3", "CYPHER 3.4" ).forEach(
+        Stream.of( "CYPHER 2.3", "CYPHER 3.1", "CYPHER 3.4" ).forEach(
                 version -> shouldNotNotifyInStream( version, " EXPLAIN CREATE (n:Person)" ) );
     }
 
@@ -737,7 +739,7 @@
             tx.success();
         }
 
-        Stream.of( "CYPHER 2.3", "CYPHER 3.1", "CYPHER 3.2", "CYPHER 3.3", "CYPHER 3.4" ).forEach( version ->
+        Stream.of( "CYPHER 2.3", "CYPHER 3.1", "CYPHER 3.4" ).forEach( version ->
         {
             db().execute( "CREATE (n)-[r:R]->(m)");
             assertNotifications(version + "EXPLAIN MATCH ()-[r:r]->() RETURN *", containsItem( unknownRelationshipWarning ) );
@@ -762,7 +764,7 @@
     {
         db().execute("CREATE (n {prop : 42})");
 
-        Stream.of( "CYPHER 2.3", "CYPHER 3.1", "CYPHER 3.2", "CYPHER 3.3", "CYPHER 3.4" ).forEach( version ->
+        Stream.of( "CYPHER 2.3", "CYPHER 3.1", "CYPHER 3.4" ).forEach( version ->
         {
             db().execute( "CREATE (n)-[r:R]->(m)");
             assertNotifications(version + "EXPLAIN MATCH (n) WHERE n.propp = 43 RETURN n", containsItem( unknownPropertyKeyWarning ) );
@@ -779,7 +781,7 @@
     @Test
     public void shouldNotNotifyForMissingPropertiesOnUpdate() throws Exception
     {
-        Stream.of( "CYPHER 2.3", "CYPHER 3.1", "CYPHER 3.2", "CYPHER 3.3", "CYPHER 3.4" ).forEach(
+        Stream.of( "CYPHER 2.3", "CYPHER 3.1", "CYPHER 3.4" ).forEach(
                 version -> shouldNotNotifyInStream( version, " EXPLAIN CREATE (n {prop: 42})" ) );
     }
 
