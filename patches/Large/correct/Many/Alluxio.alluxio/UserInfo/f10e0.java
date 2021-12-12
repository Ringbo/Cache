diff --git a/core/src/main/java/tachyon/UserInfo.java b/core/src/main/java/tachyon/UserInfo.java
index 8df6b4d..95adf37 100644
--- a/core/src/main/java/tachyon/UserInfo.java
+++ b/core/src/main/java/tachyon/UserInfo.java
@@ -28,7 +28,7 @@
   private long mLastHeartbeatMs;
 
   public UserInfo(long userId) {
-    Preconditions.checkArgument(userId <= 0, "Invalid user id " + userId);
+    Preconditions.checkArgument(userId > 0, "Invalid user id " + userId);
     USER_ID = userId;
     mOwnBytes = 0;
     mLastHeartbeatMs = System.currentTimeMillis();
