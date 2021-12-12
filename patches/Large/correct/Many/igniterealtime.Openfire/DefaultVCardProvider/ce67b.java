diff --git a/src/java/org/jivesoftware/messenger/vcard/DefaultVCardProvider.java b/src/java/org/jivesoftware/messenger/vcard/DefaultVCardProvider.java
index b8d7e55..2c10809 100644
--- a/src/java/org/jivesoftware/messenger/vcard/DefaultVCardProvider.java
+++ b/src/java/org/jivesoftware/messenger/vcard/DefaultVCardProvider.java
@@ -1,5 +1,5 @@
 /**
- * $RCSfile$
+ * $RCSfile: DefaultVCardProvider.java,v $
  * $Revision$
  * $Date$
  *
@@ -76,7 +76,7 @@
                 }
             }
             catch (Exception e) {
-                Log.error(e);
+                Log.error("Error loading vCard of username: " + username, e);
             }
             finally {
                 // Return the sax reader to the pool
@@ -108,7 +108,7 @@
             pstmt.executeUpdate();
         }
         catch (SQLException e) {
-            Log.error(e);
+            Log.error("Error creating vCard for username: " + username, e);
         }
         finally {
             try { if (pstmt != null) { pstmt.close(); } }
@@ -133,7 +133,7 @@
             pstmt.executeUpdate();
         }
         catch (SQLException e) {
-            Log.error(e);
+            Log.error("Error updating vCard of username: " + username, e);
         }
         finally {
             try { if (pstmt != null) { pstmt.close(); } }
@@ -153,7 +153,7 @@
             pstmt.executeUpdate();
         }
         catch (SQLException e) {
-            Log.error(e);
+            Log.error("Error deleting vCard of username: " + username, e);
         }
         finally {
             try { if (pstmt != null) { pstmt.close(); } }
