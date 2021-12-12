diff --git a/server/sonar-server/src/main/java/org/sonar/server/search/SearchClient.java b/server/sonar-server/src/main/java/org/sonar/server/search/SearchClient.java
index 3db7c21..6f3aa12 100644
--- a/server/sonar-server/src/main/java/org/sonar/server/search/SearchClient.java
+++ b/server/sonar-server/src/main/java/org/sonar/server/search/SearchClient.java
@@ -100,7 +100,7 @@
       }
       return response;
     } catch (Exception e) {
-      LOGGER.error("could not execute request: " + response, e);
+      LOGGER.error("could not execute request: " + request, e);
       throw new IllegalStateException("ES error: ", e);
     }
   }
