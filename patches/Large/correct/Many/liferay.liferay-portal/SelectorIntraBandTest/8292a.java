diff --git a/portal-impl/test/unit/com/liferay/portal/kernel/nio/intraband/nonblocking/SelectorIntraBandTest.java b/portal-impl/test/unit/com/liferay/portal/kernel/nio/intraband/nonblocking/SelectorIntraBandTest.java
index 6d9cb5e..976eca2 100644
--- a/portal-impl/test/unit/com/liferay/portal/kernel/nio/intraband/nonblocking/SelectorIntraBandTest.java
+++ b/portal-impl/test/unit/com/liferay/portal/kernel/nio/intraband/nonblocking/SelectorIntraBandTest.java
@@ -501,7 +501,7 @@
 			Assert.assertEquals("Channel is null", npe.getMessage());
 		}
 
-		// Channel is not of type ScatteringByteChannel
+		// Channel is not of type GatheringByteChannel
 
 		try {
 			_selectorIntraBand.registerChannel(
@@ -511,22 +511,22 @@
 		}
 		catch (IllegalArgumentException iae) {
 			Assert.assertEquals(
-				"Channel is not of type ScatteringByteChannel",
+				"Channel is not of type GatheringByteChannel",
 				iae.getMessage());
 		}
 
-		// Channel is not of type GatheringByteChannel
+		// Channel is not of type ScatteringByteChannel
 
 		try {
 			_selectorIntraBand.registerChannel(
 				IntraBandTestUtil.<Channel>createProxy(
-					ScatteringByteChannel.class));
+					GatheringByteChannel.class));
 
 			Assert.fail();
 		}
 		catch (IllegalArgumentException iae) {
 			Assert.assertEquals(
-				"Channel is not of type GatheringByteChannel",
+				"Channel is not of type ScatteringByteChannel",
 				iae.getMessage());
 		}
 
