diff --git a/compiler/backend/src/org/jetbrains/jet/cli/jvm/compiler/TipsManager.java b/compiler/backend/src/org/jetbrains/jet/cli/jvm/compiler/TipsManager.java
index cc341a2..9c625a8 100644
--- a/compiler/backend/src/org/jetbrains/jet/cli/jvm/compiler/TipsManager.java
+++ b/compiler/backend/src/org/jetbrains/jet/cli/jvm/compiler/TipsManager.java
@@ -98,7 +98,7 @@
                 return excludeNonPackageDescriptors(resolutionScope.getAllDescriptors());
             }
             else {
-                HashSet<DeclarationDescriptor> descriptorsSet = Sets.newHashSet();
+                Collection<DeclarationDescriptor> descriptorsSet = Sets.newHashSet();
 
                 ArrayList<ReceiverDescriptor> result = new ArrayList<ReceiverDescriptor>();
                 resolutionScope.getImplicitReceiversHierarchy(result);
