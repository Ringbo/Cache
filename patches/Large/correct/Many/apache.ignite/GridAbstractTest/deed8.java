diff --git a/modules/core/src/test/java/org/apache/ignite/testframework/junits/GridAbstractTest.java b/modules/core/src/test/java/org/apache/ignite/testframework/junits/GridAbstractTest.java
index f5784eb..5566137 100755
--- a/modules/core/src/test/java/org/apache/ignite/testframework/junits/GridAbstractTest.java
+++ b/modules/core/src/test/java/org/apache/ignite/testframework/junits/GridAbstractTest.java
@@ -2507,7 +2507,7 @@
                     cnt = 0;
 
                     for (Method m : this0.getClass().getMethods())
-                        if (m.getName().startsWith("test") && Modifier.isPublic(m.getModifiers()))
+                        if (m.getName().startsWith("test") && Modifier.isPublic(m.getModifiers()) && m.getParameterCount() == 0)
                             cnt++;
                 }
 
