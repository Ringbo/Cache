diff --git a/twitter4j-core/src/main/java/twitter4j/internal/json/RateLimitStatusJSONImpl.java b/twitter4j-core/src/main/java/twitter4j/internal/json/RateLimitStatusJSONImpl.java
index cea3771..4ebbf1f 100644
--- a/twitter4j-core/src/main/java/twitter4j/internal/json/RateLimitStatusJSONImpl.java
+++ b/twitter4j-core/src/main/java/twitter4j/internal/json/RateLimitStatusJSONImpl.java
@@ -76,7 +76,7 @@
         this.limit = limit;
         this.remaining = remaining;
         this.resetTimeInSeconds = resetTimeInSeconds;
-        this.secondsUntilReset = (int) ((resetTimeInSeconds * 1000 - System.currentTimeMillis()) / 1000);
+        this.secondsUntilReset = (int) ((resetTimeInSeconds * 1000L - System.currentTimeMillis()) / 1000);
     }
 
     RateLimitStatusJSONImpl(JSONObject json) throws TwitterException {
@@ -87,7 +87,7 @@
         this.limit = getInt("limit", json);
         this.remaining = getInt("remaining", json);
         this.resetTimeInSeconds = getInt("reset", json);
-        this.secondsUntilReset = (int) ((resetTimeInSeconds * 1000 - System.currentTimeMillis()) / 1000);
+        this.secondsUntilReset = (int) ((resetTimeInSeconds * 1000L - System.currentTimeMillis()) / 1000);
     }
 
     static RateLimitStatus createFromResponseHeader(HttpResponse res) {
@@ -113,7 +113,7 @@
         String reset = res.getResponseHeader("X-Rate-Limit-Reset");
         if (reset != null) {
             long longReset = Long.parseLong(reset);
-            resetTimeInSeconds = (int) (longReset / 1000);
+            resetTimeInSeconds = (int) longReset;
         } else {
             return null;
         }
