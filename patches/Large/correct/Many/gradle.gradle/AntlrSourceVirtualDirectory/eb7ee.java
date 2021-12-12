diff --git a/subprojects/antlr/src/main/groovy/org/gradle/api/plugins/antlr/AntlrSourceVirtualDirectory.java b/subprojects/antlr/src/main/groovy/org/gradle/api/plugins/antlr/AntlrSourceVirtualDirectory.java
index 68919fb..65a0cae 100644
--- a/subprojects/antlr/src/main/groovy/org/gradle/api/plugins/antlr/AntlrSourceVirtualDirectory.java
+++ b/subprojects/antlr/src/main/groovy/org/gradle/api/plugins/antlr/AntlrSourceVirtualDirectory.java
@@ -22,18 +22,17 @@
 /**
  * Contract for a Gradle "convention object" that acts as a handler for what I call a virtual directory mapping,
  * injecting a virtual directory named 'antlr' into the project's various {@link org.gradle.api.tasks.SourceSet source
- * sets}.  Its implementation gets pushed onto the {@link org.gradle.api.internal.DynamicObjectAware} portion of the
- * source set under the name 'antlr'.
+ * sets}.
  */
 public interface AntlrSourceVirtualDirectory {
-    public static final String NAME = "antlr";
+    String NAME = "antlr";
 
     /**
      * All Antlr source for this source set.
      *
      * @return The Antlr source.  Never returns null.
      */
-    public SourceDirectorySet getAntlr();
+    SourceDirectorySet getAntlr();
 
     /**
      * Configures the Antlr source for this set. The given closure is used to configure the {@link org.gradle.api.file.SourceDirectorySet} (see
@@ -42,6 +41,6 @@
      * @param configureClosure The closure to use to configure the Antlr source.
      * @return this
      */
-    public AntlrSourceVirtualDirectory antlr(Closure configureClosure);
+    AntlrSourceVirtualDirectory antlr(Closure configureClosure);
 
 }
