diff --git a/zeppelin-driver-jdbc/src/main/java/com/nflabs/zeppelin/driver/jdbc/JDBCConnection.java b/zeppelin-driver-jdbc/src/main/java/com/nflabs/zeppelin/driver/jdbc/JDBCConnection.java
index 2b0567b..c498dcf 100644
--- a/zeppelin-driver-jdbc/src/main/java/com/nflabs/zeppelin/driver/jdbc/JDBCConnection.java
+++ b/zeppelin-driver-jdbc/src/main/java/com/nflabs/zeppelin/driver/jdbc/JDBCConnection.java
@@ -24,7 +24,7 @@
 	@Override
 	public boolean isConnected() throws ZeppelinDriverException {
 		try {
-			return connection.isClosed();
+			return !connection.isClosed();
 		} catch (SQLException e) {
 			throw new ZeppelinDriverException(e);
 		}
