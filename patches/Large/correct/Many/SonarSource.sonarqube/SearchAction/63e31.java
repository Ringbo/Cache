diff --git a/server/sonar-server/src/main/java/org/sonar/server/usergroups/ws/SearchAction.java b/server/sonar-server/src/main/java/org/sonar/server/usergroups/ws/SearchAction.java
index fb2b8a9..1519c60 100644
--- a/server/sonar-server/src/main/java/org/sonar/server/usergroups/ws/SearchAction.java
+++ b/server/sonar-server/src/main/java/org/sonar/server/usergroups/ws/SearchAction.java
@@ -98,7 +98,7 @@
     }
   }
 
-  private void writeGroups(JsonWriter json, List<GroupDto> groups, Map<String, Integer> userCountByGroup, Set<String> fields) {
+  private static void writeGroups(JsonWriter json, List<GroupDto> groups, Map<String, Integer> userCountByGroup, Set<String> fields) {
     json.name("groups").beginArray();
     for (GroupDto group : groups) {
       writeGroup(json, group, userCountByGroup.get(group.getName()), fields);
@@ -106,7 +106,7 @@
     json.endArray();
   }
 
-  private void writeGroup(JsonWriter json, GroupDto group, Integer memberCount, Set<String> fields) {
+  private static void writeGroup(JsonWriter json, GroupDto group, Integer memberCount, Set<String> fields) {
     json.beginObject()
       .prop(FIELD_ID, group.getId().toString())
       .prop(FIELD_NAME, fields.contains(FIELD_NAME) ? group.getName() : null)
@@ -115,7 +115,7 @@
       .endObject();
   }
 
-  private Set<String> neededFields(Request request) {
+  private static Set<String> neededFields(Request request) {
     Set<String> fields = Sets.newHashSet();
     List<String> fieldsFromRequest = request.paramAsStrings(Param.FIELDS);
     if (fieldsFromRequest == null || fieldsFromRequest.isEmpty()) {
