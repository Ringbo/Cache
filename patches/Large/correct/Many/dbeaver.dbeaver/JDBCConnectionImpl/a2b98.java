diff --git a/plugins/org.jkiss.dbeaver.model/src/org/jkiss/dbeaver/model/impl/jdbc/exec/JDBCConnectionImpl.java b/plugins/org.jkiss.dbeaver.model/src/org/jkiss/dbeaver/model/impl/jdbc/exec/JDBCConnectionImpl.java
index f7aad3f..74546de 100644
--- a/plugins/org.jkiss.dbeaver.model/src/org/jkiss/dbeaver/model/impl/jdbc/exec/JDBCConnectionImpl.java
+++ b/plugins/org.jkiss.dbeaver.model/src/org/jkiss/dbeaver/model/impl/jdbc/exec/JDBCConnectionImpl.java
@@ -122,7 +122,7 @@
                 JDBCStatement statement;
                 try {
                     if (!scrollable && !updatable) {
-                        statement = createStatement();
+                        statement = createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
                     } else {
                         statement = createStatement(
                                 scrollable ? ResultSet.TYPE_SCROLL_INSENSITIVE : ResultSet.TYPE_FORWARD_ONLY,
