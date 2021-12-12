diff --git a/src/main/org/codehaus/groovy/control/ClassNodeResolver.java b/src/main/org/codehaus/groovy/control/ClassNodeResolver.java
index f91e830..2fabb21 100644
--- a/src/main/org/codehaus/groovy/control/ClassNodeResolver.java
+++ b/src/main/org/codehaus/groovy/control/ClassNodeResolver.java
@@ -185,7 +185,7 @@
             LookupResult lr = tryAsScript(name, compilationUnit, null);
             return lr;
         } catch (CompilationFailedException cfe) {
-            throw new GroovyBugError("The lookup for "+name+" caused a failed compilaton. There should not have been any compilation from this call.");
+            throw new GroovyBugError("The lookup for "+name+" caused a failed compilaton. There should not have been any compilation from this call.", cfe);
         }
         //TODO: the case of a NoClassDefFoundError needs a bit more research
         // a simple recompilation is not possible it seems. The current class
