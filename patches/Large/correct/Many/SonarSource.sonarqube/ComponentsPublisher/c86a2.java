diff --git a/sonar-batch/src/main/java/org/sonar/batch/report/ComponentsPublisher.java b/sonar-batch/src/main/java/org/sonar/batch/report/ComponentsPublisher.java
index 181f38b..950fa92 100644
--- a/sonar-batch/src/main/java/org/sonar/batch/report/ComponentsPublisher.java
+++ b/sonar-batch/src/main/java/org/sonar/batch/report/ComponentsPublisher.java
@@ -92,7 +92,7 @@
       builder.addChildRefs(child.batchId());
     }
     if (ResourceUtils.isProject(r)) {
-      ProjectDefinition def = reactor.getProject(r.getEffectiveKey());
+      ProjectDefinition def = reactor.getProject(r.getKey());
       ComponentLink.Builder linkBuilder = ComponentLink.newBuilder();
 
       writeProjectLink(builder, def, linkBuilder, CoreProperties.LINKS_HOME_PAGE, ComponentLinkType.HOME);
