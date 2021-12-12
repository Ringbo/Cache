diff --git a/sonar-core/src/test/java/org/sonar/core/i18n/DefaultI18nTest.java b/sonar-core/src/test/java/org/sonar/core/i18n/DefaultI18nTest.java
index dc3d4db..3c5bc0d 100644
--- a/sonar-core/src/test/java/org/sonar/core/i18n/DefaultI18nTest.java
+++ b/sonar-core/src/test/java/org/sonar/core/i18n/DefaultI18nTest.java
@@ -170,7 +170,7 @@
 
   @Test
   public void get_age_with_duration() {
-    assertThat(manager.age(Locale.ENGLISH, 130000)).isEqualTo("less than a minute");
+    assertThat(manager.age(Locale.ENGLISH, 10)).isEqualTo("less than a minute");
   }
 
   @Test
