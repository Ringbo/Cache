diff --git a/external/storm-hive/src/main/java/org/apache/storm/hive/trident/HiveState.java b/external/storm-hive/src/main/java/org/apache/storm/hive/trident/HiveState.java
index cef1a4f..11f329c 100644
--- a/external/storm-hive/src/main/java/org/apache/storm/hive/trident/HiveState.java
+++ b/external/storm-hive/src/main/java/org/apache/storm/hive/trident/HiveState.java
@@ -243,7 +243,7 @@
             LOG.warn("Interrupted when attempting to close writer for end point: " + eldest, e);
             Thread.currentThread().interrupt();
         } catch (Exception e) {
-            LOG.warn("Interrupted when attempting to close writer for end point: " + ep, e);
+            LOG.warn("Interrupted when attempting to close writer for end point: " + eldest, e);
         }
     }
 
