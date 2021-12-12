diff --git a/grails-core/src/main/groovy/org/grails/plugins/AbstractGrailsPluginManager.java b/grails-core/src/main/groovy/org/grails/plugins/AbstractGrailsPluginManager.java
index 7d7995e..e95551d 100644
--- a/grails-core/src/main/groovy/org/grails/plugins/AbstractGrailsPluginManager.java
+++ b/grails-core/src/main/groovy/org/grails/plugins/AbstractGrailsPluginManager.java
@@ -307,14 +307,14 @@
                 for (Class<?> artefact : plugin.getProvidedArtefacts()) {
                     String shortName = GrailsNameUtils.getShortName(artefact);
                     if (artefact.getName().equals(shortName)) {
-                        LOG.error("Plugin " + plugin.getName() + " has an artefact " + shortName + " without a package name " +
+                        LOG.warn("Plugin " + plugin.getName() + " has an artefact " + shortName + " without a package name " +
                                 "This could lead to artefacts being excluded from the application");
                         if (app.getClassForName(shortName) != null) {
                             LOG.error("Plugin " + plugin.getName() + " has an artefact " + shortName + " that is being excluded from " +
                                     "the application because another artefact exists with the same name without a package defined.");
                         }
                     }
-                    if (!isAlreadyRegistered(app, artefact, shortName)) {
+                    if (!isAlreadyRegistered(app, artefact)) {
                         app.addOverridableArtefact(artefact);
                     }
                 }
@@ -322,7 +322,7 @@
         }
     }
 
-    private boolean isAlreadyRegistered(GrailsApplication app, Class<?> artefact, String shortName) {
+    private boolean isAlreadyRegistered(GrailsApplication app, Class<?> artefact) {
         return app.getClassForName(artefact.getName()) != null;
     }
 
