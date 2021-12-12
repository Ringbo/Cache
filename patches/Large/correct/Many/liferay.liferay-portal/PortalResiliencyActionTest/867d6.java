diff --git a/portal-impl/test/unit/com/liferay/portal/resiliency/spi/action/PortalResiliencyActionTest.java b/portal-impl/test/unit/com/liferay/portal/resiliency/spi/action/PortalResiliencyActionTest.java
index 402dd36..28e46aa 100644
--- a/portal-impl/test/unit/com/liferay/portal/resiliency/spi/action/PortalResiliencyActionTest.java
+++ b/portal-impl/test/unit/com/liferay/portal/resiliency/spi/action/PortalResiliencyActionTest.java
@@ -151,7 +151,7 @@
 			WebKeys.SPI_AGENT_LIFECYCLE, SPIAgent.Lifecycle.ACTION);
 
 		_portalResiliencyAction.execute(
-			null, null, _mockHttpServletRequest, _response);
+			null, _mockHttpServletRequest, _response);
 
 		Assert.assertSame(
 			_mockHttpServletRequest, _mockPortletContainer.request);
@@ -172,7 +172,7 @@
 		_mockHttpServletRequest.setParameter("p_p_id", _PORTLET_ID);
 
 		_portalResiliencyAction.execute(
-			null, null, _mockHttpServletRequest, _response);
+			null, _mockHttpServletRequest, _response);
 
 		Assert.assertSame(
 			_mockHttpServletRequest, _mockPortletContainer.request);
@@ -205,7 +205,7 @@
 		_mockHttpServletRequest.setAttribute(WebKeys.SPI_AGENT_LAYOUT, layout);
 
 		_portalResiliencyAction.execute(
-			null, null, _mockHttpServletRequest, _response);
+			null, _mockHttpServletRequest, _response);
 
 		Assert.assertSame(
 			_mockHttpServletRequest, _mockPortletContainer.request);
@@ -228,7 +228,7 @@
 		_mockHttpServletRequest.setParameter("p_p_id", _PORTLET_ID);
 
 		_portalResiliencyAction.execute(
-			null, null, _mockHttpServletRequest, _response);
+			null, _mockHttpServletRequest, _response);
 
 		Assert.assertSame(
 			_mockHttpServletRequest, _mockPortletContainer.request);
@@ -252,7 +252,7 @@
 			WebKeys.SPI_AGENT_LIFECYCLE, SPIAgent.Lifecycle.RENDER);
 
 		_portalResiliencyAction.execute(
-			null, null, _mockHttpServletRequest, _response);
+			null, _mockHttpServletRequest, _response);
 
 		Assert.assertSame(
 			_mockHttpServletRequest, _mockPortletContainer.request);
@@ -266,7 +266,7 @@
 			WebKeys.SPI_AGENT_LIFECYCLE, SPIAgent.Lifecycle.RESOURCE);
 
 		_portalResiliencyAction.execute(
-			null, null, _mockHttpServletRequest, _response);
+			null, _mockHttpServletRequest, _response);
 
 		Assert.assertSame(
 			_mockHttpServletRequest, _mockPortletContainer.request);
@@ -283,7 +283,7 @@
 
 		try {
 			_portalResiliencyAction.execute(
-				null, null, _mockHttpServletRequest, _response);
+				null, _mockHttpServletRequest, _response);
 
 			Assert.fail();
 		}
