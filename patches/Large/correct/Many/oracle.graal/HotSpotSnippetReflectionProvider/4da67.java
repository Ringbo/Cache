diff --git a/graal/com.oracle.graal.hotspot/src/com/oracle/graal/hotspot/meta/HotSpotSnippetReflectionProvider.java b/graal/com.oracle.graal.hotspot/src/com/oracle/graal/hotspot/meta/HotSpotSnippetReflectionProvider.java
index 54268f8..c38520e 100644
--- a/graal/com.oracle.graal.hotspot/src/com/oracle/graal/hotspot/meta/HotSpotSnippetReflectionProvider.java
+++ b/graal/com.oracle.graal.hotspot/src/com/oracle/graal/hotspot/meta/HotSpotSnippetReflectionProvider.java
@@ -78,7 +78,9 @@
     private ResolvedJavaType configType;
 
     public Object getInjectedNodeIntrinsicParameter(ResolvedJavaType type) {
-        if (wordTypesType == null) {
+        // Need to test all fields since there no guarantee under the JMM
+        // about the order in which these fields are written.
+        if (configType == null || wordTypesType == null || configType == null) {
             MetaAccessProvider metaAccess = runtime.getHostProviders().getMetaAccess();
             wordTypesType = metaAccess.lookupJavaType(runtime.getHostProviders().getWordTypes().getClass());
             runtimeType = metaAccess.lookupJavaType(runtime.getClass());
