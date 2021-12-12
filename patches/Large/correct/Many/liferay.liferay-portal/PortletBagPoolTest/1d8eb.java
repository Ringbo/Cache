diff --git a/portal-impl/test/integration/com/liferay/portal/security/pacl/test/PortletBagPoolTest.java b/portal-impl/test/integration/com/liferay/portal/security/pacl/test/PortletBagPoolTest.java
index 7806ed4..dbbcd2d 100644
--- a/portal-impl/test/integration/com/liferay/portal/security/pacl/test/PortletBagPoolTest.java
+++ b/portal-impl/test/integration/com/liferay/portal/security/pacl/test/PortletBagPoolTest.java
@@ -70,7 +70,7 @@
 				new PortletBagImpl(
 					null, null, null, null, null, null, null, null, null, null,
 					null, null, null, null, null, null, null, null, null, null,
-					null, null, null, null, null, null, null));
+					null, null, null, null, null, null, null, null));
 		}
 		catch (SecurityException se) {
 			Assert.fail();
@@ -85,7 +85,7 @@
 				new PortletBagImpl(
 					null, null, null, null, null, null, null, null, null, null,
 					null, null, null, null, null, null, null, null, null, null,
-					null, null, null, null, null, null, null));
+					null, null, null, null, null, null, null, null));
 
 			Assert.fail();
 		}
@@ -101,7 +101,7 @@
 				new PortletBagImpl(
 					null, null, null, null, null, null, null, null, null, null,
 					null, null, null, null, null, null, null, null, null, null,
-					null, null, null, null, null, null, null));
+					null, null, null, null, null, null, null, null));
 		}
 		catch (SecurityException se) {
 			Assert.fail();
