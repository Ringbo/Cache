diff --git a/media/java/android/media/session/MediaSession.java b/media/java/android/media/session/MediaSession.java
index 4841360..086cd23 100644
--- a/media/java/android/media/session/MediaSession.java
+++ b/media/java/android/media/session/MediaSession.java
@@ -154,7 +154,7 @@
         if (TextUtils.isEmpty(tag)) {
             throw new IllegalArgumentException("tag cannot be null or empty");
         }
-        mCbStub = new CallbackStub();
+        mCbStub = new CallbackStub(this);
         MediaSessionManager manager = (MediaSessionManager) context
                 .getSystemService(Context.MEDIA_SESSION_SERVICE);
         try {
@@ -769,7 +769,7 @@
     public static class CallbackStub extends ISessionCallback.Stub {
         private WeakReference<MediaSession> mMediaSession;
 
-        public void setMediaSession(MediaSession session) {
+        public CallbackStub(MediaSession session) {
             mMediaSession = new WeakReference<MediaSession>(session);
         }
 
