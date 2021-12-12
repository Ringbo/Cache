diff --git a/grails-plugin-codecs/src/main/groovy/org/codehaus/groovy/grails/plugins/codecs/AbstractCharReplacementEncoder.java b/grails-plugin-codecs/src/main/groovy/org/codehaus/groovy/grails/plugins/codecs/AbstractCharReplacementEncoder.java
index 0926124..5c1efb0 100644
--- a/grails-plugin-codecs/src/main/groovy/org/codehaus/groovy/grails/plugins/codecs/AbstractCharReplacementEncoder.java
+++ b/grails-plugin-codecs/src/main/groovy/org/codehaus/groovy/grails/plugins/codecs/AbstractCharReplacementEncoder.java
@@ -72,7 +72,7 @@
             str = String.valueOf(o);
         }
 
-        if (str.length() == 0) {
+        if (str == null || str.length() == 0) {
             return str;
         }
 
