diff --git a/portal-impl/test/integration/com/liferay/portlet/service/persistence/GroupFinderTest.java b/portal-impl/test/integration/com/liferay/portlet/service/persistence/GroupFinderTest.java
index 89523b0..8a4d28a 100644
--- a/portal-impl/test/integration/com/liferay/portlet/service/persistence/GroupFinderTest.java
+++ b/portal-impl/test/integration/com/liferay/portlet/service/persistence/GroupFinderTest.java
@@ -158,9 +158,9 @@
 
 		return GroupFinderUtil.findByC_C_PG_N_D(
 			TestPropsValues.getCompanyId(), classNameIds,
-			GroupConstants.ANY_PARENT_GROUP_ID, StringPool.NOT_EQUAL,
-			new String[] {null}, new String[] {null}, new String[] {null},
-			groupParams, true, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
+			GroupConstants.ANY_PARENT_GROUP_ID, new String[] {null},
+			new String[] {null}, new String[] {null}, groupParams, true,
+			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
 	}
 
 	private static ResourceAction _arbitraryResourceAction;
