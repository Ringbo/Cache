diff --git a/jetty-io/src/main/java/org/eclipse/jetty/io/nio/SelectorManager.java b/jetty-io/src/main/java/org/eclipse/jetty/io/nio/SelectorManager.java
index 1b33306..e89ca92 100644
--- a/jetty-io/src/main/java/org/eclipse/jetty/io/nio/SelectorManager.java
+++ b/jetty-io/src/main/java/org/eclipse/jetty/io/nio/SelectorManager.java
@@ -440,7 +440,7 @@
                         else
                             throw new IllegalArgumentException(o.toString());
                     }
-                    catch (CancelledKeyException e)
+                    catch (Exception e)
                     {
                         if (isRunning())
                             Log.warn(e);
