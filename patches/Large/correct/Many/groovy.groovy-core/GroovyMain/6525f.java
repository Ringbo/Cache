diff --git a/src/main/groovy/ui/GroovyMain.java b/src/main/groovy/ui/GroovyMain.java
index 6f27d21..331fba0 100644
--- a/src/main/groovy/ui/GroovyMain.java
+++ b/src/main/groovy/ui/GroovyMain.java
@@ -233,10 +233,10 @@
                 processOnce();
             }
             return true;
-        } catch (Exception e) {
+        } catch (Throwable e) {
             if (e instanceof InvokerInvocationException) {
                 InvokerInvocationException iie = (InvokerInvocationException) e;
-                e = (Exception) iie.getCause();
+                e = iie.getCause();
             }
             System.err.println("Caught: " + e);
             if (debug) {
