diff --git a/src/web/org/codehaus/groovy/grails/web/taglib/GroovySetTag.java b/src/web/org/codehaus/groovy/grails/web/taglib/GroovySetTag.java
index 4c64805..aa617d1 100644
--- a/src/web/org/codehaus/groovy/grails/web/taglib/GroovySetTag.java
+++ b/src/web/org/codehaus/groovy/grails/web/taglib/GroovySetTag.java
@@ -55,6 +55,6 @@
     }
 
     public boolean hasPrecedingContent() {
-        return false;
+        return true;
     }
 }
