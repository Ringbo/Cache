diff --git a/src/web/org/codehaus/groovy/grails/web/mapping/DefaultUrlMappingInfo.java b/src/web/org/codehaus/groovy/grails/web/mapping/DefaultUrlMappingInfo.java
index db62e8a..d9bba23 100644
--- a/src/web/org/codehaus/groovy/grails/web/mapping/DefaultUrlMappingInfo.java
+++ b/src/web/org/codehaus/groovy/grails/web/mapping/DefaultUrlMappingInfo.java
@@ -256,7 +256,7 @@
         if (disableMultipart instanceof Boolean) {
             disabled = ((Boolean) disableMultipart).booleanValue();
         } else if (disableMultipart instanceof String) {
-            disabled = Boolean.parseBoolean((String) disableMultipart);
+            disabled = Boolean.valueOf((String) disableMultipart);
         }
         return disabled;
     }
