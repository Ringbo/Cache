diff --git a/services/java/com/android/server/WiredAccessoryObserver.java b/services/java/com/android/server/WiredAccessoryObserver.java
index 2046473..d97d41c 100644
--- a/services/java/com/android/server/WiredAccessoryObserver.java
+++ b/services/java/com/android/server/WiredAccessoryObserver.java
@@ -75,7 +75,7 @@
         // At any given time both headsets could be inserted
         // one on the board and one on the dock
         // observe two UEVENTs
-        for (int i = 0; i <= MAX_AUDIO_PORTS; i++) {
+        for (int i = 0; i < MAX_AUDIO_PORTS; i++) {
             startObserving(uEventInfo[i][0]);
         }
         init();  // set initial status
@@ -120,7 +120,7 @@
         int newState = mHeadsetState;
         mPrevHeadsetState = mHeadsetState;
 
-        for (int i = 0; i <= MAX_AUDIO_PORTS; i++) {
+        for (int i = 0; i < MAX_AUDIO_PORTS; i++) {
             try {
                 FileReader file = new FileReader(uEventInfo[i][1]);
                 int len = file.read(buffer, 0, 1024);
