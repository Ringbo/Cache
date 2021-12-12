diff --git a/src/java/org/jivesoftware/messenger/user/spi/DbRosterItemProvider.java b/src/java/org/jivesoftware/messenger/user/spi/DbRosterItemProvider.java
index 1a35361..6217a7f 100644
--- a/src/java/org/jivesoftware/messenger/user/spi/DbRosterItemProvider.java
+++ b/src/java/org/jivesoftware/messenger/user/spi/DbRosterItemProvider.java
@@ -321,7 +321,7 @@
                     itemList.add(item);
                 }
                 finally {
-                    DbConnectionManager.close(pstmt, con);
+                    DbConnectionManager.close(gstmt, con);
                 }
             }
         }
