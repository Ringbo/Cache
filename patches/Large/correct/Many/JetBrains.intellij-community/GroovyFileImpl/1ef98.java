diff --git a/plugins/groovy/src/org/jetbrains/plugins/groovy/lang/psi/impl/GroovyFileImpl.java b/plugins/groovy/src/org/jetbrains/plugins/groovy/lang/psi/impl/GroovyFileImpl.java
index 300ced4..736a800 100644
--- a/plugins/groovy/src/org/jetbrains/plugins/groovy/lang/psi/impl/GroovyFileImpl.java
+++ b/plugins/groovy/src/org/jetbrains/plugins/groovy/lang/psi/impl/GroovyFileImpl.java
@@ -261,7 +261,7 @@
       return true;
     }
 
-    return GroovyDslFileIndex.processExecutors(getProject(), new GroovyScriptDescriptor(this, scriptClass), processor);
+    return GroovyDslFileIndex.processExecutors(getProject(), new GroovyScriptDescriptor(this, scriptClass, place), processor);
   }
 
 
