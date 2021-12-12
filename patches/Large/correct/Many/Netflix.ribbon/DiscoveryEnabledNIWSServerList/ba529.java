diff --git a/ribbon-eureka/src/main/java/com/netflix/niws/loadbalancer/DiscoveryEnabledNIWSServerList.java b/ribbon-eureka/src/main/java/com/netflix/niws/loadbalancer/DiscoveryEnabledNIWSServerList.java
index 5c1c802..adbf6e9 100644
--- a/ribbon-eureka/src/main/java/com/netflix/niws/loadbalancer/DiscoveryEnabledNIWSServerList.java
+++ b/ribbon-eureka/src/main/java/com/netflix/niws/loadbalancer/DiscoveryEnabledNIWSServerList.java
@@ -124,7 +124,7 @@
                     ClientException.ErrorType.CONFIGURATION,
                     "Unable to get an instance of CommonClientConfigKey.NIWSServerListFilterClassName. Configured class:"
                             + niwsClientConfig
-                                    .getProperty(CommonClientConfigKey.NIWSServerListFilterClassName));
+                                    .getProperty(CommonClientConfigKey.NIWSServerListFilterClassName), e);
         }
 
     }
