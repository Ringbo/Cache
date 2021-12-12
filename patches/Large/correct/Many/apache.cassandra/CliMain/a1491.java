diff --git a/src/java/org/apache/cassandra/cli/CliMain.java b/src/java/org/apache/cassandra/cli/CliMain.java
index 78c7e57..9a000ea 100644
--- a/src/java/org/apache/cassandra/cli/CliMain.java
+++ b/src/java/org/apache/cassandra/cli/CliMain.java
@@ -232,14 +232,13 @@
         {
             css_.err.println(ire.why);
             if (css_.debug)
-                ire.printStackTrace();
+                ire.printStackTrace(css_.err);
         }
         catch (Exception e)
         {
             css_.err.println("Exception " + e.getMessage());
             if (css_.debug)
-                e.printStackTrace();
-
+                e.printStackTrace(css_.err);
         }
     }
 
