diff --git a/portal-impl/test/integration/com/liferay/portlet/wiki/trash/WikiPageTrashHandlerTest.java b/portal-impl/test/integration/com/liferay/portlet/wiki/trash/WikiPageTrashHandlerTest.java
index 81a2403..659e0e0 100644
--- a/portal-impl/test/integration/com/liferay/portlet/wiki/trash/WikiPageTrashHandlerTest.java
+++ b/portal-impl/test/integration/com/liferay/portlet/wiki/trash/WikiPageTrashHandlerTest.java
@@ -774,7 +774,7 @@
 
 		Assert.assertEquals(_node.getNodeId(), page.getNodeId());
 		Assert.assertEquals(newNode.getNodeId(), childPage.getNodeId());
-		Assert.assertEquals(newNode.getNodeId(), redirectPage.getNodeId());
+		Assert.assertEquals(_node.getNodeId(), redirectPage.getNodeId());
 
 		Assert.assertNull(childPage.getParentPage());
 
@@ -791,7 +791,7 @@
 		Assert.assertEquals(_node.getNodeId(), pageResource.getNodeId());
 		Assert.assertEquals(newNode.getNodeId(), childPageResource.getNodeId());
 		Assert.assertEquals(
-			newNode.getNodeId(), redirectPageResource.getNodeId());
+			_node.getNodeId(), redirectPageResource.getNodeId());
 	}
 
 	@Test
@@ -849,7 +849,7 @@
 
 		Assert.assertEquals(_node.getNodeId(), page.getNodeId());
 		Assert.assertEquals(newNode.getNodeId(), childPage.getNodeId());
-		Assert.assertEquals(newNode.getNodeId(), redirectPage.getNodeId());
+		Assert.assertEquals(_node.getNodeId(), redirectPage.getNodeId());
 
 		Assert.assertEquals(
 			newParentPage.getTitle(), childPage.getParentTitle());
