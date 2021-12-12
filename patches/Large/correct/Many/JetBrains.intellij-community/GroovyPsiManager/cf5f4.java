diff --git a/plugins/groovy/src/org/jetbrains/plugins/groovy/lang/psi/impl/GroovyPsiManager.java b/plugins/groovy/src/org/jetbrains/plugins/groovy/lang/psi/impl/GroovyPsiManager.java
index 5129951..acd5509 100644
--- a/plugins/groovy/src/org/jetbrains/plugins/groovy/lang/psi/impl/GroovyPsiManager.java
+++ b/plugins/groovy/src/org/jetbrains/plugins/groovy/lang/psi/impl/GroovyPsiManager.java
@@ -240,7 +240,7 @@
       return null;
     }
 
-    return ourGuard.doPreventingRecursion(element, false, computable);
+    return ourGuard.doPreventingRecursion(element, true, computable);
   }
 
 }
