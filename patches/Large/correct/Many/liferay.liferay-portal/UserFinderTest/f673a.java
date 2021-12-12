diff --git a/portal-impl/test/integration/com/liferay/portal/service/persistence/UserFinderTest.java b/portal-impl/test/integration/com/liferay/portal/service/persistence/UserFinderTest.java
index 14526c0..47dd51a 100644
--- a/portal-impl/test/integration/com/liferay/portal/service/persistence/UserFinderTest.java
+++ b/portal-impl/test/integration/com/liferay/portal/service/persistence/UserFinderTest.java
@@ -109,7 +109,7 @@
 			TestPropsValues.getCompanyId(), null,
 			WorkflowConstants.STATUS_APPROVED, params);
 
-		Assert.assertEquals(4, count);
+		Assert.assertEquals(5, count);
 	}
 
 	@Test
@@ -223,7 +223,7 @@
 		Assert.assertTrue(users.contains(_organizationUser));
 		Assert.assertTrue(users.contains(_userGroupUser));
 		Assert.assertTrue(users.contains(TestPropsValues.getUser()));
-		Assert.assertEquals(4, users.size());
+		Assert.assertEquals(5, users.size());
 	}
 
 	@Test
