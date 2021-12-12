diff --git a/fabric/fabric-core/src/main/scala/org/fusesource/fabric/service/ChildContainerProvider.java b/fabric/fabric-core/src/main/scala/org/fusesource/fabric/service/ChildContainerProvider.java
index 69e1061..a877a32 100644
--- a/fabric/fabric-core/src/main/scala/org/fusesource/fabric/service/ChildContainerProvider.java
+++ b/fabric/fabric-core/src/main/scala/org/fusesource/fabric/service/ChildContainerProvider.java
@@ -83,7 +83,7 @@
                     jvmOptsBuilder.append(" ").append(ENSEMBLE_SERVER_CONTAINER);
                 }
 
-                if (options.getJvmOpts() == null && !options.getJvmOpts().isEmpty()) {
+                if (options.getJvmOpts() != null && !options.getJvmOpts().isEmpty()) {
                     jvmOptsBuilder.append(" ").append(options.getJvmOpts());
                 }
 
