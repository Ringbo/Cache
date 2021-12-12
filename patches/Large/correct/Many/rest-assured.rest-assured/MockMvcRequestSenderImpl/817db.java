diff --git a/modules/spring-mock-mvc/src/main/java/io/restassured/module/mockmvc/internal/MockMvcRequestSenderImpl.java b/modules/spring-mock-mvc/src/main/java/io/restassured/module/mockmvc/internal/MockMvcRequestSenderImpl.java
index c604467..363ddff 100644
--- a/modules/spring-mock-mvc/src/main/java/io/restassured/module/mockmvc/internal/MockMvcRequestSenderImpl.java
+++ b/modules/spring-mock-mvc/src/main/java/io/restassured/module/mockmvc/internal/MockMvcRequestSenderImpl.java
@@ -181,7 +181,7 @@
             response = mvcResult.getResponse();
             restAssuredResponse = new MockMvcRestAssuredResponseImpl(perform, logRepository);
             restAssuredResponse.setConfig(ConfigConverter.convertToRestAssuredConfig(config));
-            restAssuredResponse.setContent(response.getContentAsString());
+            restAssuredResponse.setContent(response.getContentAsByteArray());
             restAssuredResponse.setContentType(response.getContentType());
             restAssuredResponse.setHasExpectations(false);
             restAssuredResponse.setStatusCode(response.getStatus());
