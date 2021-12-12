diff --git a/services/tests/servicestests/src/com/android/server/connectivity/NetdEventListenerServiceTest.java b/services/tests/servicestests/src/com/android/server/connectivity/NetdEventListenerServiceTest.java
index 63d5d9f..9e2fd62 100644
--- a/services/tests/servicestests/src/com/android/server/connectivity/NetdEventListenerServiceTest.java
+++ b/services/tests/servicestests/src/com/android/server/connectivity/NetdEventListenerServiceTest.java
@@ -158,7 +158,8 @@
 
     void log(int netId, int[] latencies) {
         for (int l : latencies) {
-            mNetdEventListenerService.onDnsEvent(netId, EVENT_TYPE, RETURN_CODE, l);
+            mNetdEventListenerService.onDnsEvent(netId, EVENT_TYPE, RETURN_CODE, l, null, null, 0,
+                    0);
         }
     }
 
