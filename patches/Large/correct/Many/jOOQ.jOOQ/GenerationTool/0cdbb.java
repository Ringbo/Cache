diff --git a/jOOQ-codegen/src/main/java/org/jooq/util/GenerationTool.java b/jOOQ-codegen/src/main/java/org/jooq/util/GenerationTool.java
index d37664c..e74ecc6 100644
--- a/jOOQ-codegen/src/main/java/org/jooq/util/GenerationTool.java
+++ b/jOOQ-codegen/src/main/java/org/jooq/util/GenerationTool.java
@@ -362,7 +362,7 @@
             if (StringUtils.isBlank(g.getTarget().getPackageName()))
                 g.getTarget().setPackageName("org.jooq.generated");
             if (StringUtils.isBlank(g.getTarget().getDirectory()))
-                g.getTarget().setPackageName("target/generated-sources/jooq");
+                g.getTarget().setDirectory("target/generated-sources/jooq");
 
             generator.setTargetPackage(g.getTarget().getPackageName());
             generator.setTargetDirectory(g.getTarget().getDirectory());
