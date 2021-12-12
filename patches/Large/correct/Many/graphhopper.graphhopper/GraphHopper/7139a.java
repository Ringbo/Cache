diff --git a/core/src/main/java/com/graphhopper/GraphHopper.java b/core/src/main/java/com/graphhopper/GraphHopper.java
index 894aaff..cba7b8c 100644
--- a/core/src/main/java/com/graphhopper/GraphHopper.java
+++ b/core/src/main/java/com/graphhopper/GraphHopper.java
@@ -1294,7 +1294,7 @@
                             ghStorage.getProperties().put("prepare.date." + name, Helper.createFormatter().format(new Date()));
                         } catch (Exception ex)
                         {
-                            logger.error("Problem while CH preparation " + name);
+                            logger.error("Problem while CH preparation " + name, ex);
                             ghStorage.getProperties().put(errorKey, ex.getMessage());
                         }
                     }
