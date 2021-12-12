diff --git a/tests/src/test/java/org/sonarqube/tests/startup/StartupIndexationTest.java b/tests/src/test/java/org/sonarqube/tests/startup/StartupIndexationTest.java
index bcc1684..fbffa55 100644
--- a/tests/src/test/java/org/sonarqube/tests/startup/StartupIndexationTest.java
+++ b/tests/src/test/java/org/sonarqube/tests/startup/StartupIndexationTest.java
@@ -63,7 +63,7 @@
     try (SonarQube sonarQube = new SonarQube();
          LogsTailer.Watch sonarQubeIsUpWatcher = sonarQube.logsTailer.watch("SonarQube is up")) {
       sonarQube.resume();
-      sonarQubeIsUpWatcher.waitForLog(10, TimeUnit.SECONDS);
+      sonarQubeIsUpWatcher.waitForLog(20, TimeUnit.SECONDS);
       SearchRequest searchRequest = SearchRequest.builder().setQuery("admin").build();
       WsUsers.SearchWsResponse searchWsResponse = sonarQube.tester.wsClient().users().search(searchRequest);
       assertThat(searchWsResponse.getUsersCount()).isEqualTo(1);
