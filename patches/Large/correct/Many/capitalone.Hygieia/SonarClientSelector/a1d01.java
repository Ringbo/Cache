diff --git a/collectors/build/sonar/src/main/java/com/capitalone/dashboard/collector/SonarClientSelector.java b/collectors/build/sonar/src/main/java/com/capitalone/dashboard/collector/SonarClientSelector.java
index 40ce82a..0424447 100644
--- a/collectors/build/sonar/src/main/java/com/capitalone/dashboard/collector/SonarClientSelector.java
+++ b/collectors/build/sonar/src/main/java/com/capitalone/dashboard/collector/SonarClientSelector.java
@@ -17,6 +17,6 @@
     }
 
     public SonarClient getSonarClient(Double version) {
-        return ((version == null) || (version < 6.0)) ? sonarClient : sonar6Client;
+        return ((version == null) || (version < 6.3)) ? sonarClient : sonar6Client;
     }
 }
