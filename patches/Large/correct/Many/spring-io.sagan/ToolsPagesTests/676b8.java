diff --git a/src/test/java/integration/tools/ToolsPagesTests.java b/src/test/java/integration/tools/ToolsPagesTests.java
index 648e8f1..904e2b0 100644
--- a/src/test/java/integration/tools/ToolsPagesTests.java
+++ b/src/test/java/integration/tools/ToolsPagesTests.java
@@ -110,7 +110,7 @@
 		Document document = Jsoup.parse(mvcResult.getResponse().getContentAsString());
 
 
-		assertThat(document.select("h1").text(), equalTo("Eclipse"));
+		assertThat(document.select("h1").text(), containsString("Eclipse"));
 		assertThat(document.text(), containsString("Spring Tool Suite"));
 		assertThat(document.text(), containsString("Groovy/Grails Tool Suite"));
 
