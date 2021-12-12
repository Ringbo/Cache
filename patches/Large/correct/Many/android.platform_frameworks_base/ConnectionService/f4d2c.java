diff --git a/telecomm/java/android/telecom/ConnectionService.java b/telecomm/java/android/telecom/ConnectionService.java
index 4648d78..65d48f1 100644
--- a/telecomm/java/android/telecom/ConnectionService.java
+++ b/telecomm/java/android/telecom/ConnectionService.java
@@ -1039,7 +1039,8 @@
         connection.setConnectionService(this);
     }
 
-    private void removeConnection(Connection connection) {
+    /** {@hide} */
+    protected void removeConnection(Connection connection) {
         String id = mIdByConnection.get(connection);
         connection.unsetConnectionService(this);
         connection.removeConnectionListener(mConnectionListener);
