diff --git a/sagan-common/src/test/java/sagan/tools/support/ToolSuiteXmlParsingTests.java b/sagan-common/src/test/java/sagan/tools/support/ToolSuiteXmlParsingTests.java
index 891b09a..957a230 100644
--- a/sagan-common/src/test/java/sagan/tools/support/ToolSuiteXmlParsingTests.java
+++ b/sagan-common/src/test/java/sagan/tools/support/ToolSuiteXmlParsingTests.java
@@ -18,9 +18,9 @@
 
         ToolSuiteXml toolSuiteXml = serializer.readValue(responseXml, ToolSuiteXml.class);
         assertThat(toolSuiteXml.getReleases(), notNullValue());
-        assertThat(toolSuiteXml.getReleases().size(), equalTo(2));
+        assertThat(toolSuiteXml.getReleases().size(), equalTo(4));
         Release release = toolSuiteXml.getReleases().get(0);
-        assertThat(release.getDownloads().size(), equalTo(11));
+        assertThat(release.getDownloads().size(), equalTo(7));
         assertThat(release.getWhatsnew(), notNullValue());
     }
 }
