diff --git a/languagetool-server/src/main/java/org/languagetool/server/DatabaseAccess.java b/languagetool-server/src/main/java/org/languagetool/server/DatabaseAccess.java
index 6425aa6..6477dbd 100644
--- a/languagetool-server/src/main/java/org/languagetool/server/DatabaseAccess.java
+++ b/languagetool-server/src/main/java/org/languagetool/server/DatabaseAccess.java
@@ -244,7 +244,7 @@
             }
           }
         } catch (PersistenceException e) {
-          print("Error: Could not get fetch/register server id from database: " + e);
+          print("Error: Could not fetch/register server id from database for server: " + hostname + " caused by " + e);
           return -1L;
         }
       });
@@ -285,7 +285,7 @@
             }
           }
         } catch (PersistenceException e) {
-          print("Error: Could not get/register id for this client: " + e);
+          print("Error: Could not get/register id for this client: " + client + " caused by " + e);
           return -1L;
         }
       });
