diff --git a/java/org/apache/catalina/core/StandardWrapperValve.java b/java/org/apache/catalina/core/StandardWrapperValve.java
index b35149a..887b1e6 100644
--- a/java/org/apache/catalina/core/StandardWrapperValve.java
+++ b/java/org/apache/catalina/core/StandardWrapperValve.java
@@ -238,13 +238,13 @@
             exception(request, response, e);
         } catch (IOException e) {
         	request.removeAttribute(Globals.JSP_FILE_ATTR);
-            container.getLogger().warn(sm.getString("standardWrapper.serviceException",
+            container.getLogger().error(sm.getString("standardWrapper.serviceException",
                              wrapper.getName()), e);
             throwable = e;
             exception(request, response, e);
         } catch (UnavailableException e) {
         	request.removeAttribute(Globals.JSP_FILE_ATTR);
-            container.getLogger().warn(sm.getString("standardWrapper.serviceException",
+            container.getLogger().error(sm.getString("standardWrapper.serviceException",
                              wrapper.getName()), e);
             //            throwable = e;
             //            exception(request, response, e);
@@ -425,13 +425,13 @@
             exception(request, response, e);
         } catch (IOException e) {
             request.removeAttribute(Globals.JSP_FILE_ATTR);
-            container.getLogger().warn(sm.getString("standardWrapper.serviceException",
+            container.getLogger().error(sm.getString("standardWrapper.serviceException",
                              wrapper.getName()), e);
             throwable = e;
             exception(request, response, e);
         } catch (UnavailableException e) {
             request.removeAttribute(Globals.JSP_FILE_ATTR);
-            container.getLogger().warn(sm.getString("standardWrapper.serviceException",
+            container.getLogger().error(sm.getString("standardWrapper.serviceException",
                              wrapper.getName()), e);
             // Do not save exception in 'throwable', because we
             // do not want to do exception(request, response, e) processing
