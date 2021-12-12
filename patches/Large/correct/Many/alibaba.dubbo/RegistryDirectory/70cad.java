diff --git a/dubbo-registry/src/main/java/com/alibaba/dubbo/registry/support/RegistryDirectory.java b/dubbo-registry/src/main/java/com/alibaba/dubbo/registry/support/RegistryDirectory.java
index 013f5be..65f243e 100644
--- a/dubbo-registry/src/main/java/com/alibaba/dubbo/registry/support/RegistryDirectory.java
+++ b/dubbo-registry/src/main/java/com/alibaba/dubbo/registry/support/RegistryDirectory.java
@@ -104,7 +104,7 @@
         this.serviceKey = url.getServiceKey();
         this.queryMap = StringUtils.parseQueryString(url.getParameterAndDecoded(RpcConstants.REFER_KEY));
         this.directoryUrl = url.removeParameter(RpcConstants.REFER_KEY).addParameters(queryMap);
-        String group = directoryUrl.getParameter( Constants.GROUP_KEY );
+        String group = directoryUrl.getParameter( Constants.GROUP_KEY, "" );
         this.multiGroup = "*".equals(group) || group.contains( "," );
     }
 
