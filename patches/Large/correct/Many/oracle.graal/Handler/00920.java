diff --git a/vm/src/org.graalvm.component.installer.test/src/org/graalvm/component/installer/persist/test/Handler.java b/vm/src/org.graalvm.component.installer.test/src/org/graalvm/component/installer/persist/test/Handler.java
index baff5ba..561a199 100644
--- a/vm/src/org.graalvm.component.installer.test/src/org/graalvm/component/installer/persist/test/Handler.java
+++ b/vm/src/org.graalvm.component.installer.test/src/org/graalvm/component/installer/persist/test/Handler.java
@@ -92,7 +92,7 @@
         return doOpenConnection(u, c);
     }
     
-    private URLConnection doOpenConnection(URL u, URLConnection c) throws IOException {
+    private static URLConnection doOpenConnection(URL u, URLConnection c) throws IOException {
         visitedURLs.add(u.toString());
         if (c != null) {
             return c;
