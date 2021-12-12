diff --git a/tests/net/java/com/android/server/IpSecServiceParameterizedTest.java b/tests/net/java/com/android/server/IpSecServiceParameterizedTest.java
index 963e042..80e42a3 100644
--- a/tests/net/java/com/android/server/IpSecServiceParameterizedTest.java
+++ b/tests/net/java/com/android/server/IpSecServiceParameterizedTest.java
@@ -178,7 +178,7 @@
                 .thenReturn(TEST_SPI_OUT);
 
         IpSecSpiResponse spiResp =
-                mIpSecService.reserveSecurityParameterIndex(
+                mIpSecService.allocateSecurityParameterIndex(
                         IpSecTransform.DIRECTION_OUT, mRemoteAddr, TEST_SPI_OUT, new Binder());
 
         IpSecService.UserRecord userRecord =
