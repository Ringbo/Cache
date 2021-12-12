diff --git a/server/sonar-server/src/main/java/org/sonar/server/ce/ws/ComponentAction.java b/server/sonar-server/src/main/java/org/sonar/server/ce/ws/ComponentAction.java
index 7122375..ce88ee6 100644
--- a/server/sonar-server/src/main/java/org/sonar/server/ce/ws/ComponentAction.java
+++ b/server/sonar-server/src/main/java/org/sonar/server/ce/ws/ComponentAction.java
@@ -66,7 +66,8 @@
         "<li>'Administer' rights on the specified component</li>" +
         "</ul>" +
         "Either '%s' or '%s' must be provided, not both.<br>" +
-        "Since 6.1, field \"logs\" is deprecated and its value is always false.")
+        "Since 6.1, field \"logs\" is deprecated and its value is always false.",
+        PARAM_COMPONENT_ID, PARAM_COMPONENT_KEY)
       .setSince("5.2")
       .setResponseExample(getClass().getResource("component-example.json"))
       .setHandler(this);
