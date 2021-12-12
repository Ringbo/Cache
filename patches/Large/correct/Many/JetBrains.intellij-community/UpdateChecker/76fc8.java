diff --git a/source/com/intellij/openapi/updateSettings/impl/UpdateChecker.java b/source/com/intellij/openapi/updateSettings/impl/UpdateChecker.java
index fd78905..8c9f7dc 100644
--- a/source/com/intellij/openapi/updateSettings/impl/UpdateChecker.java
+++ b/source/com/intellij/openapi/updateSettings/impl/UpdateChecker.java
@@ -124,7 +124,7 @@
     final String availBuild = document.getRootElement().getChild("build").getTextTrim();
     final String availVersion = document.getRootElement().getChild("version").getTextTrim();
     String ourBuild = ApplicationInfo.getInstance().getBuildNumber().trim();
-    if ("__BUILD_NUMBER__".equals(ourBuild)) ourBuild = Integer.toString(Integer.MAX_VALUE);
+    if ("__BUILD_NUMBER__".equals(ourBuild)) ourBuild = Integer.toString(Integer.MIN_VALUE);
 
     if (LOG.isDebugEnabled()) {
       LOG.debug("build available:'" + availBuild + "' ourBuild='" + ourBuild + "' ");
@@ -199,7 +199,7 @@
   }
 
   public static class NewVersion {
-    private static int latestBuild;
+    private int latestBuild;
     private String latestVersion;
 
     public int getLatestBuild() {
