diff --git a/src/main/groovy/lang/GroovyClassLoader.java b/src/main/groovy/lang/GroovyClassLoader.java
index bbaefcf..235e765 100644
--- a/src/main/groovy/lang/GroovyClassLoader.java
+++ b/src/main/groovy/lang/GroovyClassLoader.java
@@ -701,7 +701,7 @@
                     // if recompilation fails, we want cls==null
                     Class oldClass = cls;
                     cls = null;
-                    cls = recompile(source, name, cls);
+                    cls = recompile(source, name, oldClass);
                 } catch (IOException ioe) {
                     last = new ClassNotFoundException("IOException while opening groovy source: " + name, ioe);
                 } finally {
