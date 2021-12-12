diff --git a/it/it-tests/src/test/java/it/organization/OrganizationTest.java b/it/it-tests/src/test/java/it/organization/OrganizationTest.java
index 93dbd36..22b9718 100644
--- a/it/it-tests/src/test/java/it/organization/OrganizationTest.java
+++ b/it/it-tests/src/test/java/it/organization/OrganizationTest.java
@@ -369,7 +369,7 @@
     List<WsUsers.GroupsWsResponse.Group> result = adminClient.users().groups(
       GroupsRequest.builder().setLogin(userLogin).setOrganization(KEY).build()).getGroupsList();
 
-    assertThat(result).extracting(WsUsers.GroupsWsResponse.Group::getName).containsOnly(groupName);
+    assertThat(result).extracting(WsUsers.GroupsWsResponse.Group::getName).containsOnly(groupName, "Members");
   }
 
   private WsComponents.SearchWsResponse searchSampleProject(String organizationKey, ComponentsService componentsService) {
