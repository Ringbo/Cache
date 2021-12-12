diff --git a/community/kernel/src/test/java/org/neo4j/kernel/builtinprocs/BuiltInProceduresTest.java b/community/kernel/src/test/java/org/neo4j/kernel/builtinprocs/BuiltInProceduresTest.java
index 4072a4d..464307f 100644
--- a/community/kernel/src/test/java/org/neo4j/kernel/builtinprocs/BuiltInProceduresTest.java
+++ b/community/kernel/src/test/java/org/neo4j/kernel/builtinprocs/BuiltInProceduresTest.java
@@ -113,7 +113,7 @@
         // When/Then
         assertThat( call( "db.indexes" ),
                 contains( record( "INDEX ON :User(name)", "User", singletonList( "name" ), "ONLINE", "node_label_property",
-                        getIndexProviderDescriptorMap( InMemoryIndexProviderFactory.PROVIDER_DESCRIPTOR ) ) ) );
+                        getIndexProviderDescriptorMap( InMemoryIndexProviderFactory.PROVIDER_DESCRIPTOR ), "" ) ) );
     }
 
     private Map<String,String> getIndexProviderDescriptorMap( IndexProvider.Descriptor providerDescriptor )
@@ -130,7 +130,7 @@
         // When/Then
         assertThat( call( "db.indexes" ),
                 contains( record( "INDEX ON :User(name)", "User", singletonList( "name" ), "ONLINE", "node_unique_property",
-                        getIndexProviderDescriptorMap( InMemoryIndexProviderFactory.PROVIDER_DESCRIPTOR ) ) ) );
+                        getIndexProviderDescriptorMap( InMemoryIndexProviderFactory.PROVIDER_DESCRIPTOR ), "" ) ) );
     }
 
     @Test
@@ -218,7 +218,7 @@
                 record( "db.constraints", "db.constraints() :: (description :: STRING?)",
                         "List all constraints in the database.", "READ" ),
                 record( "db.indexes", "db.indexes() :: (description :: STRING?, label :: STRING?, properties :: LIST? OF STRING?, " +
-                                "state :: STRING?, type :: STRING?, provider :: MAP?)",
+                                "state :: STRING?, type :: STRING?, provider :: MAP?, failureMessage :: STRING?)",
                         "List all indexes in the database.", "READ" ),
                 record( "db.labels", "db.labels() :: (label :: STRING?)", "List all labels in the database.", "READ" ),
                 record( "db.propertyKeys", "db.propertyKeys() :: (propertyKey :: STRING?)",
