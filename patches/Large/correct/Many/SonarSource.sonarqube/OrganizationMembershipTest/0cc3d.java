diff --git a/it/it-tests/src/test/java/it/organization/OrganizationMembershipTest.java b/it/it-tests/src/test/java/it/organization/OrganizationMembershipTest.java
index cffdf0c5..adeab69 100644
--- a/it/it-tests/src/test/java/it/organization/OrganizationMembershipTest.java
+++ b/it/it-tests/src/test/java/it/organization/OrganizationMembershipTest.java
@@ -193,7 +193,7 @@
       .shouldHaveTotal(1)
       .addMember("foo")
       .shouldHaveTotal(2);
-    page.getMembersByIdx(0).shouldBeNamed("admin", "Administrator").shouldHaveGroups(1);
+    page.getMembersByIdx(0).shouldBeNamed("admin", "Administrator").shouldHaveGroups(2);
     page.getMembersByIdx(1).shouldBeNamed("foo", "foo").shouldHaveGroups(0);
   }
 
@@ -220,16 +220,18 @@
     adminClient.organizations().addMember(orgKey, "foo");
 
     MembersPage page = nav.logIn().asAdmin().openOrganizationMembers(orgKey);
+    // foo user
     page.getMembersByIdx(1)
       .manageGroupsOpen()
       .manageGroupsSelect("owners")
       .manageGroupsSave()
       .shouldHaveGroups(1);
+    // admin user
     page.getMembersByIdx(0)
       .manageGroupsOpen()
       .manageGroupsSelect("owners")
       .manageGroupsSave()
-      .shouldHaveGroups(0);
+      .shouldHaveGroups(1);
   }
 
   @Test
