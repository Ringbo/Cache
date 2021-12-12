diff --git a/portal-impl/test/integration/com/liferay/portlet/wiki/search/WikiPageSearchTest.java b/portal-impl/test/integration/com/liferay/portlet/wiki/search/WikiPageSearchTest.java
index c1cdeb5..8ef5c94 100644
--- a/portal-impl/test/integration/com/liferay/portlet/wiki/search/WikiPageSearchTest.java
+++ b/portal-impl/test/integration/com/liferay/portlet/wiki/search/WikiPageSearchTest.java
@@ -107,7 +107,8 @@
 		return WikiTestUtil.addPage(
 			TestPropsValues.getUserId(),
 			(Long)parentBaseModel.getPrimaryKeyObj(),
-			ServiceTestUtil.randomString(), keywords, approved, serviceContext);
+			ServiceTestUtil.randomString(), keywords, true, approved,
+			serviceContext);
 	}
 
 	@Override
