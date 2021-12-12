diff --git a/core/src/main/java/net/hydromatic/optiq/rules/java/JavaRules.java b/core/src/main/java/net/hydromatic/optiq/rules/java/JavaRules.java
index 384a306..777229f 100644
--- a/core/src/main/java/net/hydromatic/optiq/rules/java/JavaRules.java
+++ b/core/src/main/java/net/hydromatic/optiq/rules/java/JavaRules.java
@@ -102,7 +102,7 @@
             join.getJoinType(),
             join.getVariablesStopped());
       } catch (InvalidRelException e) {
-        LOGGER.warning(e.toString());
+        LOGGER.fine(e.toString());
         return null;
       }
     }
@@ -812,7 +812,7 @@
             agg.getGroupSet(),
             agg.getAggCallList());
       } catch (InvalidRelException e) {
-        LOGGER.warning(e.toString());
+        LOGGER.fine(e.toString());
         return null;
       }
     }
