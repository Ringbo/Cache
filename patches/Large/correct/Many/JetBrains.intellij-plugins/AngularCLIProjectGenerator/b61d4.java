diff --git a/AngularJS/src/org/angular2/cli/AngularCLIProjectGenerator.java b/AngularJS/src/org/angular2/cli/AngularCLIProjectGenerator.java
index fd716d6..e98c0b6 100644
--- a/AngularJS/src/org/angular2/cli/AngularCLIProjectGenerator.java
+++ b/AngularJS/src/org/angular2/cli/AngularCLIProjectGenerator.java
@@ -286,7 +286,7 @@
             localFile = localFile.getParent().getParent().getParent();
             try {
               options = SchematicsLoader.INSTANCE
-                .load(ProjectManager.getInstance().getDefaultProject(), localFile, true)
+                .load(ProjectManager.getInstance().getDefaultProject(), localFile, true, false)
                 .stream()
                 .filter(s -> "ng-new".equals(s.getName()))
                 .findFirst()
@@ -300,7 +300,7 @@
                 .orElse(Collections.emptyList());
             }
             catch (Exception e) {
-              LOG.error("Failed to load schematics");
+              LOG.error("Failed to load schematics", e);
             }
           }
         }
