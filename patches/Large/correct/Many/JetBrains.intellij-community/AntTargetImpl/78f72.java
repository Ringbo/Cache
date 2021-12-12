diff --git a/plugins/ant/src/com/intellij/lang/ant/psi/impl/AntTargetImpl.java b/plugins/ant/src/com/intellij/lang/ant/psi/impl/AntTargetImpl.java
index 6e98564..0c105c4 100644
--- a/plugins/ant/src/com/intellij/lang/ant/psi/impl/AntTargetImpl.java
+++ b/plugins/ant/src/com/intellij/lang/ant/psi/impl/AntTargetImpl.java
@@ -26,7 +26,7 @@
 
   @NonNls
   public String toString() {
-    @NonNls StringBuilder builder = StringBuilderSpinAllocator.alloc();
+    @NonNls final StringBuilder builder = StringBuilderSpinAllocator.alloc();
     try {
       builder.append("AntTarget:[");
       builder.append(getName());
@@ -68,9 +68,9 @@
         myDependsTargets = EMPTY_TARGETS;
       }
       else {
-        AntProject project = (AntProject)getAntParent();
+        final AntProject project = getAntProject();
         final List<AntTarget> targets = new ArrayList<AntTarget>();
-        for (String name : depends.split(",")) {
+        for (final String name : depends.split(",")) {
           final AntTarget antTarget = project.getTarget(name);
           if (antTarget != null) {
             targets.add(antTarget);
