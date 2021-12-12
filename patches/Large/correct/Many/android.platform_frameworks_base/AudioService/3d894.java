diff --git a/media/java/android/media/AudioService.java b/media/java/android/media/AudioService.java
index eae03be..1c7f577 100644
--- a/media/java/android/media/AudioService.java
+++ b/media/java/android/media/AudioService.java
@@ -591,7 +591,7 @@
                         // Post a persist volume msg
                         sendMsg(mAudioHandler,
                                 MSG_PERSIST_VOLUME,
-                                SENDMSG_REPLACE,
+                                SENDMSG_QUEUE,
                                 PERSIST_LAST_AUDIBLE,
                                 device,
                                 s,
@@ -606,7 +606,7 @@
                 // to persist). Do not change volume if stream is muted.
                 sendMsg(mAudioHandler,
                         MSG_SET_DEVICE_VOLUME,
-                        SENDMSG_NOOP,
+                        SENDMSG_QUEUE,
                         device,
                         0,
                         streamState,
@@ -746,7 +746,7 @@
                 // Post a persist volume msg
                 sendMsg(mAudioHandler,
                         MSG_PERSIST_VOLUME,
-                        SENDMSG_REPLACE,
+                        SENDMSG_QUEUE,
                         PERSIST_LAST_AUDIBLE,
                         device,
                         streamState,
@@ -758,7 +758,7 @@
                 // to persist).
                 sendMsg(mAudioHandler,
                         MSG_SET_DEVICE_VOLUME,
-                        SENDMSG_NOOP,
+                        SENDMSG_QUEUE,
                         device,
                         0,
                         streamState,
@@ -2208,7 +2208,7 @@
                                     }
                                     sendMsg(mAudioHandler,
                                             MSG_SET_ALL_VOLUMES,
-                                            SENDMSG_NOOP,
+                                            SENDMSG_QUEUE,
                                             0,
                                             0,
                                             VolumeStreamState.this, 0);
@@ -2252,7 +2252,7 @@
                                         }
                                         sendMsg(mAudioHandler,
                                                 MSG_SET_ALL_VOLUMES,
-                                                SENDMSG_NOOP,
+                                                SENDMSG_QUEUE,
                                                 0,
                                                 0,
                                                 VolumeStreamState.this, 0);
@@ -2350,7 +2350,7 @@
             // Post a persist volume msg
             sendMsg(mAudioHandler,
                     MSG_PERSIST_VOLUME,
-                    SENDMSG_REPLACE,
+                    SENDMSG_QUEUE,
                     PERSIST_CURRENT|PERSIST_LAST_AUDIBLE,
                     device,
                     streamState,
