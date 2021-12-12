diff --git a/tests/net/java/com/android/server/connectivity/tethering/OffloadControllerTest.java b/tests/net/java/com/android/server/connectivity/tethering/OffloadControllerTest.java
index 622a7be..dfe3f98 100644
--- a/tests/net/java/com/android/server/connectivity/tethering/OffloadControllerTest.java
+++ b/tests/net/java/com/android/server/connectivity/tethering/OffloadControllerTest.java
@@ -444,7 +444,7 @@
         NetworkStats perUidStats = provider.getTetherStats(STATS_PER_UID);
         waitForIdle();
         // There is no current upstream, so no stats are fetched.
-        inOrder.verify(mHardware, never()).getForwardedStats(eq(ethernetIface));
+        inOrder.verify(mHardware, never()).getForwardedStats(any());
         inOrder.verify(mHardware, times(1)).setUpstreamParameters(
                 eq(null), eq(null), eq(null), eq(null));
         inOrder.verifyNoMoreInteractions();
