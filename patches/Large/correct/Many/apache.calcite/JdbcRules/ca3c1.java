diff --git a/core/src/main/java/net/hydromatic/optiq/impl/jdbc/JdbcRules.java b/core/src/main/java/net/hydromatic/optiq/impl/jdbc/JdbcRules.java
index 8b3b3e7..3cb12f1 100644
--- a/core/src/main/java/net/hydromatic/optiq/impl/jdbc/JdbcRules.java
+++ b/core/src/main/java/net/hydromatic/optiq/impl/jdbc/JdbcRules.java
@@ -158,7 +158,7 @@
             join.getJoinType(),
             join.getVariablesStopped());
       } catch (InvalidRelException e) {
-        LOGGER.warning(e.toString());
+        LOGGER.fine(e.toString());
         return null;
       }
     }
@@ -507,7 +507,7 @@
             convert(agg.getChild(), traitSet), agg.getGroupSet(),
             agg.getAggCallList());
       } catch (InvalidRelException e) {
-        LOGGER.warning(e.toString());
+        LOGGER.fine(e.toString());
         return null;
       }
     }
