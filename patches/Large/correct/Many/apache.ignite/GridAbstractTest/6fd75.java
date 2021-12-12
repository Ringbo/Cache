diff --git a/modules/core/src/test/java/org/gridgain/testframework/junits/GridAbstractTest.java b/modules/core/src/test/java/org/gridgain/testframework/junits/GridAbstractTest.java
index 922acc4..5900c12 100644
--- a/modules/core/src/test/java/org/gridgain/testframework/junits/GridAbstractTest.java
+++ b/modules/core/src/test/java/org/gridgain/testframework/junits/GridAbstractTest.java
@@ -1402,7 +1402,8 @@
                 int cnt = 0;
 
                 for (Method m : GridAbstractTest.this.getClass().getMethods())
-                    if (m.getDeclaringClass().getName().startsWith("org.gridgain")) {
+                    if (m.getDeclaringClass().getName().startsWith("org.gridgain") ||
+                        m.getDeclaringClass().getName().startsWith("org.apache.ignite")) {
                         if (m.getName().startsWith("test") && Modifier.isPublic(m.getModifiers()))
                             cnt++;
                     }
