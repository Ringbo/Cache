diff --git a/twitter4j-core/src/main/java/twitter4j/TwitterImpl.java b/twitter4j-core/src/main/java/twitter4j/TwitterImpl.java
index 3edddcf..8e03665 100644
--- a/twitter4j-core/src/main/java/twitter4j/TwitterImpl.java
+++ b/twitter4j-core/src/main/java/twitter4j/TwitterImpl.java
@@ -543,7 +543,7 @@
                 new HttpParameter[]{
                         new HttpParameter("screen_name", screenName),
                         new HttpParameter("device", enableDeviceNotification),
-                        new HttpParameter("retweets", enableDeviceNotification)
+                        new HttpParameter("retweets", retweets)
                 }));
     }
 
