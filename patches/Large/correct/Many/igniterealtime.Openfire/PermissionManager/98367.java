diff --git a/src/plugins/gateway/src/java/org/jivesoftware/wildfire/gateway/PermissionManager.java b/src/plugins/gateway/src/java/org/jivesoftware/wildfire/gateway/PermissionManager.java
index ba645ef..a7ac246 100644
--- a/src/plugins/gateway/src/java/org/jivesoftware/wildfire/gateway/PermissionManager.java
+++ b/src/plugins/gateway/src/java/org/jivesoftware/wildfire/gateway/PermissionManager.java
@@ -97,7 +97,7 @@
             pstmt.setString(2, jid.getNode());
             rs = pstmt.executeQuery();
             rs.next();
-            return (rs.getInt(1) > 1);
+            return (rs.getInt(1) > 0);
         }
         catch (SQLException sqle) {
             Log.error(sqle);
