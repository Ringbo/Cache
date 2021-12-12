diff --git a/languagetool-http-client/src/test/java/org/languagetool/remote/RemoteLanguageToolIntegrationTest.java b/languagetool-http-client/src/test/java/org/languagetool/remote/RemoteLanguageToolIntegrationTest.java
index 80f3b1f..9af6998 100644
--- a/languagetool-http-client/src/test/java/org/languagetool/remote/RemoteLanguageToolIntegrationTest.java
+++ b/languagetool-http-client/src/test/java/org/languagetool/remote/RemoteLanguageToolIntegrationTest.java
@@ -86,7 +86,7 @@
 
       CheckConfiguration enabledConfig = new CheckConfigurationBuilder("en").enabledRuleIds("EN_A_VS_AN").build();
       RemoteResult result3 = lt.check("A sentence with a error, and and another one", enabledConfig);
-      assertThat(result1.getMatches().size(), is(2));
+      assertThat(result3.getMatches().size(), is(2));
 
       CheckConfiguration enabledOnlyConfig = new CheckConfigurationBuilder("en").enabledRuleIds("EN_A_VS_AN").enabledOnly().build();
       RemoteResult result4 = lt.check("A sentence with a error, and and another one", enabledOnlyConfig);
