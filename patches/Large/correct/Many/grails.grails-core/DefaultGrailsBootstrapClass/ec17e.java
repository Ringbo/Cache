diff --git a/src/commons/org/codehaus/groovy/grails/commons/DefaultGrailsBootstrapClass.java b/src/commons/org/codehaus/groovy/grails/commons/DefaultGrailsBootstrapClass.java
index affbf18..67a67cb 100644
--- a/src/commons/org/codehaus/groovy/grails/commons/DefaultGrailsBootstrapClass.java
+++ b/src/commons/org/codehaus/groovy/grails/commons/DefaultGrailsBootstrapClass.java
@@ -44,7 +44,7 @@
 	}
 
 	public void callDestroy() {
-		Closure destroy = getInitClosure();
+		Closure destroy = getDestroyClosure();
 		destroy.call();
 	}
 }
