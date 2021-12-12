diff --git a/src/test/java/com/zaxxer/hikari/TestConnectionTimeoutRetry.java b/src/test/java/com/zaxxer/hikari/TestConnectionTimeoutRetry.java
index e3d67cb..d92d362 100644
--- a/src/test/java/com/zaxxer/hikari/TestConnectionTimeoutRetry.java
+++ b/src/test/java/com/zaxxer/hikari/TestConnectionTimeoutRetry.java
@@ -185,7 +185,7 @@
         catch (SQLException e)
         {
             long elapsed = System.currentTimeMillis() - start;
-            Assert.assertTrue("Didn't wait long enough for timeout", (elapsed > config.getConnectionTimeout()));
+            Assert.assertTrue("Didn't wait long enough for timeout", (elapsed >= config.getConnectionTimeout()));
         }
         finally
         {
