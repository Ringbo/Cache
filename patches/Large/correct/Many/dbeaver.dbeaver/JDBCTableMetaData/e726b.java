diff --git a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/model/impl/jdbc/exec/JDBCTableMetaData.java b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/model/impl/jdbc/exec/JDBCTableMetaData.java
index 2f5cd97..e9c538c 100644
--- a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/model/impl/jdbc/exec/JDBCTableMetaData.java
+++ b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/model/impl/jdbc/exec/JDBCTableMetaData.java
@@ -152,7 +152,7 @@
                                     }
                                 }
                             }
-                        } catch (DBException e) {
+                        } catch (Exception e) {
                             // Indexes are not supported or not available
                             // Just skip them
                             log.debug(e);
