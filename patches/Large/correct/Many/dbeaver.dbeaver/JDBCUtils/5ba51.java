diff --git a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/model/impl/jdbc/JDBCUtils.java b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/model/impl/jdbc/JDBCUtils.java
index 94972bc..cb3460b 100644
--- a/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/model/impl/jdbc/JDBCUtils.java
+++ b/plugins/org.jkiss.dbeaver.core/src/org/jkiss/dbeaver/model/impl/jdbc/JDBCUtils.java
@@ -281,7 +281,7 @@
         } catch (SQLException e) {
             // Seems to be not supported
             log.debug(e.getMessage());
-        } catch (AbstractMethodError e) {
+        } catch (LinkageError e) {
             // Seems to be legacy JDBC
             log.debug(e.getMessage());
         } catch (UnsupportedOperationException e) {
