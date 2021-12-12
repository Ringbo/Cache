diff --git a/src/java/org/jivesoftware/database/SequenceManager.java b/src/java/org/jivesoftware/database/SequenceManager.java
index 8b1a4fe..d72ea0a 100644
--- a/src/java/org/jivesoftware/database/SequenceManager.java
+++ b/src/java/org/jivesoftware/database/SequenceManager.java
@@ -261,7 +261,7 @@
             pstmt.execute();
         }
         finally {
-            DbConnectionManager.closeConnection(pstmt, null);
+            DbConnectionManager.closeStatement(pstmt);
         }
     }
 }
\ No newline at end of file
