diff --git a/it/it-tests/src/test/java/it/organization/OrganizationMembershipTest.java b/it/it-tests/src/test/java/it/organization/OrganizationMembershipTest.java
index adeab69..9165cf8 100644
--- a/it/it-tests/src/test/java/it/organization/OrganizationMembershipTest.java
+++ b/it/it-tests/src/test/java/it/organization/OrganizationMembershipTest.java
@@ -225,7 +225,7 @@
       .manageGroupsOpen()
       .manageGroupsSelect("owners")
       .manageGroupsSave()
-      .shouldHaveGroups(1);
+      .shouldHaveGroups(2);
     // admin user
     page.getMembersByIdx(0)
       .manageGroupsOpen()
