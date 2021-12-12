diff --git a/community/values/src/main/java/org/neo4j/values/storable/TimeValue.java b/community/values/src/main/java/org/neo4j/values/storable/TimeValue.java
index 90cc0a7..27baae0 100644
--- a/community/values/src/main/java/org/neo4j/values/storable/TimeValue.java
+++ b/community/values/src/main/java/org/neo4j/values/storable/TimeValue.java
@@ -85,7 +85,7 @@
         {
             if ( !(fieldsFromHeader instanceof TimeCSVHeaderInformation) )
             {
-                throw new TemporalParseException( "Wrong header information type: " + fieldsFromHeader );
+                throw new IllegalStateException( "Wrong header information type: " + fieldsFromHeader );
             }
             // Override defaultZone
             defaultZone = ((TimeCSVHeaderInformation) fieldsFromHeader).zoneSupplier( defaultZone );
