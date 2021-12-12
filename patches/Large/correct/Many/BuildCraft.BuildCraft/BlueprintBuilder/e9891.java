diff --git a/common/buildcraft/builders/snapshot/BlueprintBuilder.java b/common/buildcraft/builders/snapshot/BlueprintBuilder.java
index 5845038..dceb7cb 100644
--- a/common/buildcraft/builders/snapshot/BlueprintBuilder.java
+++ b/common/buildcraft/builders/snapshot/BlueprintBuilder.java
@@ -273,7 +273,7 @@
                     } else {
                         toSpawn.stream()
                             .filter(schematicEntity ->
-                                !tryExtractRequired(
+                                tryExtractRequired(
                                     buildingInfo.entitiesRequiredItems.get(schematicEntity),
                                     buildingInfo.entitiesRequiredFluids.get(schematicEntity),
                                     true
