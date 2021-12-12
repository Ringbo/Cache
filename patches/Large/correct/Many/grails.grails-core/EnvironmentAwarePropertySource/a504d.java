diff --git a/grails-core/src/main/groovy/org/grails/config/EnvironmentAwarePropertySource.java b/grails-core/src/main/groovy/org/grails/config/EnvironmentAwarePropertySource.java
index 536e1ec..5001c22 100644
--- a/grails-core/src/main/groovy/org/grails/config/EnvironmentAwarePropertySource.java
+++ b/grails-core/src/main/groovy/org/grails/config/EnvironmentAwarePropertySource.java
@@ -46,7 +46,10 @@
             Environment env = Environment.getCurrent();
             String key = "environments." + env.getName();
             for(PropertySource propertySource : source) {
-                if((propertySource != this) && propertySource instanceof EnumerablePropertySource) {
+
+                if((propertySource != this) &&
+                        !propertySource.getName().contains("plugin") && // plugin default configuration is not allowed to be environment aware (GRAILS-12123)
+                            propertySource instanceof EnumerablePropertySource) {
                     EnumerablePropertySource enumerablePropertySource = (EnumerablePropertySource)propertySource;
 
                     for(String propertyName : enumerablePropertySource.getPropertyNames()) {
