diff --git a/pact/pact-clients/src/main/java/eu/stratosphere/pact/client/CliFrontend.java b/pact/pact-clients/src/main/java/eu/stratosphere/pact/client/CliFrontend.java
index 3adabf6..47de3bc 100644
--- a/pact/pact-clients/src/main/java/eu/stratosphere/pact/client/CliFrontend.java
+++ b/pact/pact-clients/src/main/java/eu/stratosphere/pact/client/CliFrontend.java
@@ -490,7 +490,7 @@
 				if(scheduledJobs.size() == 0) {
 					System.out.println("No scheduled jobs.");
 				} else {
-					Collections.sort(runningJobs, njec);
+					Collections.sort(scheduledJobs, njec);
 					
 					System.out.println("----------------------- Scheduled Jobs -----------------------");
 					for(RecentJobEvent je : scheduledJobs) {
