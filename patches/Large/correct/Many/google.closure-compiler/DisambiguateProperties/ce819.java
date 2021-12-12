diff --git a/src/com/google/javascript/jscomp/DisambiguateProperties.java b/src/com/google/javascript/jscomp/DisambiguateProperties.java
index 4e7046e..52082f6 100644
--- a/src/com/google/javascript/jscomp/DisambiguateProperties.java
+++ b/src/com/google/javascript/jscomp/DisambiguateProperties.java
@@ -592,9 +592,9 @@
         }
       }
     }
-    logger.info("Renamed " + instancesRenamed + " instances of "
+    logger.fine("Renamed " + instancesRenamed + " instances of "
                 + propsRenamed + " properties.");
-    logger.info("Skipped renaming " + instancesSkipped + " invalidated "
+    logger.fine("Skipped renaming " + instancesSkipped + " invalidated "
                 + "properties, " + propsSkipped + " instances of properties "
                 + "that were skipped for specific types and " + singleTypeProps
                 + " properties that were referenced from only one type.");
