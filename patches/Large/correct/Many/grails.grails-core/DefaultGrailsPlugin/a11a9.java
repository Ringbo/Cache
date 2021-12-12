diff --git a/src/java/org/codehaus/groovy/grails/plugins/DefaultGrailsPlugin.java b/src/java/org/codehaus/groovy/grails/plugins/DefaultGrailsPlugin.java
index ebd9b2d..fa04c14 100644
--- a/src/java/org/codehaus/groovy/grails/plugins/DefaultGrailsPlugin.java
+++ b/src/java/org/codehaus/groovy/grails/plugins/DefaultGrailsPlugin.java
@@ -297,7 +297,7 @@
         if(this.pluginBean.isReadableProperty(ON_CHANGE)) {
             this.onChangeListener = (Closure) GrailsClassUtils.getPropertyOrStaticPropertyOrFieldValue(this.plugin, ON_CHANGE);
         }
-        if(Environment.getCurrent().isReloadEnabled()) {
+        if(Environment.getCurrent().isReloadEnabled() || !Metadata.getCurrent().isWarDeployed()) {
             if(this.onChangeListener!=null) {
                 Object referencedResources = GrailsClassUtils.getPropertyOrStaticPropertyOrFieldValue(this.plugin, WATCHED_RESOURCES);
 
