diff --git a/jetty-start/src/main/java/org/eclipse/jetty/start/Main.java b/jetty-start/src/main/java/org/eclipse/jetty/start/Main.java
index dabd538..7530f01 100644
--- a/jetty-start/src/main/java/org/eclipse/jetty/start/Main.java
+++ b/jetty-start/src/main/java/org/eclipse/jetty/start/Main.java
@@ -386,7 +386,7 @@
                                     return false;
                                 }
 
-                                String name = path.getName(Locale.ENGLISH).toLowerCase();
+                                String name = path.getName().toLowerCase();
                                 return (name.startsWith("jetty") && name.endsWith(".xml"));
                             }
                         });
