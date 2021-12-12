diff --git a/sonar-server/src/main/java/org/sonar/server/rule2/ws/SetTagsAction.java b/sonar-server/src/main/java/org/sonar/server/rule2/ws/SetTagsAction.java
index c0b01cc..a322356 100644
--- a/sonar-server/src/main/java/org/sonar/server/rule2/ws/SetTagsAction.java
+++ b/sonar-server/src/main/java/org/sonar/server/rule2/ws/SetTagsAction.java
@@ -59,7 +59,7 @@
   @Override
   public void handle(Request request, Response response) {
     RuleKey key = RuleKey.parse(request.mandatoryParam("key"));
-    Set<String> tags = Sets.newHashSet(request.paramAsStrings("tags"));
+    Set<String> tags = Sets.newHashSet(request.mandatoryParamAsStrings("tags"));
     service.setTags(key, tags);
   }
 }
