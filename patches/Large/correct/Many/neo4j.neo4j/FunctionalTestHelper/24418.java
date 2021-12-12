diff --git a/community/server/src/test/java/org/neo4j/server/helpers/FunctionalTestHelper.java b/community/server/src/test/java/org/neo4j/server/helpers/FunctionalTestHelper.java
index 6be745c..ac0e6d8 100644
--- a/community/server/src/test/java/org/neo4j/server/helpers/FunctionalTestHelper.java
+++ b/community/server/src/test/java/org/neo4j/server/helpers/FunctionalTestHelper.java
@@ -286,7 +286,7 @@
         {
             Map<?, ?> innerMap = (Map<?,?>) entry.getValue();
             String template = innerMap.get( "template" ).toString();
-            if ( !template.contains( PATH_AUTO_NODE_INDEX ) && !template.contains( PATH_AUTO_RELATIONSHIP_INDEX ) )
+            if ( !template.contains( PATH_AUTO_NODE_INDEX ) && !template.contains( PATH_AUTO_RELATIONSHIP_INDEX ) && !template.contains( "_auto_" ) )
                 result.put( entry.getKey(), entry.getValue() );
         }
         return result;
