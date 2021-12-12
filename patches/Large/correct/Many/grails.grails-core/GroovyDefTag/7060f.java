diff --git a/src/web/org/codehaus/groovy/grails/web/taglib/GroovyDefTag.java b/src/web/org/codehaus/groovy/grails/web/taglib/GroovyDefTag.java
index 6aa4032..fc37c4b 100644
--- a/src/web/org/codehaus/groovy/grails/web/taglib/GroovyDefTag.java
+++ b/src/web/org/codehaus/groovy/grails/web/taglib/GroovyDefTag.java
@@ -56,6 +56,6 @@
     }
 
     public boolean hasPrecedingContent() {
-        return false;
+        return true;
     }
 }
