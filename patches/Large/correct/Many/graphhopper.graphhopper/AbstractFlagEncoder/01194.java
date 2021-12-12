diff --git a/core/src/main/java/com/graphhopper/routing/util/AbstractFlagEncoder.java b/core/src/main/java/com/graphhopper/routing/util/AbstractFlagEncoder.java
index 3d2bdca..c01f18e 100644
--- a/core/src/main/java/com/graphhopper/routing/util/AbstractFlagEncoder.java
+++ b/core/src/main/java/com/graphhopper/routing/util/AbstractFlagEncoder.java
@@ -440,7 +440,7 @@
             }
         } catch (Exception ex)
         {
-            logger.error("Cannot parse " + str + " using 0 minutes");
+            logger.warn("Cannot parse " + str + " using 0 minutes");
         }
         return 0;
     }
