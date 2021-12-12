diff --git a/bundles/automation/org.eclipse.smarthome.automation.rest/src/main/java/org/eclipse/smarthome/automation/rest/internal/RuleResource.java b/bundles/automation/org.eclipse.smarthome.automation.rest/src/main/java/org/eclipse/smarthome/automation/rest/internal/RuleResource.java
index bab1edc..0ffb232 100644
--- a/bundles/automation/org.eclipse.smarthome.automation.rest/src/main/java/org/eclipse/smarthome/automation/rest/internal/RuleResource.java
+++ b/bundles/automation/org.eclipse.smarthome.automation.rest/src/main/java/org/eclipse/smarthome/automation/rest/internal/RuleResource.java
@@ -171,7 +171,7 @@
             return Response.status(Status.NOT_FOUND).build();
         }
 
-        return Response.ok().build();
+        return Response.ok(null, MediaType.TEXT_PLAIN).build();
     }
 
     @PUT
@@ -190,7 +190,7 @@
             return Response.status(Status.NOT_FOUND).build();
         }
 
-        return Response.ok().build();
+        return Response.ok(null, MediaType.TEXT_PLAIN).build();
     }
 
     @GET
@@ -229,7 +229,7 @@
         } else {
             rule.setConfiguration(new Configuration(config));
             ruleRegistry.update(rule);
-            return Response.ok().build();
+            return Response.ok(null, MediaType.TEXT_PLAIN).build();
         }
     }
 
@@ -249,7 +249,7 @@
         } else {
             ruleRegistry.setEnabled(ruleUID, !"false".equalsIgnoreCase(enabled));
             // ruleRegistry.update(rule);
-            return Response.ok().build();
+            return Response.ok(null, MediaType.TEXT_PLAIN).build();
         }
     }
 
@@ -268,7 +268,7 @@
             return Response.status(Status.NOT_FOUND).build();
         } else {
             ruleRegistry.runNow(ruleUID);
-            return Response.ok().build();
+            return Response.ok(null, MediaType.TEXT_PLAIN).build();
         }
     }
 
@@ -399,7 +399,7 @@
                 configuration.put(param, ConfigUtil.normalizeType(value));
                 module.setConfiguration(configuration);
                 ruleRegistry.update(rule);
-                return Response.ok().build();
+                return Response.ok(null, MediaType.TEXT_PLAIN).build();
             }
         }
         return Response.status(Status.NOT_FOUND).build();
