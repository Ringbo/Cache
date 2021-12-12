diff --git a/bundles/ui/org.eclipse.smarthome.ui/src/main/java/org/eclipse/smarthome/ui/internal/proxy/ProxyServletService.java b/bundles/ui/org.eclipse.smarthome.ui/src/main/java/org/eclipse/smarthome/ui/internal/proxy/ProxyServletService.java
index 7d99e19..9bda8b1 100644
--- a/bundles/ui/org.eclipse.smarthome.ui/src/main/java/org/eclipse/smarthome/ui/internal/proxy/ProxyServletService.java
+++ b/bundles/ui/org.eclipse.smarthome.ui/src/main/java/org/eclipse/smarthome/ui/internal/proxy/ProxyServletService.java
@@ -115,7 +115,7 @@
             try {
                 ServletRequest.class.getMethod("startAsync");
                 impl = new AsyncProxyServlet(this);
-            } catch (Exception e) {
+            } catch (Throwable t) {
                 impl = new BlockingProxyServlet(this);
             }
         }
