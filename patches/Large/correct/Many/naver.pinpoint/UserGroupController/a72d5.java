diff --git a/web/src/main/java/com/navercorp/pinpoint/web/controller/UserGroupController.java b/web/src/main/java/com/navercorp/pinpoint/web/controller/UserGroupController.java
index 61e4afc..db42f09 100644
--- a/web/src/main/java/com/navercorp/pinpoint/web/controller/UserGroupController.java
+++ b/web/src/main/java/com/navercorp/pinpoint/web/controller/UserGroupController.java
@@ -127,7 +127,7 @@
     @RequestMapping(value = "/member", method = RequestMethod.POST)
     @ResponseBody
     public Map<String, String> insertUserGroupMember(@RequestBody UserGroupMember userGroupMember) {
-        if (StringUtils.isEmpty(userGroupMember.getMemberId()) || StringUtils.isEmpty(userGroupMember.getMemberId())) {
+        if (StringUtils.isEmpty(userGroupMember.getMemberId()) || StringUtils.isEmpty(userGroupMember.getUserGroupId())) {
             Map<String, String> result = new HashMap<>();
             result.put("errorCode", "500");
             result.put("errorMessage", "there is not userGroupId or memberId in params to insert user group member");
