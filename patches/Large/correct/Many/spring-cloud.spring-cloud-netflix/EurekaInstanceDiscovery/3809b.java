diff --git a/spring-cloud-netflix-turbine/src/main/java/org/springframework/cloud/netflix/turbine/EurekaInstanceDiscovery.java b/spring-cloud-netflix-turbine/src/main/java/org/springframework/cloud/netflix/turbine/EurekaInstanceDiscovery.java
index 57703f4..d94b92f 100644
--- a/spring-cloud-netflix-turbine/src/main/java/org/springframework/cloud/netflix/turbine/EurekaInstanceDiscovery.java
+++ b/spring-cloud-netflix-turbine/src/main/java/org/springframework/cloud/netflix/turbine/EurekaInstanceDiscovery.java
@@ -136,7 +136,7 @@
 			}
 		}
 		catch (Exception e) {
-			log.info("Failed to retrieve instances from Eureka");
+			log.warn("Failed to retrieve instances from Eureka", e);
 		}
 		return instances;
 	}
