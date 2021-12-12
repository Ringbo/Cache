diff --git a/sql/src/main/java/io/crate/metadata/ReferenceInfo.java b/sql/src/main/java/io/crate/metadata/ReferenceInfo.java
index d3715a4..671810b 100644
--- a/sql/src/main/java/io/crate/metadata/ReferenceInfo.java
+++ b/sql/src/main/java/io/crate/metadata/ReferenceInfo.java
@@ -82,7 +82,7 @@
     @Override
     public String toString() {
         return Objects.toStringHelper(this)
-                .add("granularity", type)
+                .add("granularity", granularity)
                 .add("ident", ident)
                 .add("type", type)
                 .toString();
