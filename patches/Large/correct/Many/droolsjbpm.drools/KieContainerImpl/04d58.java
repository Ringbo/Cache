diff --git a/drools-compiler/src/main/java/org/drools/compiler/kie/builder/impl/KieContainerImpl.java b/drools-compiler/src/main/java/org/drools/compiler/kie/builder/impl/KieContainerImpl.java
index 72f23d7..9a2d440 100644
--- a/drools-compiler/src/main/java/org/drools/compiler/kie/builder/impl/KieContainerImpl.java
+++ b/drools-compiler/src/main/java/org/drools/compiler/kie/builder/impl/KieContainerImpl.java
@@ -588,7 +588,7 @@
         }
     }
 
-    private void registerCalendars(KieSessionModelImpl kSessionModel, KieSession kSession) {
+    private void registerCalendars(KieSessionModel kSessionModel, KieSession kSession) {
         for (Map.Entry<String, String> entry : kSessionModel.getCalendars().entrySet()) {
             try {
                 Calendar calendar = (Calendar) getClassLoader().loadClass( entry.getValue() ).newInstance();
