diff --git a/h2/src/test/org/h2/test/db/TestRunscript.java b/h2/src/test/org/h2/test/db/TestRunscript.java
index bca753f..032c6ba 100644
--- a/h2/src/test/org/h2/test/db/TestRunscript.java
+++ b/h2/src/test/org/h2/test/db/TestRunscript.java
@@ -360,7 +360,7 @@
             }
         };
         task.execute();
-        Thread.sleep(100);
+        Thread.sleep(200);
         stat.cancel();
         e = (SQLException) task.getException();
         assertTrue(e != null);
