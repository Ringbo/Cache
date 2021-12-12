diff --git a/common/buildcraft/builders/snapshot/ClientSnapshots.java b/common/buildcraft/builders/snapshot/ClientSnapshots.java
index 10d1964..3b90f38 100644
--- a/common/buildcraft/builders/snapshot/ClientSnapshots.java
+++ b/common/buildcraft/builders/snapshot/ClientSnapshots.java
@@ -77,7 +77,7 @@
             if (snapshot instanceof Blueprint) {
                 localWorld.uploadBlueprint((Blueprint) snapshot, false);
                 for (ISchematicEntity<?> schematicEntity : ((Blueprint) snapshot).entities) {
-                    schematicEntity.build(localWorld, FakeWorld.BLUEPRINT_OFFSET);
+                    schematicEntity.buildWithoutChecks(localWorld, FakeWorld.BLUEPRINT_OFFSET);
                 }
             }
             if (snapshot instanceof Template) {
