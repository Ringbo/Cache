diff --git a/portal-impl/test/integration/com/liferay/portlet/service/persistence/GroupFinderTest.java b/portal-impl/test/integration/com/liferay/portlet/service/persistence/GroupFinderTest.java
index a30b3e6..89cf49b 100644
--- a/portal-impl/test/integration/com/liferay/portlet/service/persistence/GroupFinderTest.java
+++ b/portal-impl/test/integration/com/liferay/portlet/service/persistence/GroupFinderTest.java
@@ -231,7 +231,8 @@
 
 	protected List<Group> findByLayouts(long parentGroupId) throws Exception {
 		return GroupFinderUtil.findByLayouts(
-			TestPropsValues.getCompanyId(), parentGroupId, true, -1, -1);
+			TestPropsValues.getCompanyId(), parentGroupId, true, -1, -1,
+			new GroupNameComparator(true));
 	}
 
 	private static ResourceAction _arbitraryResourceAction;
