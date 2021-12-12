diff --git a/web/src/test/java/org/apache/shiro/web/DefaultWebSecurityManagerTest.java b/web/src/test/java/org/apache/shiro/web/DefaultWebSecurityManagerTest.java
index eb2f1ee..9f7facb 100644
--- a/web/src/test/java/org/apache/shiro/web/DefaultWebSecurityManagerTest.java
+++ b/web/src/test/java/org/apache/shiro/web/DefaultWebSecurityManagerTest.java
@@ -92,7 +92,7 @@
         assertEquals(session.getTimeout(), globalTimeout);
         session.setTimeout(125);
         assertEquals(session.getTimeout(), 125);
-        sleep(150);
+        sleep(200);
         try {
             session.getTimeout();
             fail("Session should have expired.");
