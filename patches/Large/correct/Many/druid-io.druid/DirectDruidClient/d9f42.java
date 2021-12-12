diff --git a/server/src/main/java/io/druid/client/DirectDruidClient.java b/server/src/main/java/io/druid/client/DirectDruidClient.java
index 5429485..34d6569 100644
--- a/server/src/main/java/io/druid/client/DirectDruidClient.java
+++ b/server/src/main/java/io/druid/client/DirectDruidClient.java
@@ -375,7 +375,7 @@
         private long checkQueryTimeout()
         {
           long timeLeft = timeoutAt - System.currentTimeMillis();
-          if (timeLeft >= 0) {
+          if (timeLeft <= 0) {
             String msg = StringUtils.safeFormat("Query[%s] url[%s] timed out.", query.getId(), url);
             setupResponseReadFailure(msg, null);
             throw new RE(msg);
