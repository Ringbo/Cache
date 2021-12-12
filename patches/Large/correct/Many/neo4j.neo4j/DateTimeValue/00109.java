diff --git a/community/values/src/main/java/org/neo4j/values/storable/DateTimeValue.java b/community/values/src/main/java/org/neo4j/values/storable/DateTimeValue.java
index 0872553..8f6b65e 100644
--- a/community/values/src/main/java/org/neo4j/values/storable/DateTimeValue.java
+++ b/community/values/src/main/java/org/neo4j/values/storable/DateTimeValue.java
@@ -134,7 +134,7 @@
         {
             if ( !(fieldsFromHeader instanceof TimeCSVHeaderInformation) )
             {
-                throw new TemporalParseException( "Wrong header information type: " + fieldsFromHeader );
+                throw new IllegalStateException( "Wrong header information type: " + fieldsFromHeader );
             }
             // Override defaultZone
             defaultZone = ((TimeCSVHeaderInformation) fieldsFromHeader).zoneSupplier( defaultZone );
