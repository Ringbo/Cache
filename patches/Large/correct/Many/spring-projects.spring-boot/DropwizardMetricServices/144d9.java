diff --git a/spring-boot-actuator/src/main/java/org/springframework/boot/actuate/metrics/dropwizard/DropwizardMetricServices.java b/spring-boot-actuator/src/main/java/org/springframework/boot/actuate/metrics/dropwizard/DropwizardMetricServices.java
index 98a70ad..571841d 100644
--- a/spring-boot-actuator/src/main/java/org/springframework/boot/actuate/metrics/dropwizard/DropwizardMetricServices.java
+++ b/spring-boot-actuator/src/main/java/org/springframework/boot/actuate/metrics/dropwizard/DropwizardMetricServices.java
@@ -148,7 +148,7 @@
 		}
 		catch (IllegalArgumentException ex) {
 			Metric added = this.registry.getMetrics().get(name);
-			registrar.checkExisting(metric);
+			registrar.checkExisting(added);
 			return (T) added;
 		}
 	}
