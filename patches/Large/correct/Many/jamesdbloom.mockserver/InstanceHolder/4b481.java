diff --git a/mockserver-maven-plugin/src/main/java/org/mockserver/maven/InstanceHolder.java b/mockserver-maven-plugin/src/main/java/org/mockserver/maven/InstanceHolder.java
index 826340f..adf0f6b 100644
--- a/mockserver-maven-plugin/src/main/java/org/mockserver/maven/InstanceHolder.java
+++ b/mockserver-maven-plugin/src/main/java/org/mockserver/maven/InstanceHolder.java
@@ -65,12 +65,12 @@
         }
     }
 
-    public void stop(final int mockServerPort, final int proxyPort) {
+    public void stop(final int mockServerPort, final int proxyPort, boolean ignoreFailure) {
         if (mockServerPort != -1) {
-            getMockServerClient(mockServerPort).stop();
+            getMockServerClient(mockServerPort).stop(ignoreFailure);
         }
         if (proxyPort != -1) {
-            getProxyClient(proxyPort).stop();
+            getProxyClient(proxyPort).stop(ignoreFailure);
         }
     }
 
