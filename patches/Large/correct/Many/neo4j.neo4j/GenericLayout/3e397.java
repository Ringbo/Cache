diff --git a/community/kernel/src/main/java/org/neo4j/kernel/impl/index/schema/GenericLayout.java b/community/kernel/src/main/java/org/neo4j/kernel/impl/index/schema/GenericLayout.java
index e7825a8..d75e5ee 100644
--- a/community/kernel/src/main/java/org/neo4j/kernel/impl/index/schema/GenericLayout.java
+++ b/community/kernel/src/main/java/org/neo4j/kernel/impl/index/schema/GenericLayout.java
@@ -90,7 +90,7 @@
 
     GenericLayout( int numberOfSlots, IndexSpecificSpaceFillingCurveSettingsCache spatialSettings )
     {
-        super( "NSIL", 0, 1 );
+        super( "NSIL", 0, 2 );
         this.numberOfSlots = numberOfSlots;
         this.spatialSettings = spatialSettings;
     }
