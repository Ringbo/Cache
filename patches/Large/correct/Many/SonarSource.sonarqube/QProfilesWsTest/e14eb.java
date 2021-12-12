diff --git a/sonar-server/src/test/java/org/sonar/server/qualityprofile/ws/QProfilesWsTest.java b/sonar-server/src/test/java/org/sonar/server/qualityprofile/ws/QProfilesWsTest.java
index fd8b514..c51e641 100644
--- a/sonar-server/src/test/java/org/sonar/server/qualityprofile/ws/QProfilesWsTest.java
+++ b/sonar-server/src/test/java/org/sonar/server/qualityprofile/ws/QProfilesWsTest.java
@@ -52,7 +52,7 @@
     assertThat(controller).isNotNull();
     assertThat(controller.path()).isEqualTo(QProfilesWs.API_ENDPOINT);
     assertThat(controller.description()).isNotEmpty();
-    assertThat(controller.actions()).hasSize(5);
+    assertThat(controller.actions()).hasSize(6);
   }
 
   @Test
