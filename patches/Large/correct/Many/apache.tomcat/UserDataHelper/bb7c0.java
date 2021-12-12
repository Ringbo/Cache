diff --git a/java/org/apache/juli/logging/UserDataHelper.java b/java/org/apache/juli/logging/UserDataHelper.java
index a6b1e04..709a453 100644
--- a/java/org/apache/juli/logging/UserDataHelper.java
+++ b/java/org/apache/juli/logging/UserDataHelper.java
@@ -65,9 +65,9 @@
         }
 
         // Default suppression time of 1 day.
-        suppressionTime = Integer.parseInt(
+        suppressionTime = Integer.getInteger(
                 "org.apache.juli.logging.UserDataHelper.SUPPRESSION_TIME",
-                60 * 60 * 24) * 1000L;
+                60 * 60 * 24).intValue() * 1000L;
 
         if (suppressionTime == 0) {
             config = Config.INFO_ALL;
