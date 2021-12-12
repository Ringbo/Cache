diff --git a/src/main/java/org/apache/ibatis/executor/BaseExecutor.java b/src/main/java/org/apache/ibatis/executor/BaseExecutor.java
index 68586fe..839a0d0 100644
--- a/src/main/java/org/apache/ibatis/executor/BaseExecutor.java
+++ b/src/main/java/org/apache/ibatis/executor/BaseExecutor.java
@@ -79,7 +79,7 @@
       }
     } catch (SQLException e) {
       // Ignore.  There's nothing that can be done at this point.
-      log.debug("Unexpected exception on closing transaction.  Cause: " + e);
+      log.warn("Unexpected exception on closing transaction.  Cause: " + e);
     } finally {
       transaction = null;
       deferredLoads = null;
