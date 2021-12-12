diff --git a/fabric/fabric-client/src/main/java/org/fusesource/fabric/jolokia/facade/facades/ProfileFacade.java b/fabric/fabric-client/src/main/java/org/fusesource/fabric/jolokia/facade/facades/ProfileFacade.java
index f97aa37..e09fb48 100644
--- a/fabric/fabric-client/src/main/java/org/fusesource/fabric/jolokia/facade/facades/ProfileFacade.java
+++ b/fabric/fabric-client/src/main/java/org/fusesource/fabric/jolokia/facade/facades/ProfileFacade.java
@@ -163,27 +163,27 @@
 
     @Override
     public void setBundles(List<String> strings) {
-        Void v = Helpers.exec(j4p, "setProfileBundles(java.lang.String, java.lang.String, java.util.List)", id, strings);
+        Void v = Helpers.exec(j4p, "setProfileBundles(java.lang.String, java.lang.String, java.util.List)", versionId, id, strings);
     }
 
     @Override
     public void setFabs(List<String> strings) {
-        Void v = Helpers.exec(j4p, "setProfileFabs(java.lang.String, java.lang.String, java.util.List)", id, strings);
+        Void v = Helpers.exec(j4p, "setProfileFabs(java.lang.String, java.lang.String, java.util.List)", versionId, id, strings);
     }
 
     @Override
     public void setFeatures(List<String> strings) {
-        Void v = Helpers.exec(j4p, "setProfileFeatures(java.lang.String, java.lang.String, java.util.List)", id, strings);
+        Void v = Helpers.exec(j4p, "setProfileFeatures(java.lang.String, java.lang.String, java.util.List)", versionId, id, strings);
     }
 
     @Override
     public void setRepositories(List<String> strings) {
-        Void v = Helpers.exec(j4p, "setProfileRepositories(java.lang.String, java.lang.String, java.util.List)", id, strings);
+        Void v = Helpers.exec(j4p, "setProfileRepositories(java.lang.String, java.lang.String, java.util.List)", versionId, id, strings);
     }
 
     @Override
     public void setOverrides(List<String> strings) {
-        Void v = Helpers.exec(j4p, "setProfileOverrides(java.lang.String, java.lang.String, java.util.List)", id, strings);
+        Void v = Helpers.exec(j4p, "setProfileOverrides(java.lang.String, java.lang.String, java.util.List)", versionId, id, strings);
     }
 
     @Override
