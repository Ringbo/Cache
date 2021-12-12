diff --git a/src/fitnesse/wiki/ProxyPageTest.java b/src/fitnesse/wiki/ProxyPageTest.java
index 7a76aa1..4c1b6bf 100644
--- a/src/fitnesse/wiki/ProxyPageTest.java
+++ b/src/fitnesse/wiki/ProxyPageTest.java
@@ -105,6 +105,6 @@
   public void testGetVersions() {
     Collection<VersionInfo> versions = proxy.getVersions();
     assertNotNull(versions);
-    assertEquals(3, versions.size());
+    assertEquals(2, versions.size());
   }
 }
