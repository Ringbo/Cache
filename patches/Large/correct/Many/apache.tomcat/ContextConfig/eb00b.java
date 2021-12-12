diff --git a/java/org/apache/catalina/startup/ContextConfig.java b/java/org/apache/catalina/startup/ContextConfig.java
index 765a320..9af8966 100644
--- a/java/org/apache/catalina/startup/ContextConfig.java
+++ b/java/org/apache/catalina/startup/ContextConfig.java
@@ -1027,7 +1027,7 @@
             for (int j = 0; j < roles.length; j++) {
                 if (!"*".equals(roles[j]) &&
                     !context.findSecurityRole(roles[j])) {
-                    log.info(sm.getString("contextConfig.role.auth", roles[j]));
+                    log.warn(sm.getString("contextConfig.role.auth", roles[j]));
                     context.addSecurityRole(roles[j]);
                 }
             }
@@ -1039,14 +1039,14 @@
             Wrapper wrapper = (Wrapper) wrappers[i];
             String runAs = wrapper.getRunAs();
             if ((runAs != null) && !context.findSecurityRole(runAs)) {
-                log.info(sm.getString("contextConfig.role.runas", runAs));
+                log.warn(sm.getString("contextConfig.role.runas", runAs));
                 context.addSecurityRole(runAs);
             }
             String names[] = wrapper.findSecurityReferences();
             for (int j = 0; j < names.length; j++) {
                 String link = wrapper.findSecurityReference(names[j]);
                 if ((link != null) && !context.findSecurityRole(link)) {
-                    log.info(sm.getString("contextConfig.role.link", link));
+                    log.warn(sm.getString("contextConfig.role.link", link));
                     context.addSecurityRole(link);
                 }
             }
