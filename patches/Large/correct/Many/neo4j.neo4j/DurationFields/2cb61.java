diff --git a/community/values/src/main/java/org/neo4j/values/storable/DurationFields.java b/community/values/src/main/java/org/neo4j/values/storable/DurationFields.java
index a68ee29..5c2f606 100644
--- a/community/values/src/main/java/org/neo4j/values/storable/DurationFields.java
+++ b/community/values/src/main/java/org/neo4j/values/storable/DurationFields.java
@@ -231,7 +231,7 @@
         case "seconds":
             return SECONDS;
         case "millisecondsofsecond":
-            return MICROSECONDS_OF_SECOND;
+            return MILLISECONDS_OF_SECOND;
         case "milliseconds":
             return MILLISECONDS;
         case "microsecondsofsecond":
