diff --git a/grails-web/src/main/groovy/org/codehaus/groovy/grails/web/servlet/mvc/GrailsParameterMap.java b/grails-web/src/main/groovy/org/codehaus/groovy/grails/web/servlet/mvc/GrailsParameterMap.java
index ebbd137..bc55abd 100644
--- a/grails-web/src/main/groovy/org/codehaus/groovy/grails/web/servlet/mvc/GrailsParameterMap.java
+++ b/grails-web/src/main/groovy/org/codehaus/groovy/grails/web/servlet/mvc/GrailsParameterMap.java
@@ -215,7 +215,7 @@
                 remainderOfKey = '_' + remainderOfKey;
             }
             nestedMap.put(remainderOfKey,getParameterValue(requestMap, key));
-            if (remainderOfKey.indexOf('.') >-1) {
+            if (!(nestedMap instanceof GrailsParameterMap) && remainderOfKey.indexOf('.') >-1) {
                 processNestedKeys(requestMap, key, remainderOfKey, nestedMap);
             }
         }
