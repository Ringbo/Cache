diff --git a/community/values/src/main/java/org/neo4j/values/storable/PointValue.java b/community/values/src/main/java/org/neo4j/values/storable/PointValue.java
index b144c14..9427cd2 100644
--- a/community/values/src/main/java/org/neo4j/values/storable/PointValue.java
+++ b/community/values/src/main/java/org/neo4j/values/storable/PointValue.java
@@ -293,7 +293,7 @@
             // Merge InputFields: Data fields override header fields
             if ( !(fieldsFromHeader instanceof PointCSVHeaderInformation) )
             {
-                throw new InvalidValuesArgumentException( "Wrong header information type: " + fieldsFromHeader );
+                throw new IllegalStateException( "Wrong header information type: " + fieldsFromHeader );
             }
             fieldsFromData.mergeWithHeader( (PointCSVHeaderInformation) fieldsFromHeader );
         }
