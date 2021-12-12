diff --git a/src/main/java/org/tron/core/services/WitnessService.java b/src/main/java/org/tron/core/services/WitnessService.java
index c447b36..83a37e3 100755
--- a/src/main/java/org/tron/core/services/WitnessService.java
+++ b/src/main/java/org/tron/core/services/WitnessService.java
@@ -146,7 +146,7 @@
         return BlockProductionCondition.NOT_SYNCED;
       }
     }
-    if (!db.isSyncMode()) {
+    if (db.isSyncMode()) {
       return BlockProductionCondition.NOT_SYNCED;
     }
     final int participation = this.db.calculateParticipationRate();
