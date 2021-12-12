diff --git a/community/values/src/main/java/org/neo4j/values/storable/StringArray.java b/community/values/src/main/java/org/neo4j/values/storable/StringArray.java
index 87cf227..c74acf2 100644
--- a/community/values/src/main/java/org/neo4j/values/storable/StringArray.java
+++ b/community/values/src/main/java/org/neo4j/values/storable/StringArray.java
@@ -112,7 +112,7 @@
     @Override
     public AnyValue value( int offset )
     {
-        return Values.stringValue( stringValue( offset ) );
+        return Values.stringOrNoValue( stringValue( offset ) );
     }
 
     @Override
