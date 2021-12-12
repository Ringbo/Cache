diff --git a/dexlib2/src/main/java/org/jf/dexlib2/writer/builder/BuilderAnnotationSet.java b/dexlib2/src/main/java/org/jf/dexlib2/writer/builder/BuilderAnnotationSet.java
index 43ca745..ef9a9d6 100644
--- a/dexlib2/src/main/java/org/jf/dexlib2/writer/builder/BuilderAnnotationSet.java
+++ b/dexlib2/src/main/java/org/jf/dexlib2/writer/builder/BuilderAnnotationSet.java
@@ -39,7 +39,7 @@
 import java.util.Iterator;
 import java.util.Set;
 
-class BuilderAnnotationSet extends AbstractSet<BuilderAnnotation> {
+public class BuilderAnnotationSet extends AbstractSet<BuilderAnnotation> {
     public static final BuilderAnnotationSet EMPTY =
             new BuilderAnnotationSet(ImmutableSet.<BuilderAnnotation>of());
 
