diff --git a/dexlib2/src/main/java/org/jf/dexlib2/dexbacked/raw/ClassDefItem.java b/dexlib2/src/main/java/org/jf/dexlib2/dexbacked/raw/ClassDefItem.java
index 08981ff..9ded6d2 100644
--- a/dexlib2/src/main/java/org/jf/dexlib2/dexbacked/raw/ClassDefItem.java
+++ b/dexlib2/src/main/java/org/jf/dexlib2/dexbacked/raw/ClassDefItem.java
@@ -75,7 +75,7 @@
                 out.annotate(4, "access_flags = 0x%x: %s", accessFlags,
                         Joiner.on('|').join(AccessFlags.getAccessFlagsForClass(accessFlags)));
 
-                int superclassIndex = dexFile.readSmallUint(out.getCursor());
+                int superclassIndex = dexFile.readOptionalUint(out.getCursor());
                 out.annotate(4, "superclass_idx = %s",
                         TypeIdItem.getOptionalReferenceAnnotation(dexFile, superclassIndex));
 
