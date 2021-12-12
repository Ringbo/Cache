diff --git a/jetty-osgi/jetty-osgi-boot/src/main/java/org/eclipse/jetty/osgi/boot/AbstractContextProvider.java b/jetty-osgi/jetty-osgi-boot/src/main/java/org/eclipse/jetty/osgi/boot/AbstractContextProvider.java
index 5865137..fa8c045 100644
--- a/jetty-osgi/jetty-osgi-boot/src/main/java/org/eclipse/jetty/osgi/boot/AbstractContextProvider.java
+++ b/jetty-osgi/jetty-osgi-boot/src/main/java/org/eclipse/jetty/osgi/boot/AbstractContextProvider.java
@@ -128,7 +128,7 @@
             }
             
             //Set the base resource of the ContextHandler, if not already set, can also be overridden by the context xml file
-            if (_contextHandler.getBaseResource() == null)
+            if (_contextHandler != null && _contextHandler.getBaseResource() == null)
             {
                 _contextHandler.setBaseResource(rootResource);
             }
