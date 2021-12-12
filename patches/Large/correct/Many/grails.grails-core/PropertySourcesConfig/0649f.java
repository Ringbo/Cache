diff --git a/grails-core/src/main/groovy/org/grails/config/PropertySourcesConfig.java b/grails-core/src/main/groovy/org/grails/config/PropertySourcesConfig.java
index 276751f..0f70ca2 100644
--- a/grails-core/src/main/groovy/org/grails/config/PropertySourcesConfig.java
+++ b/grails-core/src/main/groovy/org/grails/config/PropertySourcesConfig.java
@@ -83,7 +83,7 @@
             }
         }
 
-        configMap.merge(map, true);
+        configMap.putAll(map);
     }
 
     public void setClassLoader(ClassLoader classLoader) {
