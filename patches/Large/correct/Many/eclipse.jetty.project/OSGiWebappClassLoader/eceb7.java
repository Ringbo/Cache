diff --git a/jetty-osgi/jetty-osgi-boot/src/main/java/org/eclipse/jetty/osgi/boot/internal/webapp/OSGiWebappClassLoader.java b/jetty-osgi/jetty-osgi-boot/src/main/java/org/eclipse/jetty/osgi/boot/internal/webapp/OSGiWebappClassLoader.java
index 88ed126..13d3c1a 100644
--- a/jetty-osgi/jetty-osgi-boot/src/main/java/org/eclipse/jetty/osgi/boot/internal/webapp/OSGiWebappClassLoader.java
+++ b/jetty-osgi/jetty-osgi-boot/src/main/java/org/eclipse/jetty/osgi/boot/internal/webapp/OSGiWebappClassLoader.java
@@ -124,7 +124,7 @@
         while (e!=null && e.hasMoreElements())
             list.add(e.nextElement());
         while (e2!=null && e2.hasMoreElements())
-            list.add(e.nextElement());
+            list.add(e2.nextElement());
         return list;
     }
 
